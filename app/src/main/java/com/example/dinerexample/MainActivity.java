package com.example.dinerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id){
                if(position == 0){
                    Intent intent = new Intent(MainActivity.this, BreakfastActivity.class);
                    startActivity(intent);
                }
            }
        };

        //Add listener to the list view
        ListView listView = (ListView) findViewById(R.id.mealChoices);
        listView.setOnItemClickListener(itemClickListener);
    }
}
