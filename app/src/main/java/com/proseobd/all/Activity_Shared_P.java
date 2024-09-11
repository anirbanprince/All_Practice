package com.proseobd.all;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Collections;

public class Activity_Shared_P extends AppCompatActivity {
    EditText edName;
    NumberPicker npAge;
    DatePicker dpDob;
    Button btnSaveData, btnNext;
    SharedPreferences sharedPerferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_p);

        edName = findViewById(R.id.edName) ;

        npAge = findViewById(R.id.npAge) ;
        npAge.setMinValue(0) ;
        npAge.setMaxValue(100) ;
        npAge.setWrapSelectorWheel(false) ;

        dpDob = findViewById(R.id.dpDob) ;


        btnSaveData = findViewById(R.id.btnSaveData) ;
        btnNext = findViewById(R.id.btnNext) ;

        sharedPerferences = getSharedPreferences( getString(R.string.app_name) , MODE_PRIVATE) ;

        editor = sharedPerferences.edit() ;



        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                String name = edName.getText().toString() ;
                editor.putString( "name" , ""+name ) ;
                editor.apply() ;

                int age = Integer.parseInt( npAge.toString() ) ;
                editor.putInt( "age", age ) ;
                editor.apply() ;

                String dob = dpDob.toString() ;
                editor.putString( "dob" , ""+dob) ;
                editor.apply() ;


            }
        });


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_Shared_P.this, Activity_SP_Ext.class));

            }
        });



    }
}