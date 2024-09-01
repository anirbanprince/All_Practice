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

public class Activity_For_Loop extends AppCompatActivity {
    TextView title_Name, tvd;
    EditText edtxtS, edtxtL;
    Button btnCalculate;
    Animation title_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_loop);

        title_anim = AnimationUtils.loadAnimation(Activity_For_Loop.this, R.anim.title_anim);
        title_Name = findViewById(R.id.title_Name);
        tvd = findViewById(R.id.tvd);
        edtxtS = findViewById(R.id.edtxtS);
        edtxtL = findViewById(R.id.edtxtL);
        btnCalculate = findViewById(R.id.btnCalculate);


        title_Name.startAnimation(title_anim);



        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (edtxtS.length()<1 || edtxtL.length()<1){

                    edtxtS.setError("Please Enter Number");
                    edtxtL.setError("Please Enter Number");


                }
                else {
                    int firstNum = Integer.parseInt(edtxtS.getText().toString());
                    int lastNum = Integer.parseInt(edtxtL.getText().toString());

                    tvd.setText("");
                    for (int x=firstNum; x<=lastNum; x++){
                        tvd.append(" "+x);
                    }
                }





            }
        });















    }
}