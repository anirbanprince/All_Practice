package com.proseobd.all;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;


public class Activity_Pdf_Viewer extends AppCompatActivity {
    TextView title_Name;
    Animation title_Anim;
    PDFView pdfView;
    LottieAnimationView lottieAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        title_Anim = AnimationUtils.loadAnimation(Activity_Pdf_Viewer.this, R.anim.title_anim);
        title_Name = findViewById(R.id.title_Name);
        title_Name.startAnimation(title_Anim);

        pdfView = findViewById(R.id.pdfV);





        pdfView.fromAsset("bangladesh_rokter_rin.pdf")
                .onLoad(new OnLoadCompleteListener() {
                    @Override
                    public void loadComplete(int nbPages) {
                        Toast.makeText(Activity_Pdf_Viewer.this,"Loaded", Toast.LENGTH_LONG).show();
                    }
                })
                .load();





    }
}