package com.proseobd.all;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Text2SP extends AppCompatActivity {

    EditText edtxt;
    TextView tvTxt2Sp;
    Button btnPlay;
    Animation title_anim;
    TextToSpeech txt2sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text2_sp);

        tvTxt2Sp = findViewById(R.id.tvTxt2Sp);
        edtxt = findViewById(R.id.edtxt);
        btnPlay = findViewById(R.id.btnPlay);
        txt2sp = new TextToSpeech(Activity_Text2SP.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });
        title_anim = AnimationUtils.loadAnimation(Activity_Text2SP.this, R.anim.title_anim);


        // Start Animation Code
        tvTxt2Sp.startAnimation(title_anim);
        // End Animation Code


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2sp.speak(""+edtxt.getText(), TextToSpeech.QUEUE_FLUSH, null, null);
            }
        });









    }
}