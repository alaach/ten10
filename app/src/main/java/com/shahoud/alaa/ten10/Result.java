package com.shahoud.alaa.ten10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Result extends Activity {

    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_layout);

        textView = (TextView)findViewById(R.id.result);
        button = (Button)findViewById(R.id.pay);

        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(MainActivity.resultInt);
        String str = sb.toString();

        textView.setText(str+ "RM");

        if(MainActivity.resultInt == 0){
            button.setVisibility(View.GONE);
        }else{
            button.setVisibility(View.VISIBLE);
        }
    }

    public void payMethod(View view) {
        // get resultInt to 0 again
        MainActivity.resultInt = 0;
        Toast.makeText(this,"Thank you have a nice day",Toast.LENGTH_SHORT).show();
        finish();
    }
}
