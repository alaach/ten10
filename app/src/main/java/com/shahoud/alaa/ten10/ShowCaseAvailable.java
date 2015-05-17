package com.shahoud.alaa.ten10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class ShowCaseAvailable extends Activity {

    TextView itemN;
    String itemName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_case_available);

        Intent i = getIntent();

        itemName = i.getExtras().getString("itemName");

        itemN = (TextView)findViewById(R.id.itemName);
        itemN.setText(itemName);
    }

    public void addToCartMethod(View view) {

        int length = itemName.length();
        int checker = 0;

        // determine how many digits we have
        for (int i = 0; i < length; i++) {
            Character character = itemName.charAt(i);

            if(Character.isDigit(character)){
                checker++;
            }
        }

        for (int i = 0; i < length; i++) {
            Character character = itemName.charAt(i);

            if (Character.isDigit(character)) {

                if(checker == 2){
                    // the first number
                    MainActivity.resultInt += Character.getNumericValue(character)*10;
                    // cause if to break
                    checker--;
                }else {
                    MainActivity.resultInt += Character.getNumericValue(character);
                }
            }
        }


        Toast.makeText(ShowCaseAvailable.this,"It's been Added",Toast.LENGTH_LONG).show();
    }
}
