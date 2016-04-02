package com.inverselogic.dynamicactivity;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

// Import Widgets that will build the new main Activity
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

// To use color import the graphics.Color class
import android.graphics.Color;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // instantiate a new Layout object
        RelativeLayout myAppLayout = new RelativeLayout(this);
        myAppLayout.setBackgroundColor(Color.GREEN);

        // instantiate a Button object
        Button redButton = new Button(this);
        redButton.setText(getString(R.string.redButtonText));
        redButton.setBackgroundColor(Color.RED);

        // EditText userName input field
        EditText userName = new EditText(this);

        // Set ID's so that you can easily reference the objects
        redButton.setId(1);
        userName.setId(2);

        // create LayoutParams object for centering the redButton relative to the layout screen
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        // create LayoutParams object for centering the userName relative to the layout screen
        RelativeLayout.LayoutParams userNameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        // Rules for positioning widgets
        userNameDetails.addRule(RelativeLayout.ABOVE, redButton.getId() );
        userNameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userNameDetails.setMargins(0, 0, 0, 50);

        // assign centring rules to LayoutParams object
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
                r.getDisplayMetrics()
                );

        userName.setWidth(px);
        // add objects to the Layout object
        myAppLayout.addView(redButton, buttonDetails);
        myAppLayout.addView(userName, userNameDetails);

        // set new Activity to display
        setContentView(myAppLayout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
