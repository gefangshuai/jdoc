package net.wincn.core.bean;

import java.util.List;

/**
 * 文档信息
 * Author: gefangshuai
 * Create: 2014-03-29 16:41
 */
public class Doc {
    private String title;   //标题
    private String description; //描述
    private String directory;   //目录
    private String link;    //连接
    private List<Menu> menu;  //所属菜单
    private List<Slider> sliderList;    //侧边导航

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

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public List<Slider> getSliderList() {
        return sliderList;
    }

    public void setSliderList(List<Slider> sliderList) {
        this.sliderList = sliderList;
    }
}
