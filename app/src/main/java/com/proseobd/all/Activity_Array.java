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
    TextView title_Name, tvd;
    Button btn1, btn2, btn3, btn4;

    String[] names = {"Noni Gopal", "SanaUl", "Rajat", "Asish", "Bulbul"};
    int x=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        title_Name =findViewById(R.id.title_Name);
        tvd = findViewById(R.id.tvd);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText("");
                tvd.setText(names[2]);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText("");
                tvd.setText(names[0]);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText("");
                tvd.setText(names[3]);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText("");
                for (int x=0; x<names.length; x++){
                    tvd.append(names[x]+"\n");

                }
            }
        });














    }
}