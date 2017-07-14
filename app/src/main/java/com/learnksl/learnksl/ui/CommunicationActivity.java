package com.learnksl.learnksl.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);
        ButterKnife.bind(this);

        mFingersTextView.setOnClickListener(this);
        mBasicWordsTextView.setOnClickListener(this);
        mColorsTextView.setOnClickListener(this);
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
    }
}
