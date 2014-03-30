package net.wincn.core.bean;

import java.util.List;

/**
 * 菜单
 * Author: gefangshuai
 * Create: 2014-03-29 16:46
 */
public class Menu {
    private String title;    //名称
    private List<Menu> children;    //子菜单

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Menu menu = (Menu) o;

        if (!title.equals(menu.title))
            return false;

        return true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }
}
