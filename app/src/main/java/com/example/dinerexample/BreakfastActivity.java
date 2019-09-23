package com.example.dinerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class BreakfastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,Food.breakFastFoods);

        ListView listFoods = (ListView) findViewById(R.id.mealChoices);
        listFoods.setAdapter(listAdapter);

        // create a listener to listen for when a food item is clicked on

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listFoods, View itemView, int position, long id){

                // pass the food name the user clicks on to BreakfastActivity
                Intent intent = new Intent(BreakfastActivity.this, BreakfastDetailActivity.class);
                intent.putExtra(BreakfastDetailActivity.EXTRA_FOOD_ID, (int) id);
                startActivity(intent);
            }
        };

        // assign the listener to the view
        listFoods.setOnItemClickListener(itemClickListener);
    }
}
