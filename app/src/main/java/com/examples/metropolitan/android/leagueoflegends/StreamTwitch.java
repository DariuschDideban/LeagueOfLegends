package com.examples.metropolitan.android.leagueoflegends;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.webkit.WebSettings;
import android.webkit.WebView;



public class StreamTwitch extends AppCompatActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stream);

        // Initialize Webview
        mWebView = (WebView) findViewById(R.id.TwitchWebview);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);

        // Load the Twitch Stream you want
        // Actually, this is the most important line if code
        // The "embed" searches for the suitable stream format
        mWebView.loadUrl("http://player.twitch.tv/?channel=monstercat&html5");
    }

}