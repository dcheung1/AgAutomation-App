package com.agautomation.agautomation_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

/**
 * Created by Kevin on 1/27/2018.
 */

public class FarmOverview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farm_overview);
    }

    public void Farm1Click(View v) {
            android.content.Intent i = new Intent(FarmOverview.this, FarmData.class);
            startActivity(i);

    }

}
