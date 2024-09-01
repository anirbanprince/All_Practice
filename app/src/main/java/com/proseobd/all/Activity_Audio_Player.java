package com.proseobd.all;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;

public class Activity_Audio_Player extends AppCompatActivity {

    Animation title_Name_Anim;
    TextView title_Name;
    Button btnPlayOffline, btnPlayOnline;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_player);


        title_Name = findViewById(R.id.title_Name);
        btnPlayOffline = findViewById(R.id.btnPlayOffline);
        btnPlayOnline = findViewById(R.id.btnPlayOnline);

        title_Name_Anim = AnimationUtils.loadAnimation(Activity_Audio_Player.this, R.anim.title_anim);



        title_Name.startAnimation(title_Name_Anim);


        btnPlayOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();

                mediaPlayer = MediaPlayer.create(Activity_Audio_Player.this, R.raw.tauba_tauba);
                mediaPlayer.start();


            }
        });



        btnPlayOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mediaPlayer!=null) mediaPlayer.release();

                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://file-examples.com/storage/fe0e9b723466913cf9611b7/2017/11/file_example_MP3_1MG.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            }
        });















    }
}