package com.learnksl.learnksl.ui;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.learnksl.learnksl.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CommunicationActivity extends AppCompatActivity implements View.OnClickListener {
//    Binding views
    @Bind(R.id.fingersTextView)
    TextView mFingersTextView;
    @Bind(R.id.basicWordsTextView)
    TextView mBasicWordsTextView;
    @Bind(R.id.colorsTextView)
    TextView mColorsTextView;
    @Bind(R.id.healthTextView)
    TextView mHealthTextView;
    @Bind(R.id.schoolTextView)
    TextView mSchoolTextView;
    @Bind(R.id.familyTextView)
    TextView mFamilyTextView;
    @Bind(R.id.officeTextView)
    TextView mOfficeTextView;
    @Bind(R.id.moneyTextView)
    TextView mMoneyTextView;

//    Navigation drawer
    private DrawerLayout mCommunicationDrawer;
    private ActionBarDrawerToggle mCommunicationToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);
        ButterKnife.bind(this);

        mFingersTextView.setOnClickListener(this);
        mBasicWordsTextView.setOnClickListener(this);
        mColorsTextView.setOnClickListener(this);
        mHealthTextView.setOnClickListener(this);
        mFamilyTextView.setOnClickListener(this);
        mMoneyTextView.setOnClickListener(this);
        mOfficeTextView.setOnClickListener(this);
        mSchoolTextView.setOnClickListener(this);

//Navigation Drawer
//        mCommunicationDrawer = (DrawerLayout) findViewById(R.id.communication_layout);
//        mCommunicationToggle = new ActionBarDrawerToggle(this, mCommunicationDrawer, R.string.open,R.string.close);
//        mCommunicationDrawer.addDrawerListener(mCommunicationToggle);
//        mCommunicationToggle.syncState();
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //override onclick method

    @Override
    public void onClick(View view) {
        if (view == mFingersTextView) {
            Intent intent = new Intent(CommunicationActivity.this, FingerSpellingActivity.class);
            startActivity(intent);
        }
        if (view == mBasicWordsTextView) {
            Intent intent = new Intent(CommunicationActivity.this, BasicWordsActivity.class);
            startActivity(intent);
        }
        if (view == mColorsTextView) {
            Intent intent = new Intent(CommunicationActivity.this, ColorsActivity.class);
            startActivity(intent);
        }
        if (view == mHealthTextView) {
            Intent intent = new Intent(CommunicationActivity.this, BodyAndHealthActivity.class);
            startActivity(intent);
        }
        if (view == mFamilyTextView) {
            Intent intent = new Intent(CommunicationActivity.this, FamilySignsActivity.class);
            startActivity(intent);
        }
        if (view == mMoneyTextView) {
            Intent intent = new Intent(CommunicationActivity.this, MoneyAndBusinessActivity.class);
            startActivity(intent);
        }
        if (view == mOfficeTextView) {
            Intent intent = new Intent(CommunicationActivity.this, OfficeSignsActivity.class);
            startActivity(intent);
        }
        if (view == mSchoolTextView) {
            Intent intent = new Intent(CommunicationActivity.this, SchoolSignsActivity.class);
            startActivity(intent);
        }
    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        if (mCommunicationToggle.onOptionsItemSelected(item)){
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
