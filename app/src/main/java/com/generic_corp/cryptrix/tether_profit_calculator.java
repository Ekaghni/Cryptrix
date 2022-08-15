package com.generic_corp.cryptrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tether_profit_calculator extends AppCompatActivity {

    EditText editText1, editText2, editText3;
    Button button;
    TextView textView;
    float edt1, edt2, edt3;
    float totalCoins,profit,increment= (float) 12.35,finalPrice;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tether_profit_calculator);
        Log.d("tether_success","0");
        editText1 = (EditText) findViewById(R.id.priceOfOneCoinEtherium);
        editText2 = (EditText)findViewById(R.id.totalInvestmentEtherium);
        editText3 = (EditText)findViewById(R.id.incrementValueEtherium);
        button = (Button) findViewById(R.id.calculateButtonEtherium);
        textView = (TextView) findViewById(R.id.textView_profitCalculator_Etherium);
        Log.d("tether_success","1");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tether_success","2");
                edt1 = Float.parseFloat(editText1.getText().toString());
                edt2 = Float.parseFloat(editText2.getText().toString());
                edt3 = Float.parseFloat(editText3.getText().toString());
                totalCoins = edt2/edt1;
                profit = increment*totalCoins*edt3;
                finalPrice = edt1+profit;
                text = String.format("You are purchasing- %.2f Tether \n After %.0f years. Your profit will be- Rs.%.2f \n Total amount of your Tethers will be Rs.%.2f ",totalCoins,edt3,profit,finalPrice);
                textView.setText(text);

            }
        });
    }
}