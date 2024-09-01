package com.proseobd.all;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Mp3 extends AppCompatActivity {
    ImageView imgVPlay1;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp3);
        imgVPlay1 = findViewById(R.id.imgVPlay1);


        imgVPlay1.setOnClickListener(new View.OnClickListener() {
            private Context Activity_Mp3;

            @Override
            public void onClick(View v) {

                if (imgVPlay1.getTag()!=null && imgVPlay1.getTag().toString().contains("not_playing")){

                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer = MediaPlayer.create(Activity_Mp3.this, R.raw.tauba_tauba);
                    mediaPlayer.start();
                    imgVPlay1.setImageResource(R.drawable.pause);
                    imgVPlay1.setTag("playing");

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            imgVPlay1.setImageResource(R.drawable.play);
                            imgVPlay1.setTag("not_playing");
                        }
                    });



                } else {
                    if (mediaPlayer!=null) mediaPlayer.release();
                    imgVPlay1.setImageResource(R.drawable.play);
                    imgVPlay1.setTag("not_playing");
                }



            }
        });




    }
}