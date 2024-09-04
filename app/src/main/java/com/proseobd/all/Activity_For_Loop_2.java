package com.proseobd.all;

import android.os.Bundle;
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

public class Activity_For_Loop_2 extends AppCompatActivity {
    Animation title_anim;
    TextView title_Name, tvd, tvd2;
    EditText edt;
    Button btnbs5, btnConT, btnSub1to100, btnMT, btnFact, btnCalculate;
    double fac =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_loop2);

        title_anim = AnimationUtils.loadAnimation(Activity_For_Loop_2.this, R.anim.title_anim);
        title_Name = findViewById(R.id.title_Name);
        tvd = findViewById(R.id.tvd);
        tvd2 = findViewById(R.id.tvd2);
        edt = findViewById(R.id.edt);
        btnbs5 = findViewById(R.id.btnbs5);
        btnConT = findViewById(R.id.btnConT);
        btnSub1to100 = findViewById(R.id.btnSub1to100);
        btnMT = findViewById(R.id.btnMT);
        btnFact = findViewById(R.id.btnFact);
        btnCalculate = findViewById(R.id.btnCalculate);



        title_Name.startAnimation(title_anim);



        btnbs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText("");
                for (int x=1; x<=100; x++){
                    btnbs5.append(" "+x);
                    tvd.append(" "+x);
                    if (x==5) break;
                }
            }
        });



        btnConT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText("");
                for (int x=1; x<=100; x++){
                    if (x==5) continue;
                    btnConT.append(" "+x);
                    tvd.append(" "+x);
                }

            }
        });



        btnSub1to100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText("");
                int sum =0;
                for (int x=1; x<=100; x++){
                    sum = sum+x;
                    tvd.setText("1+2+3+4+5......+100 = "+sum);
                }
            }
        });




        btnMT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText("");
                for (int x=1; x<=10; x++){
                    int mul = 5*x;
                    tvd.append("5 * "+x+"= "+mul+"\n");
                }
            }
        });



        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText("");
                for (int x=1; x<=5; x++){
                    fac = fac*x;
                }
                tvd.setText("Fac of 5 is : "+fac);
            }
        });



        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt.length()>0){
                    int num = Integer.parseInt(edt.getText().toString());
                    tvd2.setText("");
                    for (int x=1; x<=10; x++){
                        int fnum = num*x;
                        tvd2.append(""+num+" * "+x+" ="+fnum+"\n");
                    }

                } else {
                    edt.setError("Please Enter a Number");
                }




            }
        });








    }
}