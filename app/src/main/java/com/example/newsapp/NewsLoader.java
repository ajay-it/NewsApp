package com.example.newsapp;

import android.content.Context;

import android.content.AsyncTaskLoader;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    private String mUrl;

    public NewsLoader(Context context, String url){
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if(mUrl == null){
            return null;
        }
        // Perform the network request, parse the response, and extract a list of news.
        List<News> news = QueryUtils.fetchNewsData(mUrl);
        return news;
    }
}
