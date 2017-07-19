package com.learnksl.learnksl.ui;

import android.net.Uri;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.learnksl.learnksl.R;

import java.util.ArrayList;
import java.util.List;

public class TutorialsActivity extends YouTubeBaseActivity  {
    YouTubePlayerView mYoutubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        btnPlay=(Button) findViewById(R.id.btnPlay);
        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlay);
        mOnInitializedListener = new YouTubePlayer.OnInitializedListener(){
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b){
               // List<String> videoList = new ArrayList<>();
               // videoList.add("");
                //videoList.add("");
                //youTubePlayer.loadVideos(videoList);
                youTubePlayer.loadPlaylist("PLCe_vigJzMrP6yac5tNAfQNeQpg2fSPWR");
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

//
//        VideoView videoView = (VideoView) findViewById(R.id.videoView);
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        Uri uri = Uri.parse("https://www.youtube.com/watch?v=z2S2XsZLDlI");
//        videoView.setMediaController(mediaController);
//        videoView.setVideoURI(uri);
//        videoView.requestFocus();
//        videoView.start();



    }

}
