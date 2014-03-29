package net.wincn.core.bean;

import java.util.List;

/**
 * 菜单
 * Author: gefangshuai
 * Create: 2014-03-29 16:46
 */
public class Menu {
    private String title;    //名称
    private Doc doc;    //关联文章
    private List<Menu> menuList;    //子菜单

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }
}
