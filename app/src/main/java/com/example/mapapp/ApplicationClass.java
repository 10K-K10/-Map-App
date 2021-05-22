package com.example.mapapp;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl("https://api.backendless.com");
        Backendless.initApp(getApplicationContext(),"6DBF033F-EA78-4A3C-80C9-02F8C2789C5F","C37A4D44-EF26-4DDB-9218-C5962BEA3B9F");


    }
}
