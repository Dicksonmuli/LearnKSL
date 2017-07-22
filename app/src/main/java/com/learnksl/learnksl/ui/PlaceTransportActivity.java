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

public class PlaceTransportActivity extends YouTubeBaseActivity {
    YouTubePlayerView mYoutubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_transport);

        btnPlay=(Button) findViewById(R.id.place_transportBtnPlay);
        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.place_transportYoutubePlay);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener(){
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b){
                List<String> videoList = new ArrayList<>();
//                videoList.add("ZkJsvB3Us_Y");
                videoList.add("7IbOgQghAS4");
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