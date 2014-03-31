package net.wincn.core.bean;

import net.wincn.core.constant.AppConstant;

import java.io.File;
import java.util.List;

/**
 * 文档信息
 * Author: gefangshuai
 * Create: 2014-03-29 16:41
 */
public class Doc {
    private String title;   //标题
    private String description; //描述
    private String path;   //目录
    private String link;    //连接
    private Menu menu;  //所属菜单

    private String layout;  //布局文件
    private String ctx; //上下文，如../../
    private List<Section> sections; //每节内容


    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(File mdFile) {
        String path = AppConstant.DOC_PATH + "/" + mdFile.getName().replace("-", "/").replace(".md", ".html");

        this.path = path;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }


    public String getCtx() {
        String _ctx = path.substring(path.indexOf("/_doc/")+5);
        int length = _ctx.split("/").length;
        _ctx = "";
        for (int i = 1; i<length - 1; i++)
            _ctx += "../";
        return _ctx;
    }

    public void setCtx(String ctx) {
        this.ctx = ctx;
    }
}
