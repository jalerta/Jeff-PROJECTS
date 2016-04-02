package com.inverselogic.mathgamechapter2;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.Toolbar;

// added comment to force GitHub Desktop commit

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

    }


}
