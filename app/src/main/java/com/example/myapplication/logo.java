package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);


        Handler handler = new Handler();
<<<<<<< HEAD
        handler.postDelayed(new Runnable() {
                                        @Override
                                        public void run () {
                                            // code
                                            Intent intent = new Intent(logo.this, MainActivity.class);
                                            startActivity(intent);
                                            finish();
                                        }
                                    },3500);

=======
        handler.postDelayed(() -> {
>>>>>>> 126c39607946799214fab710929506c479d18ae7

            Intent intent = new Intent(logo.this, MainActivity.class);
            startActivity(intent);
            finish();
        },2000);

    }
}