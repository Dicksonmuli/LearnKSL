package com.learnksl.learnksl.ui;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.learnksl.learnksl.R;

public class FeedbackActivity extends AppCompatActivity {

    EditText editName;
    Button buttonSend;
//    private DrawerLayout mDrawerLayout;
//    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        editName =(EditText) findViewById(R.id.editName);
        buttonSend = (Button) findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    addFeedback();
            }
        });


//   Navigation menu(Hamburger menu)
//        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open,R.string.close);
//
////      mDrawerLayout.addDrawerListener(mToggle);
//        mToggle.syncState();
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        if (mToggle.onOptionsItemSelected(item)){
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
   }

   private void addFeedback(){
       String name = editName.getText().toString().trim();

       if(!TextUtils.isEmpty(name)){

       }else{
           Toast.makeText(this,"Please Enter your name", Toast.LENGTH_LONG).show();
       }
   }
}
