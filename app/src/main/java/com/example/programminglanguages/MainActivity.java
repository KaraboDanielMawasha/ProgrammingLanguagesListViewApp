package com.example.programminglanguages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] descriptions;
    String[] titles;
    TypedArray images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);

        titles = getResources().getStringArray(R.array.languages);
        descriptions = getResources().getStringArray(R.array.languageDescription);
        images = getResources().obtainTypedArray(R.array.languageImages);


        languagesAdapter ln = new languagesAdapter(this, titles, descriptions, images);
        listView.setAdapter(ln);


    }
}