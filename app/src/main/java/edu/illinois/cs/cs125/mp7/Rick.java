package edu.illinois.cs.cs125.mp7;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class Rick extends YouTubeBaseActivity {

    YouTubePlayerView r1YouTubePlayerView;
    Button button1Play;
    YouTubePlayer.OnInitializedListener r1OnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rick_layout);
        button1Play = (Button) findViewById(R.id.rbutton);
        r1YouTubePlayerView = (YouTubePlayerView) findViewById(R.id.rick_quote_one);

        r1OnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                List<String> videoList = new ArrayList<>();
                videoList.add("xw8Ez_XKfZ8");
                videoList.add("HvFboLsE5oI");
                videoList.add("B8oD1MYoUWs");
                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        button1Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1YouTubePlayerView.initialize(YouTubeConfig.getApiKey(), r1OnInitializedListener);
            }
        });


    }
}
