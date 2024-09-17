package com.proseobd.all;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class Activity_News extends AppCompatActivity {
    ListView listView;
    HashMap<String, String> hashMap;
    ArrayList< HashMap<String, String> > arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        listView = findViewById(R.id.listView);


        createTeable();

        MyAdapter myAdapter =new MyAdapter();

        listView.setAdapter(myAdapter);



    }

    /////=========== Base Adapter ==============////
    /////=========== Base Adapter ==============////
    /////=========== Base Adapter ==============////


    private class MyAdapter extends BaseAdapter{

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




            return null;
        }
    }

    /////=========== Base Adapter ==============////
    /////=========== Base Adapter ==============////
    /////=========== Base Adapter ==============////


    /////=========== User Define Function ==============////
    /////=========== User Define Function ==============////
    /////=========== User Define Function ==============////


    private void createTeable () {


        hashMap = new HashMap<>();
        hashMap.put("Cat", "Appsumo LTD Review");
        hashMap.put("img_url", "https://proseobd.com/wp-content/uploads/2024/03/CQ-Business-Management-1-1024x576.jpg");
        hashMap.put("title", "CQ Business Management Lifetime Deal (LTD) Software Review!\n");
        hashMap.put("des", "CQ Business Management Lifetime Deal (LTD) Software Discussion!\n" +
                "Caution: Try to avoid FOMO, buy only if you really need it.\n" +
                "\n" +
                "Introducing: CQ Business Management Lifetime Deal (LTD) Software!\n" +
                "\n" +
                "Manage your teams, projects, and expenses with an all-in-one platform\n" +
                "Monitor business projects and maintain a database of all your leads\n" +
                "Keep a pulse on expenses with built-in timesheets and labor cost tracking\n" +
                "\n" +
                "Software should make your life easier, but switching back and forth between random tools is actually complicating your workflow. (“Who’s managing who here?”)\n" +
                "But we’re not just talking about time—running your business with dozens of single-use tools gets expensive, too.\n" +
                "What if you could optimize your operations, drive growth, and manage all your business needs from one user-friendly platform?\n" +
                "\n" +
                "Best suited for C-suite, Project managers, SaaS\n" +
                "Alternative to: ClickUp, Monday.com\n" +
                "Integrations: Google Calendar, Office 365, Quickbooks, Xero\n" +
                "CQ Business Management Software lets you keep track of projects, leads, metrics, and expenses, all in one place.\n" +
                "Keep track of all your business tasks in one place with this comprehensive project management platform.\n" +
                "You’ll get an overview of all your projects by monitoring tasks, flagging possible timeline delays, and communicating in real-time with your team.\n" +
                "Since CQ Business Management Software lets you monitor time spent on tasks and project expenses, it’s easy to stay on schedule and on budget.\n" +
                "Effortlessly manage and collaborate on projects with your entire team.\n" +
                "With a database that stores important lead info like name, company, and contact details, you’ll be able to keep tabs on every lead in your funnel.\n" +
                "Plus, you can upload documents to any lead’s profile to easily access info during a sales call.\n" +
                "From there, you can track and nurture leads by assigning their status and setting up automated reminders for timely follow-ups.\n" +
                "Track all of your leads in one database to improve sales conversions.\n" +
                "Even better, this platform gives you real-time analytics on metrics like revenue, product sales, and clients.\n" +
                "Want something more specific? Create custom business reports to gain insights unique to your business.\n" +
                "And since the data is constantly updated, you can identify your business’ strengths and areas for improvement.\n" +
                "Access data-driven insights to make decisions and spot trends.\n" +
                "CQ Business Management Software lets you accurately log all employee work hours with built-in timesheets.\n" +
                "Plus, you’ll be able to approve expenses so you can analyze labor costs across every project, job, and client.\n" +
                "With this platform, it’s easier than ever to discover the kind of management insights that’ll optimize daily operations and productivity.\n" +
                "Use timesheets to understand employee costs and stay within budget.\n" +
                "CQ Business Management Software gives you everything you need to streamline project workflows, grow leads, track expenses, and more.\n" +
                "Run your business with one platform.\n" +
                "Get lifetime access to CQ Business Management Software today!\n" +
                "\n" +
                "Features……….\n" +
                "Unlimited jobs/usage per month\n" +
                "Customizable system\n" +
                "Secure data storage\n" +
                "Asset management\n" +
                "Business analytics\n" +
                "Calendar management\n" +
                "Document creation\n" +
                "Estimation software\n" +
                "Gantt charts\n" +
                "Invoicing\n" +
                "Project/job management\n" +
                "Lead management\n" +
                "Team management\n" +
                "Timesheets\n" +
                "Team communication\n" +
                "File storage\n" +
                "SMTP email setup\n" +
                "Profit and loss\n" +
                "The best part? You will pay just once and can use for a CQ Business Management lifetime; grab your lifetime deal today!\n" +
                "\n" +
                "To learn more, please visit here: https://proseobd.com/get/CQ%20Business%20Management\n" +
                "Happy Marketing!\n" +
                "\n" +
                "Disclaimer: The source of this content with product details originally published on AppSumo.com\n");
        arrayList.add(hashMap);






    }


    /////=========== User Define Function ==============////
    /////=========== User Define Function ==============////
    /////=========== User Define Function ==============////


}