package com.example.components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class RelativeLayoutActivity extends AppCompatActivity {

    private EditText describeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        loadViews();
        getParams();
    }

    private void loadViews() {
        describeName = (EditText) findViewById(R.id.describe_etName);
    }

    private void getParams() {
        String name = getIntent().getExtras().getString(Constants.NAME);
        String lastName = getIntent().getExtras().getString(Constants.LASTNAME);
        describeName.setText(name + "" + lastName);

    }
}
