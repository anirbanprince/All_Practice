package com.proseobd.all;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity_HasMap extends AppCompatActivity {

    ListView listView;
    ArrayList < HashMap <String, String> > arrayList;
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_has_map);

        listView = findViewById(R.id.listView);

        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("name", "Anirban Prince");
        hashMap.put("mobile", "01717237128");
        hashMap.put("email", "anirbanprince@yahoo.com");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", "Noni");
        hashMap.put("mobile", "01729113849");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", "Sanaul");
        hashMap.put("mobile", "01716027192");
        arrayList.add(hashMap);



        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);



    }


    // ============== Base Adapter ============== //

    private class MyAdapter extends BaseAdapter{

        LayoutInflater layoutInflater;
        View myView;
        ViewGroup viewGroup;

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            myView = layoutInflater.inflate(R.layout.has_map_layout, viewGroup);

            ImageView imageView = myView.findViewById(R.id.imageView);



            TextView tvName = myView.findViewById(R.id.tvName);
            TextView tvMob = myView.findViewById(R.id.tvMob);
            TextView tvEmail = myView.findViewById(R.id.tvEmail);

            HashMap<String, String> hashMap = arrayList.get(position);

            String name = hashMap.get("name");
            String mobile = hashMap.get("mobile");
            String email = hashMap.get("email");

            tvName.setText(name);
            tvMob.setText(mobile);
            tvEmail.setText(email);


            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Activity_HasMap.this,"Hello "+name, Toast.LENGTH_SHORT).show();
                }
            });





            return myView;
        }
    }








}