package com.example.root.serviceselftest2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class FirsterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firster);


        Toast.makeText(this,"Main activity started",Toast.LENGTH_LONG).show();
        Intent i=new Intent(FirsterActivity.this,secondClass.class);
        startService(i);
    }
}
