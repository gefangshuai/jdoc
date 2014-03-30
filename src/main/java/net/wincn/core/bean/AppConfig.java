package net.wincn.core.bean;

import java.util.List;

/**
 * 配置信息(已给出了默认值)
 * Author: gefangshuai
 * Create: 2014-03-29 18:21
 */
public class AppConfig {
    public  String site = "JDOC";    //站点名称
    public  String theme = "bs2";   //主题名称
    public  String postVM = "_layout/post.vm";
    public List<Menu> menus;    //所有菜单配置

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getPostVM() {
        return postVM;
    }

    public void setPostVM(String postVM) {
        this.postVM = postVM;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
