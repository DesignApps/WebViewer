package com.onewhocreates.webviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonGoogle, buttonUCSDExt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGoogle = (Button) findViewById(R.id.buttonGoogle);
        buttonGoogle.setOnClickListener(this);

        buttonUCSDExt = (Button) findViewById(R.id.buttonUCSDExt);
        buttonUCSDExt.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.buttonGoogle:
                Intent g;
                g = new Intent(this, GoogleActivity.class);
                startActivity(g);
                break;
            case R.id.buttonUCSDExt:
                Intent u;
                u = new Intent(this, UCSDExtActivity.class);
                startActivity(u);
                break;
        }
    }
}
