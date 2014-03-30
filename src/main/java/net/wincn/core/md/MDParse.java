package net.wincn.core.md;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Author: gefangshuai
 * Create: 2014-03-30 11:26
 */
public abstract class MDParse {

    /**
     * 将md文件读取成字符串数组，以回车分隔。
     * @param mdFile
     * @return
     */
    public String[] getMDString(File mdFile){
        try {
            return FileUtils.readFileToString(mdFile).split("\n");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 将markdown解析成html
     * @param mdString
     * @return
     */
    public abstract String parse(String mdString);

}
