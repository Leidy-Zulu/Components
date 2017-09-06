package com.example.components;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Button extends AppCompatActivity {

    private android.widget.Button buttonFirst;
    private android.widget.Button buttonSecond;
    private android.widget.Button buttonThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        initComponents();
    }

    private void initComponents() {

        buttonFirst =  (android.widget.Button) findViewById(R.id.button_first);
        buttonSecond = (android.widget.Button) findViewById(R.id.button_second);
        buttonThird = (android.widget.Button) findViewById(R.id.button_third);
    }

    public void buttonSave(View view){

        Intent intent = new Intent(this, RadioButton.class);
        startActivity(intent);
    }
}
