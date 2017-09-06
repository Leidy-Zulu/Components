package com.example.components;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Button extends AppCompatActivity {

    private android.widget.Button buttonFirst;
    private android.widget.Button buttonSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        initComponents();
        onclickListener();
    }

    private void initComponents() {

        buttonFirst = (android.widget.Button) findViewById(R.id.button_first);
        buttonSecond = (android.widget.Button) findViewById(R.id.button_second);


    }

    private void onclickListener() {
        buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Button.this, RadioButton.class);
                startActivity(intent);
            }
        });

        buttonSecond.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
    }

    public void buttonSave(View view) {

        Intent intent = new Intent(this, RadioButton.class);
        startActivity(intent);
    }
}
