package com.proseobd.all;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_SP_Ext extends AppCompatActivity {
    TextView tvd;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_ext);

        tvd = findViewById(R.id.tvd) ;

        sharedPreferences = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE) ;

        String myString = sharedPreferences.getString("name", "") ;
        int myAge = sharedPreferences.getInt( "age" , 0 ) ;
        tvd.setText(myString);
        tvd.append( "\nYour age is "+myAge);








    }
}