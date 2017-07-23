package com.learnksl.learnksl.ui;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.learnksl.learnksl.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    @Bind(R.id.buttonSend)
    Button mButtonSend;
    @Bind(R.id.editName)
    EditText mEditName;
    @Bind(R.id.editEmail)
    EditText mEditEmail;
    @Bind(R.id.editPhone)
    EditText mEditPhone;
    @Bind(R.id.editFeedb)
    EditText mEditFeed;

    private DatabaseReference mFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mFeedback = FirebaseDatabase
                .getInstance()
                .getReference()
                .child(Constants.FIREBASE_FEEDBACK);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        ButterKnife.bind(this);
        mButtonSend.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        String name = mEditName.getText().toString();
        String email = mEditEmail.getText().toString();
        String phone = mEditPhone.getText().toString();
        String feedb= mEditFeed.getText().toString();

        Feed feed = new Feed();
        //Adding values
        feed.setName(name);
        feed.setEmail(email);
        feed.setPhone(phone);
        feed.setFeedback(feedb);
        //Storing values to firebase
        mFeedback.setValue(feed);


        Toast.makeText(this.getApplicationContext(), "Feedback Sent", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(FeedbackActivity.this, MainActivity.class);
        startActivity(intent);
    }
}