package com.dhanibux.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display the splash screen layout
        setContentView(R.layout.activity_splash);

        // Set a delay to display the splash screen for a certain time
        int splashDurationMillis = 2000; // 2 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity and finish the splash activity
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, splashDurationMillis);
    }
}
