package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.news_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleTextView = convertView.findViewById(R.id.title_textView);
        titleTextView.setText(currentNews.getTitle());

        TextView sectionTextView = convertView.findViewById(R.id.section_textView);
        sectionTextView.setText(currentNews.getSection());

        String date;
        String time;
        String originalDate = currentNews.getDate();
        TextView dateTextView = convertView.findViewById(R.id.date_textView);
        TextView timeTextView = convertView.findViewById(R.id.time_textView);

        String[] parts = originalDate.split("T");
        date = parts[0];
        time = parts[1];
        dateTextView.setText(date);
        timeTextView.setText(time.substring(0,5));

        TextView authorTextView = convertView.findViewById(R.id.author_textView);
        authorTextView.setText(currentNews.getAuthorName());

        return convertView;
    }
}
