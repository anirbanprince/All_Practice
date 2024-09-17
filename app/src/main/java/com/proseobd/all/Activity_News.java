package com.proseobd.all;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Activity_News extends AppCompatActivity {
    ViewGroup viewGroup;
    ListView listView;
    HashMap<String, String> hashMap;
    ArrayList< HashMap<String, String> > arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        listView = findViewById(R.id.listView);


        createTeable();

        MyAdapter myAdapter = new MyAdapter();

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

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.layout_news, viewGroup);

            ImageView imgCover = myView.findViewById(R.id.imgCover);
            TextView tvcat = myView.findViewById(R.id.tvcat);
            TextView tvtitle = myView.findViewById(R.id.tvtitle);
            TextView tvdes = myView.findViewById(R.id.tvdes);
            LinearLayout lLay = myView.findViewById(R.id.lLay);


            HashMap<String, String> hashMap = arrayList.get(position);
            String cat = hashMap.get("cat");
            String title = hashMap.get("title");
            String img_url = hashMap.get("img_url");
            String des = hashMap.get("des");

            Picasso.get().load(img_url)
                    .placeholder(R.drawable.seo_expert)
                    .into(imgCover);

            tvcat.setText(cat);
            tvtitle.setText(title);
            tvdes.setText(des);

            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            tvcat.setBackgroundColor(color);

            lLay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(Activity_News.this, Activity_News_Details.class));

                }
            });





            return myView;
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
        hashMap.put("cat", "Appsumo LTD Review");
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



        hashMap = new HashMap<>();
        hashMap.put("cat", "Appsumo LTD Review");
        hashMap.put("img_url", "https://proseobd.com/wp-content/uploads/2024/03/xxWP-Adminify-1-1-1024x576.jpg,Mic.6q9KREVPg4.webp.pagespeed.ic.DOuqU7T3yO.webp");
        hashMap.put("title", "WP Adminify Lifetime Deal (LTD) Software Review!");
        hashMap.put("des", "WP Adminify Lifetime Deal (LTD) Software Discussion!\n" +
                "Caution: Try to avoid FOMO, buy only if you really need it.\n" +
                "\n" +
                "Introducing: WP Adminify Lifetime Deal (LTD) Software!\n" +
                "Customize your WordPress dashboard and login page with a powerful toolkit\n" +
                "White label your WordPress by swapping out default branding for a custom logo, dashboard, and login page\n" +
                "Sort your pages, posts, and media files into specific folders to quickly organize your content\n" +
                "In an ideal world, your WordPress dashboard wouldn't be totally confusing and hard to customize. (And you'd also earn a dollar for every site visitor. Hey, dream big.)\n" +
                "\n" +
                "Whether you’re working in your own dashboard or setting one up for your client, creating a dashboard that feels intuitive shouldn’t be an impossible task.\n" +
                "\n" +
                "If only there was a toolkit that revamped your WordPress dashboard so your menus, pages, and content could be organized more effectively.\n" +
                "\n" +
                "Best suited for Developers, Marketing agencies, Web design agencies\n" +
                "\n" +
                "Integrations: WordPress\n" +
                "\n" +
                "WP Adminify lets you customize your WordPress dashboard with tools like the login page customizer, menu builder, and folder module.\n" +
                "You can create a custom admin dashboard page with the Admin Pages module and choose whether it’s a top-level or sublevel menu item.\n" +
                "Add, edit, remove, or clone admin columns from any post type, page, or product, plus adjust the column width.\n" +
                "WP Adminify also lets you switch to a horizontal admin menu, so you can have more room in your dashboard to get work done.\n" +
                "You can even change the look of your WordPress dashboard with Dark Mode using the toggle switch at the top of your dashboard.\n" +
                "Customize your admin menu with features like Horizontal View and Dark Mode.\n" +
                "You can rename your default WordPress menu items with labels that make more sense for your business—like changing the “Posts” label to “Content” instead.\n" +
                "Set custom menu icons using libraries jam-packed with over 5,000 options, including some from Dashicons, Themify, and Elementor.\n" +
                "Plus, you’ll be able to drag-and-drop the menu items from your admin dashboard to organize them any way you want to.\n" +
                "Rename menu items or replace icons to modify your WordPress dashboard menu.\n" +
                "WPAdminify lets you create unlimited folders with different tag colors to sort your media files into the right categories so they’re way easier to access.\n" +
                "Use folders to organize different post types like WooCommerce and Elementor templates, along with individual posts.\n" +
                "Best of all, you can use instant search and sort to find any folder in seconds, which saves you from endless scrolling.\n" +
                "WP Adminify’s Folder module helps you organize your media library, post types, and posts.\n" +
                "Design your WordPress login page with your choice of 16 templates—all of which can be fully customized using your brand assets.\n" +
                "Just add your own image, video, background color, or logo to the login page, and adjust columns to reposition the form.\n" +
                "You can alsocustomize text fields like the input labels, placeholder text, and error messages to optimize your website’s usability.\n" +
                "Customize the logo, background, and form field of your WordPress login page.\n" +
                "Your WordPress dashboard shouldn’t feel more difficult to navigate than a corn maze after dark. (And yet in both cases, you're screaming for help.)\n" +
                "WP Adminify helps you redesign your dashboard with over 18 easy-to-customize modules, including folders, a login customizer, and menu builder.\n" +
                "Create your perfect WordPress dashboard.\n" +
                "Get lifetime access to WP Adminify today!\n" +
                "\n" +
                "Features……….\n" +
                "\n" +
                "Quick menu\n" +
                "Menu duplicator\n" +
                "Post types\n" +
                "Order post duplicator\n" +
                "Disable comments\n" +
                "Google page speed insights\n" +
                "Header and footer scripts\n" +
                "Dashboard and welcome widget\n" +
                "Admin columns\n" +
                "Admin notices\n" +
                "Folders\n" +
                "Menu editor\n" +
                "Login customizer\n" +
                "Custom sidebar\n" +
                "Activity logs\n" +
                "Notification bar\n" +
                "Server information\n" +
                "Admin pages\n" +
                "Dismiss admin notices\n" +
                "White label\n" +
                "The best part? You will pay just once and can use for a WP Adminify lifetime; grab your lifetime deal today!\n" +
                "\n" +
                "To learn more, please visit here: https://proseobd.com/get/WP-Adminify\n" +
                "\n" +
                "Happy Marketing!\n" +
                "\n" +
                "Disclaimer: The source of this content with product details originally published on AppSumo.com");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("cat", "PitchGround Deals");
        hashMap.put("img_url", "https://proseobd.com/wp-content/uploads/2023/01/xxBetafi-1024x666.jpg,Mic.PxUTHDo4Ki.webp.pagespeed.ic.ibDKxU5oqM.webp");
        hashMap.put("title", "Betafi Lifetime Deal (LTD) Software Review!");
        hashMap.put("des", "Betafi Lifetime Deal (LTD) Talk!\n" +
                "Caution: Try to avoid FOMO, buy only if you really need it.\n" +
                "\n" +
                "Introducing: Betafi Lifetime Deal (LTD) Software!\n" +
                "Conduct User Interviews & Usability Tests To Validate Ideas, Feedback, Designs, Websites, & Apps.\n" +
                "With Betafi, you can easily and quickly get feedback from real users about your product or website. The unified user research platform allows you to uncover insights with a fraction of the effort.\n" +
                "Intuitive UI and UX, easy-to-use platform, very stable. \n" +
                "Alternative to: UserTesting, Dovetail, Maze, Lookback, Grain\n" +
                "\n" +
                "Best suited for: Solopreneurs, Freelancers, SMEs, and Agencies\n" +
                "\n" +
                "For Every $1 Invested in UX, You Can Get Results (ROI) Between $2-$100.\n" +
                "Conduct User Interviews and Usability Tests for Your Business!\n" +
                "\n" +
                "User feedback should be the heartbeat of the product development process, but it is extremely manual and disjointed.\n" +
                "\n" +
                "Figuring out what users want is hard. You have a great idea for a product design or website, but you're not sure if it's something people will actually use.\n" +
                "\n" +
                "You've probably heard the saying, “you have to spend money to make money.” Well, that's especially true regarding your website or app development.  \n" +
                "\n" +
                "It can be tough to know if your idea is any good and even tougher to get customer feedback. However, without customer feedback, it isn't easy to understand if your product is on the right track.\n" +
                "\n" +
                "Presents; Betafi\n" +
                "Betafi is the solution. It's a unified user research platform that makes it easy to capture customer feedback and product insights. With Betafi, you can quickly and easily conduct user interviews and usability tests to validate ideas, feedback, designs, websites, and apps.\n" +
                "\n" +
                "Betafi enables companies to proactively uncover quality insights from talking to their customers with a fraction of the effort by bringing the process of gathering and making sense of feedback to one platform.\n" +
                "\n" +
                "On Betafi, you can: capture ‘aha' moments with one click, find patterns of the conversations across sessions, and share feedback in the voice of the customer.\n" +
                "\n" +
                "It is integrated with leading design and collaboration tools like Zoom, Figma, Adobe XD, and Miro to make it easier for you to bring feedback into the product development process.\n" +
                "\n" +
                "Let’s see the features that can attract you in a while….\n" +
                "\n" +
                "Critical Stats: \n" +
                "According to Forbes, customer-centric companies are 60% more profitable than companies that are not.\n" +
                "Did you know that 73% of consumers state that customer experience is a crucial factor in determining whether to do business with a company or not? (source: usersnap.com)\n" +
                "Additionally, 84% of companies that actively work on improving the customer experience & product using customer feedback tools see increased revenue due to their efforts.\n" +
                "55% of companies perform any user experience testing & with intentional & strategic UX can take up the conversion rates by 400%. (source: truelist.com)\n" +
                "According to Invespcro, for every $1 invested in UX, you can get results in between $2-$100.\n" +
                "L\uFEFFearn more about Betafi:\n" +
                "User Interviews:\n" +
                "Betafi helps you move swiftly from gathering user feedback to making sense of it – by bringing it all on one platform.\n" +
                "\n" +
                "Never miss anything important during the conversation with notes, recordings & more.\n" +
                "Stay organized with interview questions and avoid alt-tabbing to another tool during the call.\n" +
                "Capture `aha` moments and instant tags with one click.\n" +
                "Dive straight in to identify patterns right after your calls with annotated videos.\n" +
                "Share key highlights with your team and expedite your synthesis by exporting notes and clips to Miro/CSV.\n" +
                "Clip videos to share insights in the voice of customers.\n" +
                "Filter your notes across conversations to quickly find your answers.\n" +
                "Transform your Zoom call into a research den with Betafi.\n" +
                "Usability Issues: \n" +
                "Betafi makes it easy to understand how users perceive your product, how they use it, and where they struggle.\n" +
                "\n" +
                "Test your Figma/XD prototypes or live websites on the target device.\n" +
                "Note down usability issues as they arise.\n" +
                "Delight participants with a structured, immersive experience.\n" +
                "Identify issues faster with rich, annotated recordings.\n" +
                "Usability stats surface key metrics at a glance.\n" +
                "Use clips to share moments of joy or struggle with the team.\n" +
                "Review usability stats to quickly spot the flaws in your prototypes.\n" +
                "Upgrade your feedback calls into an insight-finding session.\n" +
                "\n" +
                "Gathering feedback during the call will feel easy as you can take timestamped notes, bring in your interview questions, and tag insights as they emerge – all within Betafi. Post-call, you can revisit the recording, your notes, and a multi-lingual transcript to make sense of user feedback. You can also see patterns across sessions by comparing the feedback across participants, tags, and sessions.\n" +
                "\n" +
                "Uncover usability issues on your product before it's too late.\n" +
                "\n" +
                "Betafi helps you understand how users perceive your product, how they use it, and where they struggle by making it easy to test your Figma/XD prototypes and live websites. You can share one or multiple prototypes and note usability issues as they arise – all in the same window. Your participants will also enjoy the immersive experience of testing your designs on the right device.\n" +
                "\n" +
                "Prepare for your interviews like never before.\n" +
                "\n" +
                "You can also interview candidates on Betafi, record them, and add feedback for each response using Instant tags and Time-stamped notes. To share context, you can also share how a candidate performed with another decision-maker.\n" +
                "Founders preparing for YC interviews have been using Betafi to help them.\n" +
                "\n" +
                "Bring key customer concerns on your sales calls to your product team.\n" +
                "\n" +
                "As you demo the product and customers have feedback around pricing, features, or workflow, you can capture this with the Instant Tags feature on Betafi. You can also mention the relevant stakeholder for them to follow up on an important customer concern. With Betafi, you can also observe the feedback getting repeated across a group of customers and share it with your product team.\n" +
                "\n" +
                "Some Interesting Use Cases Of Betafi:\n" +
                "1. For UX Researchers: \n" +
                "Manage your end-to-end research process from setup to doing calls to synthesis – all on Betafi. Filter your notes across questions, tags, and participants to quickly identify common patterns. Export all your notes from Betafi to Miro with a single click\n" +
                "\n" +
                "2. For Product Designers:\n" +
                "Get your participants to test your mobile prototypes in the right context. Test multiple Figma / XD prototypes to compare different designs and workflows. Using the interactive usability dashboard, compare different metrics across tasks and participants.\n" +
                "\n" +
                "3. For Founders & PMs:\n" +
                "Transform your Zoom call into a research den and ensure you never miss an ‘Aha' moment. Take notes and bring in your interview questions within the Zoom call so you can focus on the user. Bring your team closer to your users by sharing video clips of key insights captured during user conversations.\n" +
                "\n" +
                "4. For Marketers:\n" +
                "Test your landing page, campaign messaging, and design before spending any marketing dollars. Bring your personal questionnaire, take notes to answer each question, and then analyze your calls – all on Betafi. Share video clips of key highlights with your team to drive alignment.\n" +
                "\n" +
                "Why are businesses choosing Betafi over the rest:\n" +
                "Uncover Actionable insights while conducting feedback calls with your customers.\n" +
                "Bring your Figma/XD prototypes, test them on the right device, and take time-stamped notes to capture usability issues.\n" +
                "Post-Call, get an annotated video highlighting the bookmarked moments and an automatic transcript with transcription in 30+ languages.\n" +
                "Share video clips of key highlights in the voice of the customer with your team.\n" +
                "Transform your Zoom calls into a feedback-capturing machine.\n" +
                "Analyze your notes across sessions by questions or tags to dig out insights faster.\n" +
                "Simple setup and ease of use.\n" +
                "Available on a lifetime deal for a limited period of time.\n" +
                "The best part? You will pay just once and can use Betafi for a lifetime; grab your lifetime deal today.\n" +
                "To learn more, please visit here: https://www.proseobd.com/Betafi\n" +
                "\n" +
                "Happy Marketing!\n" +
                "\n" +
                "Disclaimer: The source of this content with product details originally published on Pitchground.com\n" +
                "\n");
        arrayList.add(hashMap);

        //hashMap = new HashMap<>();
        //hashMap.put("", "");
       // hashMap.put("", "");
       // hashMap.put("", "");
       // hashMap.put("", "");

       // arrayList.add(hashMap);







    }


    /////=========== User Define Function ==============////
    /////=========== User Define Function ==============////
    /////=========== User Define Function ==============////


}