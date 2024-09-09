package com.proseobd.all;

import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_p);

        edt = findViewById(R.id.edt);

        btnSaveData = findViewById(R.id.btnSaveData);
        btnNext = findViewById(R.id.btnNext);








    }
}