package com.jixiang52002.recycleviewdemo.entites;

/**
 * 广告类
 */
public class Ad {
    private String image;
    private String url;

    public Ad(String image, String url) {
        this.image = image;
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
