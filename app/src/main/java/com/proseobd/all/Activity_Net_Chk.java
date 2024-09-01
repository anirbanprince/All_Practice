package com.proseobd.all;

import android.app.AlertDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
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

public class Activity_Net_Chk extends AppCompatActivity {
    Button btntNetChk;
    TextView tvTitle, tvResult;
    Animation tvTitleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_chk);

        tvTitleAnimation = AnimationUtils.loadAnimation(Activity_Net_Chk.this, R.anim.title_anim);
        btntNetChk = findViewById(R.id.btntNetChk);
        tvResult = findViewById(R.id.tvResult);
        tvTitle = findViewById(R.id.tvTitle);


        tvTitle.startAnimation(tvTitleAnimation);


        btntNetChk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConnectivityManager cManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo netInfo = cManager.getActiveNetworkInfo();


                if (netInfo != null && netInfo.isConnected()){
                    tvResult.setText("Internet is Connected");
                } else {

                    tvResult.setText("");
                    new AlertDialog.Builder(Activity_Net_Chk.this)
                            .setTitle("No Internet")
                            .setMessage("Please Connect To Internet")
                            .show();
                    tvResult.setText("No Internet");
                }


            }
        });









    }
}