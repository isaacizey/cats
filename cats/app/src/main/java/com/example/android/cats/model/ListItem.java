package com.example.android.cats.model;

/**
 * Created by ISAAC on 2/16/2017.
 */

public class ListItem {
    public String title;
    public int imageResId;
    public String subTitle;


    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
