package com.example.transleter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    Button button;
    TextView textView;
    EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoView);
        button = findViewById(R.id.button);
        search = findViewById(R.id.search);
        SharedPreferences pref = getSharedPreferences("myPref", MODE_PRIVATE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   videoView.setVideoURI(Uri.parse(pref.getString(search.getText().toString().toLowerCase(), null)));
                   videoView.start();
            }
        });





    }


}