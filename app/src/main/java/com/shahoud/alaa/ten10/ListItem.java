package com.shahoud.alaa.ten10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class ListItem extends Activity {

    ArrayAdapter<String> adapter;

    String[] food = {"Baked Beans 12RM","Breakfast Cereals 9RM","Fish Sandwich 15RM","Vegetables Sandwich 11RM",
            "Chips 4RM","Snickers 3RM","Twix 3RM","Bounty 3RM","Dried Fruit 5RM",
            "Honey 6RM","Jelly 2RM","Mexican Food 12RM","noodles 7RM","Nuts 18RM","Pasta 12RM","Peanut Butter 3RM",
            "Pasta Sauce 8RM","Salad 10RM",
            "Watermelon 5RM","Melon 5RM","Sweet Biscuits 3RM"};

    String[] drink = {"Coca Cola 2RM","Pepsi 2RM","Mineral Water 1RM",
            "Fruit Juice 5RM","Nescafe 3RM","Milo 3RM",
            "Nestle 3RM","Can juice 2RM","Energy Drink 5RM"};

    String[] beauty = {"Mouthwash 7RM","Deodorants 19RM","Dental floss 10RM","Tissues 3RM",
            "Wax 6RM","Gel 6RM","Toothpaste 24RM","Toothbrush 20RM","Soap 12RM"};



    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        list = (ListView)findViewById(R.id.list);

        Intent i = getIntent();
        String s = i.getExtras().getString("extra");
        if(s.equals("food")){
            adapter = new ArrayAdapter<String>(ListItem.this,android.R.layout.simple_list_item_2, android.R.id.text1,food);
        }else if(s.equals("drink")){
            adapter = new ArrayAdapter<String>(ListItem.this,android.R.layout.simple_list_item_2, android.R.id.text1,drink);
        }else if(s.equals("beauty")){
            adapter = new ArrayAdapter<String>(ListItem.this,android.R.layout.simple_list_item_2, android.R.id.text1,beauty);
        }

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /* we will show the "available" or out of stock based on even or odd (arbitrarily)
                    in a real case scenario we will have a database linked to the cashier of the Ten10 supermarket
                    so we can keep track of the items and determine exactly when the item is out of stock
                 */


                String hold = (String)adapter.getItem(position);



                if(position % 2 == 0){
                    // even show available
                    Intent availableIntent = new Intent(ListItem.this,ShowCaseAvailable.class);
                    availableIntent.putExtra("itemName",hold);

                    startActivity(availableIntent);

                }else{
                    // odd show out of stock
                    Intent outIntent = new Intent(ListItem.this,ShowCaseOut.class);
                    outIntent.putExtra("itemName",hold);

                    startActivity(outIntent);

                }

            }
        });
    }
}




