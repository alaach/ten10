package com.shahoud.alaa.ten10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class ChooseItem extends Activity {

    final String f = "food";
    final String d = "drink";
    final String b = "beauty";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_item);
    }

    public void foodMethod(View view) {
        Intent foodIntent = new Intent(ChooseItem.this,ListItem.class);
        foodIntent.putExtra("extra",f);
        startActivity(foodIntent);
    }

    public void drinkMethod(View view) {
        Intent drinkIntent = new Intent(ChooseItem.this,ListItem.class);
        drinkIntent.putExtra("extra",d);
        startActivity(drinkIntent);

    }

    public void beautyMethod(View view) {
        Intent beautyIntent = new Intent(ChooseItem.this,ListItem.class);
        beautyIntent.putExtra("extra",b);
        startActivity(beautyIntent);
    }

    public void showCartMethod(View view) {
        Intent i = new Intent(ChooseItem.this,Result.class);
        startActivity(i);
    }
}
