package com.learnksl.learnksl.ui;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.learnksl.learnksl.R;


import butterknife.Bind;
import butterknife.ButterKnife;

import static android.R.id.toggle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //binding views
    @Bind(R.id.basicsImageView)
    ImageView mButton1;
    @Bind(R.id.basicsTextView)
    TextView mBasicsTextView;
    @Bind(R.id.tutorialsImageView)
    ImageView mTutorialImageView;
    @Bind(R.id.tutorialsTextView)
    TextView mTutorialsTextView;
    @Bind(R.id.communicationImageView)
    ImageView mCommunicationImageView;
    @Bind(R.id.communicationTextView)
    TextView mCommunicationTextView;
    @Bind(R.id.ImageView3)
    ImageView mFeedbackImageView;
    @Bind(R.id.feedbackTextView)
    TextView mFeedbackTextView;


    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mButton1.setOnClickListener(this);
        mBasicsTextView.setOnClickListener(this);
        mCommunicationImageView.setOnClickListener(this);
        mCommunicationTextView.setOnClickListener(this);
        mTutorialImageView.setOnClickListener(this);
        mTutorialsTextView.setOnClickListener(this);
        mFeedbackImageView.setOnClickListener(this);
        mFeedbackTextView.setOnClickListener(this);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open,R.string.close);


        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView n = (NavigationView) findViewById(R.id.nav);

        n.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle navigation view item clicks here.
                int id = item.getItemId();
                if (mToggle.onOptionsItemSelected(item)) {
                    return true;
                }

                if (id == R.id.nav_basics) {
                    Intent myIntent = new Intent(MainActivity.this, BasicsListActivity.class);
                    MainActivity.this.startActivity(myIntent);

                } else if (id == R.id.nav_communication) {
                    Intent myIntent = new Intent(MainActivity.this, CommunicationActivity.class);
                    MainActivity.this.startActivity(myIntent);


                } else if (id == R.id.nav_feedback) {
                    Intent myIntent = new Intent(MainActivity.this, FeedbackActivity.class);
                    MainActivity.this.startActivity(myIntent);


                } else if (id == R.id.nav_tutorials) {
                    Intent myIntent = new Intent(MainActivity.this, TutorialsActivity.class);
                    MainActivity.this.startActivity(myIntent);

                }

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }

        });

    }
    //override onclick method
    @Override
    public void onClick(View view) {

        if (view == mButton1) {
            Intent intent = new Intent(MainActivity.this, BasicsListActivity.class);
            startActivity(intent);
        }
            if (view == mBasicsTextView) {
            Intent intent = new Intent(MainActivity.this, BasicsListActivity.class);
            startActivity(intent);
        }
        if (view == mTutorialImageView) {
            Intent intent = new Intent(MainActivity.this, TutorialsActivity.class);
            startActivity(intent);
        }
        if (view == mTutorialsTextView) {
            Intent intent = new Intent(MainActivity.this, TutorialsActivity.class);
            startActivity(intent);
        }
        if (view == mCommunicationImageView) {
            Intent intent = new Intent(MainActivity.this, CommunicationActivity.class);
            startActivity(intent);
        }
        if (view == mCommunicationTextView) {
            Intent intent = new Intent(MainActivity.this, CommunicationActivity.class);
            startActivity(intent);
        }
        if (view == mFeedbackImageView) {
            Intent intent = new Intent(MainActivity.this, FeedbackActivity.class);
            startActivity(intent);
        }
        if (view == mFeedbackTextView) {
            Intent intent = new Intent(MainActivity.this, FeedbackActivity.class);
            startActivity(intent);
        }
//        if (view == mGamebackImageView) {
//            Intent intent = new Intent(MainActivity.this, MemoryGameActivity.class);
//            startActivity(intent);
//        }
//        if (view == mGamebackTextView) {
//            Intent intent = new Intent(MainActivity.this, MemoryGameActivity.class);
//            startActivity(intent);
//        }


    }

    @Override
        public boolean onOptionsItemSelected(MenuItem item) {
//            int id = item.getItemId();
            if (mToggle.onOptionsItemSelected(item)) {
                return true;
            }
//            if (id == R.id.nav_basics) {
//                Intent intent = new Intent(com.learnksl.learnksl.ui.MainActivity.this, BasicsListActivity.class);
//                startActivity(intent);
//                return true;
//            }
//            if (id == R.id.nav_communication) {
//                Intent intent = new Intent(com.learnksl.learnksl.ui.MainActivity.this, CommunicationActivity.class);
//                startActivity(intent);
//                return true;
//            }
//            if (id == R.id.nav_tutorials) {
//                Intent intent = new Intent(com.learnksl.learnksl.ui.MainActivity.this, TutorialsActivity.class);
//                startActivity(intent);
//                return true;
//            }
//            if (id == R.id.nav_communication) {
//                Intent intent = new Intent(com.learnksl.learnksl.ui.MainActivity.this, CommunicationActivity.class);
//                startActivity(intent);
//                return true;
//            }
            return super.onOptionsItemSelected(item);
        }
}
