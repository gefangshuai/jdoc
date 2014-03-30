package net.wincn.controller;

import com.jfinal.core.Controller;
import com.jfinal.kit.PathKit;

import java.io.File;

/**
 * Author: gefangshuai
 * Create: 2014-03-29 14:39
 */
public class IndexController extends Controller{

    private static int postCount = 0;

    public void index(){
        getPostCount();
        setAttr("postCount", postCount);
        setAttr("webRoot", PathKit.getWebRootPath());
    }

    public void getPostCount() {
        String postDir = PathKit.getWebRootPath()+"/post";
        postCount = new File(postDir).listFiles().length;
    }

}
