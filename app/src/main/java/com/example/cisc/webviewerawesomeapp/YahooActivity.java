package com.example.cisc.webviewerawesomeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class YahooActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahoo);


        //YAHOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO!
        WebView myWebView = (WebView) findViewById(R.id.webViewYahoo);
        myWebView.setWebViewClient(new WebViewClient()); //force yahoo to stay in our app
        myWebView.loadUrl("http://www.yahoo.com");


    }
}
