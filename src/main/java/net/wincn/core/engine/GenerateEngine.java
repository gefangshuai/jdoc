package net.wincn.core.engine;

import net.wincn.core.bean.Doc;
import net.wincn.core.constant.AppConstant;
import net.wincn.core.filter.MDFilter;
import net.wincn.core.md.MDParse;
import net.wincn.core.md.parse.MDHParse;
import net.wincn.core.utils.AppConfigUtils;
import net.wincn.core.utils.DocFileUtils;
import net.wincn.core.utils.VelocityUtils;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.VelocityContext;
import org.ho.yaml.Yaml;

import java.io.File;
import java.io.IOException;

/**
 * 文件产生引擎
 * Author: gefangshuai
 * Create: 2014-03-29 18:16
 */
public class GenerateEngine {
    private static GenerateEngine instance;

    private GenerateEngine() {

    }

    public static synchronized GenerateEngine getInstance() {
        if (instance == null) {
            instance = new GenerateEngine();
        }
        return instance;
    }

    /**
     * 生成文件
     */
    public void generate() {
        try {

            FileUtils.deleteDirectory(new File(AppConstant.DOC_PATH));

            DocFileUtils.copyResources();

            for (File mdFile : DocFileUtils.listMdFiles()) {
                Doc doc = Yaml.loadType(mdFile, Doc.class);
                parseDoc(doc, mdFile);
                VelocityUtils.generateDoc(getContext(doc), doc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 封装doc
     *
     * @param doc
     * @param mdFile
     */
    private void parseDoc(Doc doc, File mdFile) {
        doc.setPath(mdFile);
        String mdContent = MDParse.getMDString(mdFile);
        MDFilter filter = new MDFilter(mdContent);
        mdContent = filter.filter();

        packSections(doc, mdContent);

    }

    /**
     * 解析Sections到Doc中
     * @param doc
     * @param mdContent
     */
    private void packSections(Doc doc, String mdContent) {
        SectionGenerator generator = SectionGenerator.getInstance();
        generator.initSections();

        MDParse parse = new MDHParse();
        String[] arrs = mdContent.split("\n");
        for (String a : arrs) {
            if (MDHParse.isH1(a)){
                generator.getNewSection().setTitle(parse.parse(a));
            }else{
                String content = generator.getSection().getContent();
                content = "<p>"+content+"</p>";
                content += a;
                generator.getSection().setContent(content);
            }
        }
        doc.setSections(generator.getSections());
    }

    private VelocityContext getContext(Doc doc) {
        VelocityContext context = new VelocityContext();
        context.put("theme", AppConfigUtils.getTheme());
        context.put("site", AppConfigUtils.getSite());
        context.put("menus", AppConfigUtils.getMenus());
        context.put("ctx", "");  //TODO 预留功能，目前只支持根目录下生成html。

        context.put("doc", doc);
        return context;
    }
}
