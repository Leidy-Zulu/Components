package com.example.components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerAnimals;
    private Spinner spinnerFruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        startSpinnerAnimals();
        startSpinnerFruits();
    }

    private void startSpinnerAnimals(){
        spinnerAnimals = (Spinner) findViewById(R.id.animals_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.animals_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAnimals.setAdapter(adapter);

        //add listener to spinner
        spinnerAnimals.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        parent.getItemAtPosition(pos);
        String stringValue = (String) parent.getSelectedItem();
        Toast.makeText(SpinnerActivity.this, stringValue + ":" + pos, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    /* start spinner fruits */
    private void startSpinnerFruits(){
        spinnerFruits = (Spinner) findViewById(R.id.fruits_spinner);
        ArrayAdapter<String> fruits_adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, getListItems());
        fruits_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFruits.setAdapter(fruits_adapter);
    }

    private List<String> getListItems(){
        List<String> fruistArray = new ArrayList<>();
        fruistArray.add("Apple");
        fruistArray.add("Banana");
        fruistArray.add("Papaya");
        fruistArray.add("Mango");
        fruistArray.add("Mandarine");
        return fruistArray;
    }

}

