package com.example.newsapp;

public class News {
    private String mTitle;

    private String mSection;

    private String mDate;

    private String mUrl;

    private String mAuthorName;

    public News(String title, String section, String date, String url, String authorName){
        mTitle = title;
        mSection = section;
        mDate = date;
        mUrl = url;
        mAuthorName = authorName;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getSection(){
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getAuthorName(){
        return mAuthorName;
    }
}
