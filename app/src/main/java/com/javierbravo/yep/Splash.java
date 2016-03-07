package com.javierbravo.yep;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Splash extends Activity {

    protected TextView textTitle;
    protected TextView textSubtitle;
    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);

        textTitle = (TextView) findViewById(R.id.title_splash);
        textSubtitle = (TextView) findViewById(R.id.subtitle_splash);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        textTitle.setTypeface(myFont);
        textSubtitle.setTypeface(myFont);


        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Splash.this, Login.class);
                Splash.this.startActivity(mainIntent);
                overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_right);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }

}
