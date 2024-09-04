package com.proseobd.all;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_For_Loop3 extends AppCompatActivity {
    EditText edtSnum, edtLnum;
    Button btnCal;
    TextView tvd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_loop3);

        edtSnum = findViewById(R.id.edtSnum);
        edtLnum = findViewById(R.id.edtLnum);
        btnCal = findViewById(R.id.btnCal);
        tvd = findViewById(R.id.tvd);


        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int fNum = Integer.parseInt(edtSnum.getText().toString());
                int lNum = Integer.parseInt(edtLnum.getText().toString());

                for (int x=fNum; x<=lNum; x++){
                    if (x%2==0)tvd.setText(" "+x);
                }







            }
        });










    }
}