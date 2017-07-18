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

import com.google.firebase.database.DatabaseReference;
import com.learnksl.learnksl.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BasicsListActivity extends AppCompatActivity implements View.OnClickListener{

    //binding views
    @Bind(R.id.alphabetsTextView) TextView mAlphabetsTextView;
    @Bind(R.id.numbersTextView) TextView mNumbersTextView;
    @Bind(R.id.daysTextView) TextView mDaysTextView;
    @Bind(R.id.monthsTextView) TextView mMonthsTextView;

    @Bind(R.id.alphabetsImageView) ImageView mAlphabetsImageView;
    @Bind(R.id.numbersImageView) ImageView mNumbersImageView;
    @Bind(R.id.daysImageView) ImageView mDaysImageView;
    @Bind(R.id.monthsImageView) ImageView mMonthsImageView;

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;


    //member variables
//    private Integer mPosition;
//    String[] basics = new String[]{"alphabet, numbers"};

    //Database variable
    private DatabaseReference mDatabase;

//    private List<String> dbbasics = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics_list);
        ButterKnife.bind(this);

        mAlphabetsTextView.setOnClickListener(this);
        mNumbersTextView.setOnClickListener(this);
        mDaysTextView.setOnClickListener(this);
        mMonthsTextView.setOnClickListener(this);

//        Intent intent = getIntent();
//        final String basic = intent.getStringExtra("basic");

//        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.basics_list_item, basics);
//        mListView.setAdapter(adapter);
//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String basics = ((TextView) view).getText().toString();
//                mDatabase = FirebaseDatabase.getInstance().getReference().child("Basics");
//                final Integer itemPosition = i;
//                mDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(DataSnapshot dataSnapshot) {
//                        for (DataSnapshot snapshot: dataSnapshot.getChildren()){
//                            String dbbasic = snapshot.getValue(String.class);
//                            dbbasics.add(dbbasic);
//                        }
//
//                    }
//
//                    @Override
//                    public void onCancelled(DatabaseError databaseError) {
//
//                    }
//                });
//            }
//        });
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open,R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    //override onclick method
    @Override
    public void onClick(View view) {
        if (view == mAlphabetsTextView || view == mAlphabetsImageView) {
            Intent intent = new Intent(BasicsListActivity.this, AlphabetsListActivity.class);
            startActivity(intent);
        }
        if (view == mNumbersTextView || view == mNumbersImageView) {
            Intent intent = new Intent(BasicsListActivity.this, NumbersListActivity.class);
            startActivity(intent);
        }
        if (view == mDaysTextView || view == mDaysImageView) {
            Intent intent = new Intent(BasicsListActivity.this, DaysListActivity.class);
            startActivity(intent);
        }
        if (view == mMonthsTextView || view == mMonthsImageView) {
            Intent intent = new Intent(BasicsListActivity.this, MonthsListActivity.class);
            startActivity(intent);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
