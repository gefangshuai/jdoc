package net.wincn.core.utils;

import com.jfinal.kit.PathKit;
import net.wincn.core.bean.Config;
import net.wincn.core.constant.AppConstant;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 获取md文件的工具类
 * Author: gefangshuai
 * Create: 2014-03-29 16:54
 */
public class DocFileUtils {

    private static final String MD_PATH = PathKit.getWebRootPath()+"/"+ AppConstant.POST_PATH;

    /**
     * 获取所有markdown文件列表
     * @return
     */
    public static File[] listMdFiles(){
        return new File(MD_PATH).listFiles();
    }

    /**
     * 将资源文件拷贝到_doc目录下
     */
    public static void copyResources() throws IOException {
        String sourceDir = getResourcesPath();
        String destDir = getDocPath();
        FileUtils.copyDirectory(new File(sourceDir), new File(destDir), true);
    }

    public static String getDocPath() {
        return PathKit.getWebRootPath()+"/"+AppConstant.DOC_PATH;
    }

    public static String getResourcesPath() {
        return PathKit.getWebRootPath()+"/"+AppConstant.INCLUDE_PATH+"/themes/"+ Config.themeName;
    }
}
