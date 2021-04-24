package com.example.pinterestapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
       // ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("UoHYoVglJMDQl0lo72XIpQDrCUpUaR8T8QciCVs1")
                .clientKey("weL26eFAmx0Wcr8wQvmULd8N4c3t6f5ktMq24aHu")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
