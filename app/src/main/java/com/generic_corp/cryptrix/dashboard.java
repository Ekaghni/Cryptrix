package com.generic_corp.cryptrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class dashboard extends AppCompatActivity {
    CardView card1,card3,card2,card4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        card1 = findViewById(R.id.aboutCrypto);
        card2 = findViewById(R.id.live_prices_card);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.pred);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TrialAboutCrypto.class));
                finish();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Final_live_prices_about_crypto.class));
                finish();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Support.class));
                finish();
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Future_prediction.class));
                finish();
            }
        });
    }

    public void signOut(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
        finish();
    }

    public void profit(View view) {
        startActivity(new Intent(getApplicationContext(),profitCalculatorRecyclerView.class));
        finish();
    }


}