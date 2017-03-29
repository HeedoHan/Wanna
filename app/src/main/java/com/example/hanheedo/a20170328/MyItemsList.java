package com.example.hanheedo.a20170328;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
        String data = intent.getStringExtra("Login_List");
    }

    public void addClick(View view)
    {
        Intent intent = new Intent(this, AddItem.class);
        intent.putExtra("List_Add","data_3");
        startActivity(intent);
    }
}

