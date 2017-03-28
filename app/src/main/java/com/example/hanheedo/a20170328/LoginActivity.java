package com.example.hanheedo.a20170328;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class LoginActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void onClick_1(View view)
    {
        Intent intent = new Intent(this, MyItemsList.class);
        intent.putExtra("D_key","data_1");
        startActivity(intent);
    }
}
