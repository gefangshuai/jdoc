import net.wincn.core.bean.Doc;
import net.wincn.core.bean.Section;
import net.wincn.core.engine.SectionGenerator;
import net.wincn.core.md.MDParse;
import net.wincn.core.md.parse.MDHParse;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 测试markdown文件读取功能
 * Author: gefangshuai
 * Create: 2014-03-31 12:24
 */
public class TestMDParse {

    @Test
    public void testParse() throws IOException {
        String result = FileUtils.readFileToString(new File("D:\\idea_workspace\\jdoc\\src\\main\\webapp\\post\\hello.md"));
        String cnf = StringUtils.substringBetween(result, "---", "---");
        result = StringUtils.remove(result,"---"+cnf+"---").trim();
        String[] arrs = result.split("\n");

        Doc doc = new Doc();
        SectionGenerator generator = SectionGenerator.getInstance();
        generator.initSections();

        MDParse parse = new MDHParse();

        for (String a : arrs) {
            if (MDHParse.isH1(a)){
                generator.getNewSection().setTitle(parse.parse(a));
            }else{
                String content = generator.getSection().getContent();
                content += a;
                generator.getSection().setContent(content);
            }
        }
        doc.setSections(generator.getSections());

        for (Section section : doc.getSections()) {
            System.out.println(section);
        }
    }
}
