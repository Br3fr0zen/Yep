package com.javierbravo.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    protected EditText username, password;
    protected Button logIn;

    protected TextView textTitle;
    protected TextView textSubtitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textTitle = (TextView) findViewById(R.id.title_Log);
        textSubtitle = (TextView) findViewById(R.id.subtitle_Log);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        textTitle.setTypeface(myFont);
        textSubtitle.setTypeface(myFont);

        username = (EditText) findViewById(R.id.usernameField);
        password = (EditText) findViewById(R.id.passwordField);
        logIn = (Button) findViewById(R.id.btn_Login);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().hide();

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}



