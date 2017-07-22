package com.learnksl.learnksl.ui;

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

public class AdjectiveSignsActivity extends YouTubeBaseActivity {
    YouTubePlayerView mYoutubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjective_signs);

        btnPlay=(Button) findViewById(R.id.adjBtnPlay);
        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.adjYoutubePlay);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener(){
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b){
                List<String> videoList = new ArrayList<>();
//                videoList.add("ZkJsvB3Us_Y");
                videoList.add("gYgRRMF4t1A");
                youTubePlayer.loadVideos(videoList);
//                youTubePlayer.loadPlaylist("VyI1wtplk3Y");
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
