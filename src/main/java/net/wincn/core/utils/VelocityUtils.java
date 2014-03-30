package net.wincn.core.utils;

import net.wincn.core.bean.Doc;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Author: gefangshuai
 * Create: 2014-03-29 17:50
 */
public class VelocityUtils {
     static {
        Properties properties=new Properties();
        properties.setProperty("resource.loader", "class");
        //设置velocity资源加载方式为file时的处理类
        properties.setProperty("class.resource.loader.class",
                "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        properties.setProperty("class.resource.loader.cache,", "true");
        properties.setProperty("directive.parse.max.depth", "10");
        //实例化一个VelocityEngine对象
        Velocity.init(properties);
    }

    /**
     * 生成html文件
     * @param context
     * @throws IOException
     */
    public static void generateDoc(VelocityContext context, Doc doc) throws IOException {
        File distFile = new File(doc.getPath());
        if(!distFile.getParentFile().exists())
            distFile.getParentFile().mkdirs();
        FileWriter out =new FileWriter(distFile);

        Velocity.mergeTemplate(AppConfigUtils.getPostTemplate(doc), "utf-8", context, out);
        out.close();
    }
}
