package com.emmanuelani.phase1challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // declare buttons
    Button profileButton;
    Button aboutButton;

    // declare intents
    Intent profileIntent;
    Intent aboutIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link buttons to activities
        profileButton = (Button) findViewById(R.id.button_profile);
        aboutButton = (Button) findViewById(R.id.button_about);

        // handle Profile button event
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  create Context for MainActivity
                profileIntent = new Intent(MainActivity.this, ProfileActivity.class);

                // start ProfileActivity
                startActivity(profileIntent);
            }
        });

        // handle About button event
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // handle WebView
                aboutIntent = new Intent(MainActivity.this, WebViewActivity.class);

                // start WebViewActivity
                startActivity(aboutIntent);
            }
        });

    }
}
