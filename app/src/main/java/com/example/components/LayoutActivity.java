package com.example.components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        getParams();
    }

    private void getParams(){
        String name = getIntent().getExtras().getString("parametro1");
        String lastName = getIntent().getExtras().getString("parametro2");
        Toast.makeText(LayoutActivity.this, name + " " + lastName, Toast.LENGTH_LONG).show();
    }
}
