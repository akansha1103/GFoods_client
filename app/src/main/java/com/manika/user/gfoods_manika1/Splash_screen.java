package com.manika.user.gfoods_manika1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_screen extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //final UserSessionManager user = new UserSessionManager(Splash_screen.this);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               /* if (user.getPhn() != "") {
                    Intent go = new Intent(Splash_screen.this, Main_Menu.class);
                    startActivity(go);
                    finish();
                } else
                    {*/
                Intent g = new Intent(Splash_screen.this, Signin.class);
                startActivity(g);
                finish();
                //}
            }
        }, 3000);
    }
}
