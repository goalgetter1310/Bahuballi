package com.firebaseplayer.model;

public class ModelVideoItem {
    public int imageResId;
    public String titleResId;
    public String desc;

    public ModelVideoItem(int imageResId, String titleResId,String desc){
        this.imageResId = imageResId;
        this.titleResId = titleResId;
        this.desc=desc;
    }
}