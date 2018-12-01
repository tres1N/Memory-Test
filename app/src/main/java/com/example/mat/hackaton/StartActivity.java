package com.example.mat.hackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button buttonStart;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        buttonStart = findViewById(R.id.buttonStart);
    }


    public void buttonStartClicked(View v){
        intent = new Intent(getApplicationContext(), GameActivity.class);
        intent.putExtra("level", 1);
        startActivity(intent);
    }
}
