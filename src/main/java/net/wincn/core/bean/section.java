package net.wincn.core.bean;

/**
 * Author: gefangshuai
 * Create: 2014-03-30 15:36
 */
public class Section {
    private String id;
    private String title;   //标题
    private String content; //内容

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
