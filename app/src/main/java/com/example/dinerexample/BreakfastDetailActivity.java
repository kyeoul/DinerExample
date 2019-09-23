package com.example.dinerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BreakfastDetailActivity extends AppCompatActivity {

    public static final String EXTRA_FOOD_ID = "foodChoice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_detail);

        Intent intent = getIntent();
        int foodId = intent.getIntExtra(EXTRA_FOOD_ID, 0);

        Food myFood = Food.breakFastFoods[foodId];

        ImageView photo = (ImageView) findViewById(R.id.food_pic);
        TextView name = (TextView) findViewById(R.id. food_name);
        TextView desc = (TextView) findViewById(R.id.food_desc);
        TextView price = (TextView) findViewById(R.id.food_price);
        photo.setImageResource((myFood.getImageResourseID()));
        name.setText(myFood.getFoodName());
        desc.setText(myFood.getDescription());
        price.setText("$" + myFood.getPrice());
    }
}
