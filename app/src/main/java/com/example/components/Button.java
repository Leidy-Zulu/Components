package com.example.components;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Button extends AppCompatActivity {

    private android.widget.Button buttonFirst;
    private android.widget.Button buttonSecond;
    private ConstraintLayout constraintLayout;

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
        constraintLayout = (ConstraintLayout)  findViewById(R.id.contrain_layout);


    }

    private void onclickListener() {
        buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Button.this, RelativeLayoutActivity.class);
                intent.putExtra(Constants.NAME, "Homer");
                intent.putExtra(Constants.LASTNAME, "Simpsom");
                startActivity(intent);
            }
        });

        buttonSecond.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    final Snackbar snackBar = Snackbar.make(findViewById(R.id.contrain_layout), R.string.dismiss, Snackbar.LENGTH_LONG);
                    snackBar.setAction(R.string.dismiss, new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            snackBar.dismiss();
                        }
                    });
                    snackBar.show();
                }


                return false;
            }
        });
    }


    public void loadSpinner(View view){
        Intent intent = new Intent(this, SpinnerActivity.class);
        startActivity(intent);
    }

}
