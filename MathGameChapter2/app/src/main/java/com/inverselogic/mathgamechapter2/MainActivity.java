package com.inverselogic.mathgamechapter2;

// Modified file for Git/BitBucket
// More comments


import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.Toolbar;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

    }


}
