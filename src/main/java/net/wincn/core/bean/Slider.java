package net.wincn.core.bean;

import java.util.List;

/**
 * 侧边导航
 * Author: gefangshuai
 * Create: 2014-03-29 16:47
 */
public class Slider {
    private String title;   //标题
    private int order;  //顺序号
    private Doc doc;    //所属文章
    private List<Slider> sliders; //子级

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }

    public List<Slider> getSliders() {
        return sliders;
    }

    public void setSliders(List<Slider> sliders) {
        this.sliders = sliders;
    }
}
