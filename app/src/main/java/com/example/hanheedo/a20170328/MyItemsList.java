package com.example.hanheedo.a20170328;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.hanheedo.a20170328.R;


/**
 * Created by Han Heedo on 2017-03-17.
 */

public class MyItemsList extends AppCompatActivity
{
        protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myitemslist);

        Intent intent = getIntent();
        String data = intent.getStringExtra("D_key");



    }
}

