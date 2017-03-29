package com.example.hanheedo.a20170328;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Han Heedo on 2017-03-17.
 */

public class AddItem extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additem);

        Intent intent = getIntent();
        String data = intent.getStringExtra("List_Add");
    }
}
