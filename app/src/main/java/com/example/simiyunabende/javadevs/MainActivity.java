package com.example.simiyunabende.javadevs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout =  findViewById(R.id.user_list_layout);
        layout.setOnClickListener(this);
    }

    // Handle onClick action
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, UserDetails.class);
        startActivity(intent);

    }
}
