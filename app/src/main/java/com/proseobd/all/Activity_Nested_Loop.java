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

import com.airbnb.lottie.parser.IntegerParser;

public class Activity_Nested_Loop extends AppCompatActivity {
    Animation animation;
    EditText edt1, edt2, edt3, edt33;
    Button btnMRAT, btnfindPN, btnfindPN2;
    TextView title_Name, tvd1, tvd2,tvd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_loop);

        animation = AnimationUtils.loadAnimation(Activity_Nested_Loop.this, R.anim.title_anim);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        edt33 = findViewById(R.id.edt33);

        btnMRAT = findViewById(R.id.btnMRAT);
        btnfindPN = findViewById(R.id.btnfindPN);
        btnfindPN2 = findViewById(R.id.btnfindPN2);

        title_Name = findViewById(R.id.title_Name);
        tvd1 = findViewById(R.id.tvd1);
        tvd2 = findViewById(R.id.tvd2);
        tvd3 = findViewById(R.id.tvd3);

        title_Name.startAnimation(animation);



        btnMRAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd1.setText("");


                if (edt1.length()>0){
                    int iPutNum = Integer.parseInt(edt1.getText().toString());

                    for (int x=1; x<=iPutNum; x++){

                        for (int y=1; y<=x; y++){
                            tvd1.append(" * ");
                        }

                        tvd1.append("\n");
                    }

                } else {
                    edt1.setError("Please Enter a Number");
                }


            }
        });



        btnfindPN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (edt2.length()>0){
                    int num = Integer.parseInt(edt2.getText().toString());

                    for ( int x=2; x<num; x++){
                        if (num % x == 0){
                            tvd2.setText(num+" is not a Prime Number");
                            break;
                        } else {
                            tvd2.setText(num+" is a Prime Number");
                        }
                    }
                } else {
                    edt2.setError("Please Enter a Number");
                }


            }
        });



        btnfindPN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd1.setText("");
                tvd2.setText("");
                tvd3.setText("");

                int fNum =Integer.parseInt(edt3.getText().toString());
                int lNum =Integer.parseInt(edt33.getText().toString());


                for (int x=fNum; x<=lNum; x++){



                }





            }
        });





    }
}