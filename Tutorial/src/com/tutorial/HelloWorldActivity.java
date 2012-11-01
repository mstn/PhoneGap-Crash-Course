package com.tutorial;

import org.apache.cordova.*;
import android.os.Bundle;

public class HelloWorldActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }


}
