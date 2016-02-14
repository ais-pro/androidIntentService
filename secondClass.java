package com.example.root.serviceselftest2;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by root on 2/14/16.
 */
public class secondClass extends IntentService {

    @Override
    protected void onHandleIntent(Intent intent) {

    }
    public secondClass(){
        super("testing");
    }

    @Override
    public void onCreate() {
        Toast.makeText(this,"Service created",Toast.LENGTH_LONG).show();
        super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {

        Toast.makeText(this,"Service started",Toast.LENGTH_LONG).show();
        super.onStart(intent, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"Service stopped.",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
