package com.authentification.khalidbaba.authentification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.widget.TextView;

import java.time.Instant;

/**
 * Created by khalidbaba on 28/01/2018.
 */

public class WelcomeActivity extends Activity {

    //TODO : Declare all variables (TextView, String)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //TODO : Instantiate all objects
        TextView email;
        String _email;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Intent i =getIntent();
        _email = i.getStringExtra("email");
        email = (TextView) findViewById(R.id.email);
        email.setText(_email);

        //TODO  : Get the intent content and show the Email in the TextView
    }
}