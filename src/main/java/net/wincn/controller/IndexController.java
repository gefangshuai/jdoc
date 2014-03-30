package net.wincn.controller;

import com.jfinal.core.Controller;
import com.jfinal.kit.PathKit;
import net.wincn.core.constant.AppConstant;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: gefangshuai
 * Create: 2014-03-29 14:39
 */
public class IndexController extends Controller {

    private static int postCount = 0;

    public void index() {
        getPostCount();
        setAttr("postCount", postCount);
        setAttr("webRoot", PathKit.getWebRootPath());
        setAttr("htmls", getHtmls());
    }

    public void getPostCount() {
        String postDir = AppConstant.POST_DIR_PATH;
        postCount = new File(postDir).listFiles().length;
    }

    public List<String> getHtmls() {
        List<String> paths = new ArrayList<String>();
        String mdPath = AppConstant.DOC_PATH;
        List<File> files = (List<File>) FileUtils.listFiles(new File(mdPath), new String[]{"html"}, true);
        for (File file : files) {
            paths.add(file.getAbsolutePath().substring(PathKit.getWebRootPath().length()));
        }
        return paths;
    }
}
