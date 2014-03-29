package velocity;

import net.wincn.core.bean.Doc;
import net.wincn.core.bean.Theme;
import net.wincn.core.constant.AppConstant;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Author: gefangshuai
 * Create: 2014-03-29 18:00
 */
public class GenerateHtml {
    public static void main(String[] args) throws IOException {
        //初始化参数
        Properties properties=new Properties();
        //设置velocity资源加载方式为file
        properties.setProperty("resource.loader", "file");
        //设置velocity资源加载方式为file时的处理类
        properties.setProperty("file.resource.loader.class",
                "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
        //实例化一个VelocityEngine对象
        VelocityEngine velocityEngine=new VelocityEngine(properties);
        //实例化一个VelocityContext
        VelocityContext context=new VelocityContext();
        //向VelocityContext中放入键值
        Doc doc = new Doc();
        doc.setTitle("这是文档的标题");
        doc.setDescription("文档的说明在这里");

        Theme theme = new Theme();
        theme.setName("bs2");

        context.put("theme", theme);
        context.put("doc", doc);
        //实例化一个StringWriter
        FileWriter out =new FileWriter("d:/1.html");
        //从vm目录下加载hello.vm模板,在eclipse工程中该vm目录与src目录平级
        velocityEngine.mergeTemplate(AppConstant.POST_TEMPLATE, "utf-8", context, out);
        out.close();
    }
}
