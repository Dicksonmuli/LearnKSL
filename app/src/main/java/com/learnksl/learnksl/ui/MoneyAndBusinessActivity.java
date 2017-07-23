package com.learnksl.learnksl.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.learnksl.learnksl.R;

import java.util.ArrayList;
import java.util.List;

public class MoneyAndBusinessActivity extends YouTubeBaseActivity {
    YouTubePlayerView mYoutubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finger_spelling);

        btnPlay=(Button) findViewById(R.id.greetingsBtnPlay);
        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.greetingsYoutubePlay);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener(){
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b){
                List<String> videoList = new ArrayList<>();
//                videoList.add("ZkJsvB3Us_Y");
//                videoList.add("PLogKrWC9ug8QRJsY8sjdL_kUN02vEMRq6");
                youTubePlayer.loadVideos(videoList);
                youTubePlayer.loadPlaylist("PLCe_vigJzMrO-WnbsMccViMJ7gqzrYAQw");
            }
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult){

            }
        };
        btnPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mYoutubePlayerView.initialize(YouTubeConfig.getApiKey(), mOnInitializedListener);
            }
        });

    }
}