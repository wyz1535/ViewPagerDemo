package com.leyifu.viewpagerdemo.bean;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
public class    NewsInfo {
    private int img;
    private String title;
    private int imaPoint;

    public NewsInfo(int img, String title, int imaPoint) {
        this.img = img;
        this.title = title;
        this.imaPoint = imaPoint;
    }

    public NewsInfo() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImaPoint() {
        return imaPoint;
    }
    public void setImaPoint(int imaPoint) {
        this.imaPoint = imaPoint;
    }
}
