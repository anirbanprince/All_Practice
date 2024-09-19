package com.proseobd.all;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Activity_News_Details extends AppCompatActivity {
    ImageView imgCover;
    TextView tvTitle, tvND;
    FloatingActionButton fabBtn;

    public static String TITLE = "";
    public static String DESCRIPTION = "";
    public static Bitmap MY_BITMAP = null;

    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        imgCover = findViewById(R.id.imgCover);
        tvTitle = findViewById(R.id.tvTitle);
        tvND = findViewById(R.id.tvND);
        fabBtn = findViewById(R.id.fabBtn);

        tvTitle.setText(TITLE);
        tvND.setText(DESCRIPTION);

        if (MY_BITMAP!=null) imgCover.setImageBitmap(MY_BITMAP);

        textToSpeech = new TextToSpeech(Activity_News_Details.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });

        fabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = tvND.getText().toString();
                textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);



            }
        });








    }
}