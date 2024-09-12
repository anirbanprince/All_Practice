package com.proseobd.all;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btntxt2sp, btnNetChk, btntAudioP, btnMp3, btnPdfV, btnUDMethod, btnForLoop, btnForLoop2,
            btntForLoop3, btnLoopHW, btnNestedLoop, btntArrey, btnSP, btnLayoutInflater, btntListView;
    TextView title_Name;
    Animation title_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title_animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.title_anim);

        btntxt2sp = findViewById(R.id.btntxt2sp);
        btnNetChk = findViewById(R.id.btntNetChk);
        btntAudioP = findViewById(R.id.btntAudioP);
        btnMp3 = findViewById(R.id.btnMp3);
        btnPdfV = findViewById(R.id.btnPdfV);
        btnUDMethod = findViewById(R.id.btnUDMethod);
        btnForLoop = findViewById(R.id.btnForLoop);
        btnForLoop2 = findViewById(R.id.btnForLoop2);
        btntForLoop3 = findViewById(R.id.btntForLoop3);
        btnLoopHW = findViewById(R.id.btnLoopHW);
        btnNestedLoop = findViewById(R.id.btnNestedLoop);
        btntArrey = findViewById(R.id.btntArrey);
        btnSP = findViewById(R.id.btnSP);
        btnLayoutInflater = findViewById(R.id.btnLayoutInflater);
        btntListView = findViewById(R.id.btntListView);

        title_Name = findViewById(R.id.title_Name);



        // Start Animation Code
        title_Name.startAnimation(title_animation);
        // End Animation Code

        //----Button Text To Spece Start
        btntxt2sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent text2_spIntent = new Intent(MainActivity.this, Activity_Text2SP.class);
                startActivity(text2_spIntent);
            }
        });

        //----Button Text To Spece End


        //----Button Net Check Start

        btnNetChk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent netChkIntent = new Intent(MainActivity.this, Activity_Net_Chk.class);
                startActivity(netChkIntent);
            }
        });

        //----Button Net Check End


        // ------------ Button Audio Player Start --------- //

        btntAudioP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent audioPIntent = new Intent(MainActivity.this, Activity_Audio_Player.class);
                startActivity(audioPIntent);
            }
        });

        //---------- Button Audio Player End ------------//

        // ------------ Button Mp3 Player Start --------- //

        btnMp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mp3Intent = new Intent(MainActivity.this, Activity_Mp3.class);
                startActivity(mp3Intent);
            }
        });


        // ------------ Button Mp3 Player End --------- //



        // ------------ Button Pdf Viewer Start --------- //


        btnPdfV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pdfViewerIntent = new Intent(MainActivity.this, Activity_Pdf_Viewer.class);
                startActivity(pdfViewerIntent);
            }
        });


        // ------------ Button Pdf Viewer End --------- //





        // ------------ Button User Define Method Start --------- //

        btnUDMethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent udMethodIntent = new Intent(MainActivity.this, Activity_UDMethod.class);
                startActivity(udMethodIntent);
            }
        });


        // ------------ Button User Define Method End --------- //


        // ============== Button For Loop Start ===============//


        btnForLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forLoopIntent = new Intent(MainActivity.this, Activity_For_Loop.class);
                startActivity(forLoopIntent);

            }
        });

        // ==============  Button For Loop End ================//

        // ============== Button For Loop 2 Start =============//

        btnForLoop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forLoop2Intent = new Intent(MainActivity.this, Activity_For_Loop_2.class);
                startActivity(forLoop2Intent);
            }
        });



        // ================ Button For Loop 2 End ==============//

        // =============Button  For Loop Part 3 Star =================//


        btntForLoop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forLoop3Intent = new Intent(MainActivity.this, Activity_For_Loop3.class);
                startActivity(forLoop3Intent);
            }
        });

        // ============= Button For Loop part 3 End =================//





        // ============= Button For Loop HW Start =================//


        btnLoopHW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loopHWIntent = new Intent(MainActivity.this, Activity_Loop_HW.class);
                startActivity(loopHWIntent);
            }
        });

        // ============= Button For Loop HW End =================//


        // ============ Nested Loop Start Here ===================//


        btnNestedLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nestedLoopIntent = new Intent(MainActivity.this, Activity_Nested_Loop.class);
                startActivity(nestedLoopIntent);

            }
        });

        // ============= Nested Loop End =====================//

        // ================ Arrey Button Star ================//

        btntArrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arreyIntent = new Intent(MainActivity.this, Activity_Array.class);
                startActivity(arreyIntent);
            }
        });
        // ============= Arrey Activity End Here ============//


        // ============= Shared Performance Start ===========//


        btnSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spIntent = new Intent(MainActivity.this, Activity_Shared_P.class);
                startActivity(spIntent);
            }
        });

        // ============ Shared Preference End Here ===============//


        // ============== Layout Infeter Start =============//

        btnLayoutInflater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent( MainActivity.this, Activity_Layout_Inflater.class) );
            }
        });

        //=============== Layout Infleter End ============//


        //========== List View Start ================//

        btntListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( MainActivity.this, Activity_List_View.class) );
            }
        });
        //=================== List View End Here =======================//










    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();


    }
}