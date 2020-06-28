package com.example.mustafa.myapplication;

import androidx.annotation.NonNull;

public class Duyuru {
    private   String title;
    private  String link;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public  Duyuru(String title,String link)
    {
        this.link=link;
        this.title=title;

    }

    @NonNull
    @Override
    public String toString() {

        return getLink()+"\n"+getTitle();
    }
}
