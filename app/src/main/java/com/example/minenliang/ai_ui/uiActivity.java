package com.example.minenliang.ai_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class uiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui);
    }

    public void btnGo(View view){
        startActivity(new Intent(this,infoActivity.class));
    }


}
