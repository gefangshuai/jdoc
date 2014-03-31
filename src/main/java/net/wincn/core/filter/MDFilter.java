package net.wincn.core.filter;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串过滤器
 * Author: gefangshuai
 * Create: 2014-03-31 13:47
 */
public class MDFilter {

    private String string;  //要过滤的字符串

    public MDFilter() {
    }

    public MDFilter(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    /**
     * 过滤字符串
     * @return
     */
    public String filter() {
        return filterConfig();
    }

    /**
     * 将yaml配置信息过滤掉
     * @return
     */
    private String filterConfig(){
        String cnf = StringUtils.substringBetween(string, "---", "---");
        string = StringUtils.remove(string,"---"+cnf+"---").trim();
        return string;
    }
}
