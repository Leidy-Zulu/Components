package com.example.components;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_vs_linear);
    }

    public void loadSpinner(View view){
        Intent intent = new Intent(this, SpinnerActivity.class);
        startActivity(intent);
    }

    public void loadLayout(View view){
        Intent intent = new Intent(this, LayoutActivity.class);
        intent.putExtra("parametro1", "Homer");
        intent.putExtra("parametro2", "Simpsom");
        startActivity(intent);
    }
}
