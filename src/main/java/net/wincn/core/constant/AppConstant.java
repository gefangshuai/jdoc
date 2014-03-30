package net.wincn.core.constant;

import com.jfinal.kit.PathKit;

/**
 * 定义了程序所有的常量
 * Author: gefangshuai
 * Create: 2014-03-29 16:57
 */
public class AppConstant {
    public static final String DOC_NAME = "_doc";
    public static final String DOC_PATH = PathKit.getWebRootPath()+"/" + DOC_NAME;

    public static final String INCLUDE_NAME = "_include";
    public static final String INCLUDE_PATH = PathKit.getWebRootPath()+"/"+INCLUDE_NAME;

    public static final String POST_DIR_NAME = "post";
    public static final String POST_DIR_PATH = PathKit.getWebRootPath()+"/"+POST_DIR_NAME;

}
