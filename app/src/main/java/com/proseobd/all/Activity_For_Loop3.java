package com.proseobd.all;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_For_Loop3 extends AppCompatActivity {
    EditText edtSnum, edtLnum, edtSyear, edtLyear;
    Button btnCal, btnCal2;
    TextView tvd, tvd2;
    int fNum, lNum, fYear, lYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_loop3);

        edtSnum = findViewById(R.id.edtSnum);
        edtLnum = findViewById(R.id.edtLnum);
        edtSyear = findViewById(R.id.edtSyear);
        edtLyear = findViewById(R.id.edtLyear);

        btnCal = findViewById(R.id.btnCal);
        btnCal2 = findViewById(R.id.btnCal2);

        tvd = findViewById(R.id.tvd);
        tvd2 = findViewById(R.id.tvd2);


        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (edtSnum.length()>0){
                    fNum = Integer.parseInt(edtSnum.getText().toString());
                } else {
                    edtSnum.setError("Pelase Enter a Vlaid Number");
                }




                if (edtLnum.length()>0) {
                    lNum = Integer.parseInt(edtLnum.getText().toString());
                } else {
                    edtLnum.setError(" Please Enter a Vlaid Number");
                }




                if (lNum>fNum){
                    for (int x=fNum; x<=lNum; x++){
                        if (x%2==0)tvd.append(" "+x);
                    }
                } else {
                    Toast.makeText(Activity_For_Loop3.this, "2nd number must be higher than 1st", Toast.LENGTH_SHORT).show();
                }




            }
        });




        btnCal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (edtSyear.length()>0){
                    fYear=Integer.parseInt(edtSyear.getText().toString());
                } else {
                    edtSyear.setError("Please Enter Valaid Year");
                }


                if (edtLyear.length()>0){
                    lYear=Integer.parseInt(edtLyear.getText().toString());
                } else {
                    edtLyear.setError("Please Enter Valaid Year");
                }


                if (lYear>fYear){
                    for (int x=fYear; x<=lYear; x++){
                        if (x%100==0 || x%4==0 && x%400!=0){
                            tvd2.append(""+x);
                        }else {
                            Toast.makeText(Activity_For_Loop3.this, "2nd number must be higher than 1st", Toast.LENGTH_SHORT).show();
                        }
                    }


                }







            }
        });










    }
}