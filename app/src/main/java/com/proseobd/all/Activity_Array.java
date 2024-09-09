package com.proseobd.all;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Array extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;
    TextView tvd;
    String[] names = {"Noni Gopal", "Md. Jamal", "Bulbul", "Sanaul"} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        btn1 = findViewById(R.id.btn1) ;
        btn2 = findViewById(R.id.btn2) ;
        btn3 = findViewById(R.id.btn3) ;
        btn4 = findViewById(R.id.btn4) ;

        tvd = findViewById(R.id.tvd) ;




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText(names[2]);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText(names[1]);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText(names[0]);
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText("");
                for (int i=0; i<names.length; i++){
                    tvd.append(names[i]+"\n");
                }
            }
        });











    }
}