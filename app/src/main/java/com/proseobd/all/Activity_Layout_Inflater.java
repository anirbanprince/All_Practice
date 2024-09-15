package com.proseobd.all;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Layout_Inflater extends AppCompatActivity {

    Button btnRajat, btnSanaul, btnNoni;
    LinearLayout mainLayout, layOut2;
    LayoutInflater layoutInflater;
    View myView;
    ImageView imgSEOexpert, imgRajat, imgSanaul, imgNoni;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_inflater);

        btnRajat = findViewById(R.id.btnRajat);
        btnSanaul = findViewById(R.id.btnSanaul);
        btnNoni = findViewById(R.id.btnNoni);

        mainLayout = findViewById(R.id.mainLayout);
        layOut2 = findViewById(R.id.layOut2);

        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        myView = layoutInflater.inflate(R.layout.layout_inflator_ext, layOut2);
        imgSEOexpert = myView.findViewById(R.id.imgSEOexpert);

        imgSEOexpert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity_Layout_Inflater.this, "Hello I.m Prince",Toast.LENGTH_SHORT).show();
            }
        });




        btnRajat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layOut2.removeAllViews();
                myView = layoutInflater.inflate(R.layout.layout_rajat, layOut2);
                imgRajat = myView.findViewById(R.id.imgRajat);
                imgRajat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Activity_Layout_Inflater.this, "Hello I.m Rajat",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


        btnSanaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layOut2.removeAllViews();
                myView = layoutInflater.inflate(R.layout.layout_sanaul, layOut2);
                imgSanaul = myView.findViewById(R.id.imgSanaul);
                imgSanaul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Activity_Layout_Inflater.this, "Hello I.m Sanaul",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


        btnNoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layOut2.removeAllViews();
                myView = layoutInflater.inflate(R.layout.layout_noni, layOut2);
                imgNoni = myView.findViewById(R.id.imgNoni);
                imgNoni.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Activity_Layout_Inflater.this, "Hello I'm Noni", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });








    }
}