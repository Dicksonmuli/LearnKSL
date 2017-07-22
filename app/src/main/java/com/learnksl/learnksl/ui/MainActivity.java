package com.learnksl.learnksl.ui;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.florent37.tutoshowcase.TutoShowcase;
import com.learnksl.learnksl.R;


import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
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
//        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
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
    public boolean onOptionsItemSelected(MenuItem item){
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
