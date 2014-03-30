package net.wincn.core.utils;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Author: gefangshuai
 * Create: 2014-03-29 17:50
 */
public class VelocityUtils {
    private static void init(){
        Properties properties=new Properties();
        properties.setProperty("resource.loader", "class");
        //设置velocity资源加载方式为file时的处理类
        properties.setProperty("class.resource.loader.class",
                "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        properties.setProperty("directive.parse.max.depth", "10");
        //实例化一个VelocityEngine对象
        Velocity.init(properties);
    }

    /**
     * 生成html文件
     * @param context
     * @throws IOException
     */
    public static void generatePost(VelocityContext context) throws IOException {
        init();
        FileWriter out =new FileWriter(AppConfigUtils.getDocOutPath());
        Velocity.mergeTemplate(AppConfigUtils.getPostTemplate().replace("\\","/"), "utf-8", context, out);
        out.close();
    }
}
