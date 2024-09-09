package com.proseobd.all;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Shared_P extends AppCompatActivity {
    EditText edt;
    Button btnSaveData, btnNext;
    SharedPreferences sharedPerferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_p);

        edt = findViewById(R.id.edt);

        btnSaveData = findViewById(R.id.btnSaveData);
        btnNext = findViewById(R.id.btnNext);

        sharedPerferences = getSharedPreferences( getString(R.string.app_name) , MODE_PRIVATE);

        editor = sharedPerferences.edit() ;



        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edt.getText().toString() ;
                editor.putString( "name" , ""+name ) ;
                editor.apply();

            }
        });



    }
}