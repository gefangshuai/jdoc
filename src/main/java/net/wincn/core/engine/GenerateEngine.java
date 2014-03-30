package net.wincn.core.engine;

import net.wincn.core.bean.Doc;
import net.wincn.core.utils.AppConfigUtils;
import net.wincn.core.utils.DocFileUtils;
import net.wincn.core.utils.VelocityUtils;
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
            DocFileUtils.copyResources();

            for (File mdFile : DocFileUtils.listMdFiles()) {
                Doc doc = Yaml.loadType(mdFile, Doc.class);
                doc.setPath(mdFile);
                VelocityUtils.generateDoc(getContext(doc), doc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private VelocityContext getContext(Doc doc) {
        VelocityContext context = new VelocityContext();
        context.put("theme", AppConfigUtils.getTheme());
        context.put("site", AppConfigUtils.getSite());
        context.put("ctx", doc.getCtx());

        context.put("doc", doc);
        context.put("menu", doc.getMenu());
        context.put("slider", doc.getSliderList());
        return context;
    }
}
