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

public class Activity_Loop_HW extends AppCompatActivity {
    TextView title_Name, tvd, tvd2, tvd11, tvd22, tvd3, tvd33;
    EditText edt1, edt2, edt3;
    Button btnCal, btnCal2, btnCal3;
    Animation title_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_hw);

        title_anim = AnimationUtils.loadAnimation(Activity_Loop_HW.this, R.anim.title_anim);

        title_Name = findViewById(R.id.title_Name);
        tvd = findViewById(R.id.tvd);
        tvd2 = findViewById(R.id.tvd2);
        tvd11 = findViewById(R.id.tvd11);
        tvd22 = findViewById(R.id.tvd22);
        tvd3 = findViewById(R.id.tvd3);
        tvd33 = findViewById(R.id.tvd33);

        edt1 =findViewById(R.id.edt1);
        edt2 =findViewById(R.id.edt2);
        edt3 =findViewById(R.id.edt3);

        btnCal = findViewById(R.id.btnCal);
        btnCal2 = findViewById(R.id.btnCal2);
        btnCal3 = findViewById(R.id.btnCal3);


        title_Name.startAnimation(title_anim);


        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd.setText("");

                int sum = 0;

                if (edt1.length()>0){
                    int ipNum = Integer.parseInt(edt1.getText().toString());
                    for (int x=1; x<=ipNum; x++ ){
                        if (x%2==0){
                            sum = sum+x;
                            tvd.append(" "+x);
                            tvd2.setText("The Sum is :"+sum);
                        }
                    }
                } else {
                    edt1.setError("Please Enter a number");
                }

            }
        });


        btnCal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvd11.setText("");

                if (edt2.length()>0){
                    int sum=0, t=10;
                    int n = Integer.parseInt(edt2.getText().toString());

                    for (int x=1; x<=n; x++){
                        t = (int) (Math.pow(10,x)-1);
                        sum = sum+t;
                        tvd11.append(" "+t);
                        tvd22.setText("The Sum Is :"+sum);

                    }
                } else {
                    edt2.setError("Please Enter a Number");
                }
            }
        });



        btnCal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvd3.setText("");
                tvd33.setText("");

                if (edt3.length()>0){
                    int n = Integer.parseInt(edt3.getText().toString());
                    int sum=0;

                    for (int x=1; x<=n; x++){
                        int sq =x*x;
                        sum = sum + sq;
                        tvd3.append(" "+sq);
                        tvd33.setText(" "+sum);
                    }

                } else {
                    edt3.setError("Please Enter a Number");
                }


            }
        });



    }
}