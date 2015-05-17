package com.shahoud.alaa.ten10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ShowCaseOut extends Activity {

    TextView itemN;
    String itemName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_case_outofstock);

        Intent i = getIntent();

        itemName = i.getExtras().getString("itemName");
        itemN = (TextView)findViewById(R.id.itemName);
        itemN.setText(itemName);
    }

}
