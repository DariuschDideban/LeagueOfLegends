package com.examples.metropolitan.android.leagueoflegends;


import android.app.ListActivity;
import android.os.Bundle;

import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

/**
 * Created by Patrick on 10.11.2016.
 */

public class EmbeddedTweetActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tweet_main);

        final UserTimeline userTimeline = new UserTimeline.Builder().screenName("Unigames_FIN").build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this).setTimeline(userTimeline).build();
        setListAdapter(adapter);


    }

}
