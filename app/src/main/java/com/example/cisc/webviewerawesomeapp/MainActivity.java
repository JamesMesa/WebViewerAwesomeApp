package com.example.cisc.webviewerawesomeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mesaButton, yahooButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mesaButton = (Button) findViewById(R.id.buttonMesa);
        mesaButton.setOnClickListener(this);

        yahooButton = (Button) findViewById(R.id.buttonYahoo);
        yahooButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.buttonMesa:
                Intent m;
                m = new Intent(this, MesaActivity.class);
                startActivity(m);
                break;
            case R.id.buttonYahoo:
                Intent y;
                y = new Intent(this, YahooActivity.class);
                startActivity(y);
                break;

        }
    }
}
