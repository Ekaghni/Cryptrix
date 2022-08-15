package com.generic_corp.cryptrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EtheriumProfitCalculator extends AppCompatActivity {
    EditText editText1, editText2, editText3;
    Button button;
    TextView textView;
    float edt1, edt2, edt3;
    float totalCoins,profit,increment=40000,finalPrice;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etherium_profit_calculator);
        editText1 = (EditText) findViewById(R.id.priceOfOneCoinEtherium);
        editText2 = (EditText)findViewById(R.id.totalInvestmentEtherium);
        editText3 = (EditText)findViewById(R.id.incrementValueEtherium);
        button = (Button) findViewById(R.id.calculateButtonEtherium);
        textView = (TextView) findViewById(R.id.textView_profitCalculator_Etherium);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1 = Float.parseFloat(editText1.getText().toString());
                edt2 = Float.parseFloat(editText2.getText().toString());
                edt3 = Float.parseFloat(editText3.getText().toString());
                totalCoins = edt2/edt1;
                profit = increment*totalCoins*edt3;
                finalPrice = edt1+profit;
                text = String.format("You are purchasing- %.2f Etherium \n After %.0f years. Your profit will be- Rs.%.2f \n Total amount of your Bitcoins will be Rs.%.2f ",totalCoins,edt3,profit,finalPrice);
                textView.setText(text);

            }
        });


    }

}