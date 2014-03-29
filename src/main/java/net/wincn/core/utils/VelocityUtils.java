package net.wincn.core.utils;

import com.jfinal.kit.PathKit;
import net.wincn.core.constant.AppConstant;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Author: gefangshuai
 * Create: 2014-03-29 17:50
 */
public class VelocityUtils {

    private static VelocityEngine getVelocityEngine(){
        //初始化参数
        Properties properties=new Properties();
        //设置velocity资源加载方式为file
        properties.setProperty("resource.loader", "file");
        //设置velocity资源加载方式为file时的处理类
        properties.setProperty("file.resource.loader.class",
                "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
        //实例化一个VelocityEngine对象
        VelocityEngine velocityEngine=new VelocityEngine(properties);
        return velocityEngine;
    }

    /**
     * 生成html文件
     * @param context
     * @param docPath
     * @throws IOException
     */
    public static void generateHtml(VelocityContext context, String docPath) throws IOException {
        VelocityEngine velocityEngine = getVelocityEngine();
        FileWriter out =new FileWriter(docPath);
        velocityEngine.mergeTemplate(PathKit.getWebRootPath()+"/"+ AppConstant.POST_TEMPLATE_PATH, "utf-8", context, out);
        out.close();
    }
}
