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

public class BasicWordsActivity extends YouTubeBaseActivity {
    YouTubePlayerView mYoutubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_words);

        btnPlay=(Button) findViewById(R.id.verbsBtnPlay);
        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.verbsYoutubePlay);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener(){
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b){
                 List<String> videoList = new ArrayList<>();
                 videoList.add("VyI1wtplk3Y");
                //videoList.add("");
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
