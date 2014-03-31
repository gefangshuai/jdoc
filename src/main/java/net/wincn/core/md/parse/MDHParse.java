package net.wincn.core.md.parse;

import net.wincn.core.md.MDParse;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * 解析html的h1~h6标签
 * Author: gefangshuai
 * Create: 2014-03-30 12:08
 */
public class MDHParse extends MDParse {

    @Override
    public String parse(String mdString) {
        if (StringUtils.isNotBlank(mdString)) {
            if (mdString.startsWith("######")) {
                this.setLevel(6);
                return parse(mdString, 6);
            }else if(mdString.startsWith("#####")) {
                this.setLevel(5);
                return parse(mdString, 5);
            }else if(mdString.startsWith("####")) {
                this.setLevel(4);
                return parse(mdString, 4);
            }else if(mdString.startsWith("###")) {
                this.setLevel(3);
                return parse(mdString, 3);
            }else if(mdString.startsWith("##")) {
                this.setLevel(2);
                return parse(mdString, 2);
            }else if(mdString.startsWith("#")) {
                this.setLevel(1);
                return parse(mdString, 1);
            }
        }
        return "";
    }

    /**
     * 判断是否为h1标记
     * @param string
     * @return
     */
    public static boolean isH1(String string){
        if(StringUtils.isNotBlank(string) && string.startsWith("#") && !string.substring(1,2).equals("#"))
            return true;
        return false;
    }

    public String parse(String mdString, int level) {
        return mdString.substring(level).trim();
    }

    @Test
    public void testParse() {
        MDParse mdParse = new MDHParse();
        Assert.assertEquals("<h1>aaa</h1>", mdParse.parse("# aaa"));
        Assert.assertEquals("<h2>aaa</h2>", mdParse.parse("## aaa"));
        Assert.assertEquals("<h3>aaa</h3>", mdParse.parse("### aaa"));
        Assert.assertEquals("<h4>aaa</h4>", mdParse.parse("#### aaa"));
        Assert.assertEquals("<h5>aaa</h5>", mdParse.parse("##### aaa"));
        Assert.assertEquals("<h6>aaa</h6>", mdParse.parse("###### aaa"));

        Assert.assertEquals("<h1>aaa</h1>", mdParse.parse("#aaa"));
        Assert.assertEquals("<h2>aaa</h2>", mdParse.parse("##aaa"));
        Assert.assertEquals("<h3>aaa</h3>", mdParse.parse("###aaa"));
        Assert.assertEquals("<h4>aaa</h4>", mdParse.parse("####aaa"));
        Assert.assertEquals("<h5>aaa</h5>", mdParse.parse("#####aaa"));
        Assert.assertEquals("<h6>aaa</h6>", mdParse.parse("######aaa"));
    }

}
