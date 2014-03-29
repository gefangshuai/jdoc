package net.wincn.core.engine;

import net.wincn.core.utils.DocFileUtils;

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
    public void generate(){
        try {
            DocFileUtils.copyResources();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
