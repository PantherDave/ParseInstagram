package com.codepath.davida.parseinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MwtIAj5AO1g2my05ISP4gSCIJ0yyjLRgxLnKZ0Cq")
                .clientKey("t5bDPHuU4peKPEUTE0M5M2Smx778FjoVMw3BEEyH")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
