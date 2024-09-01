package com.proseobd.all;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_UDMethod extends AppCompatActivity {

    TextView title_Name, tvd;
    Animation title_anim;
    Button btnToast, btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udmethod);




        title_anim = AnimationUtils.loadAnimation(Activity_UDMethod.this, R.anim.title_anim);
        title_Name = findViewById(R.id.title_Name);
        btnToast = findViewById(R.id.btnToast);
        tvd = findViewById(R.id.tvd);
        btn2 = findViewById(R.id.btn2);




        // Start Animation Code =====================
        title_Name.startAnimation(title_anim);
        // End Animation Code =======================




        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast();
            }
        });




        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText("Private Method Is Working");
            }
        });




    }
    // End Of On Create Bundle ===========================================





    // User Define Method Start ==========================================
    private void makeToast(){
        Toast.makeText(Activity_UDMethod.this, "Hello", Toast.LENGTH_SHORT).show();
    }



    private void makeDialog(){

        new AlertDialog.Builder(Activity_UDMethod.this)
                .setTitle("This is a Title")
                .setMessage("Hello")
                .show();
    }





    private void showText(String myString){
        tvd.setText(" "+myString);
    }


    // User Define Method End ============================================




}