package com.shahoud.alaa.ten10;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends Activity {


    protected static int resultInt =  0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_team) {

            // make an intent to team class
            Intent i = new Intent (this,Team.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void aboutTen(View view) {
        Intent aboutTenIntent = new Intent(MainActivity.this,AboutTen.class);
        startActivity(aboutTenIntent);
    }

    public void workingHours(View view) {
        Intent workingHoursIntent = new Intent(MainActivity.this,WorkingHours.class);
        startActivity(workingHoursIntent);
    }

    public void searchItemMethod(View view) {
        Intent chooseItemIntent = new Intent(MainActivity.this,ChooseItem.class);
        startActivity(chooseItemIntent);
    }
}
