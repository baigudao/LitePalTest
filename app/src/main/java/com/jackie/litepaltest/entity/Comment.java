package com.jackie.litepaltest.entity;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2016/12/21.
 */
public class Comment extends DataSupport {

    private int id;

    private String content;

    private News news;

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
