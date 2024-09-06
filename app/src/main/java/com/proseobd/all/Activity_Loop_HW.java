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
    TextView title_Name, tvd, tvd2;
    EditText edt1;
    Button btnCal;
    Animation title_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_hw);

        title_anim = AnimationUtils.loadAnimation(Activity_Loop_HW.this, R.anim.title_anim);

        title_Name = findViewById(R.id.title_Name);
        tvd = findViewById(R.id.tvd);
        tvd2 = findViewById(R.id.tvd2);

        edt1 =findViewById(R.id.edt1);

        btnCal = findViewById(R.id.btnCal);


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





    }
}