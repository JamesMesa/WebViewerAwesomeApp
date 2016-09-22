package com.example.cisc.webviewerawesomeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MesaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa);

        //I LOVE MESA COLLEGE
        WebView myWebView = (WebView) findViewById(R.id.webViewMesa);
        myWebView.loadUrl("http://www.sdmesa.edu");
    }
}
