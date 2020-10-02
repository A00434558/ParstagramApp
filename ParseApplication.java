package com.codepath.parstagramapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4DZUFEy4UlMKhbaVp00Gksz7MhzkefxunwOloZiS")
                .clientKey("9u7pMfUwSsCa93leM8nRAZiC4FUu0TSN2HCnOnye")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
