package com.example.aprilianti.aprilianti_1202150276_modul2;

import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    private static int splashInterval = 3000;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash_screen);

    Toast.makeText(SplashScreen.this, "APRILIANTI_1202150276", Toast.LENGTH_SHORT).show();

    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent splash = new Intent( SplashScreen.this, MenuUtama.class);
            startActivity(splash);

            this.finish();
        }

        private void finish () {

        }
                              },
            splashInterval);
    };
}

