package com.generic_corp.cryptrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.generic_corp.cryptrix.model.Is_cryptocurrency_legal_about_cryptocurrency;

public class TrialAboutCrypto extends AppCompatActivity {
    CardView cardView1,cardview2,cardView3,cardView4,cardView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trial_about_crypto);

        cardView1 = findViewById(R.id.about_crypto_cardx1);
        cardview2 = findViewById(R.id.about_crypto_cardx2);
        cardView3 = findViewById(R.id.about_crypto_cardx3);
        cardView4 = findViewById(R.id.about_crypto_cardx4);
        cardView5 = findViewById(R.id.about_crypto_cardx5);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),What_is_cryptocurrency_about_crpytocurrency.class));
                finish();
            }
        });
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Is_cryptocurrency_legal_final.class));
                finish();
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), How_to_invest_in_cryptocurrencies_about_crypto_trial.class));
                finish();
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), List_of_cryptocurrencies_about_crypto.class));
                finish();
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), How_to_mine_crypto_about_crypto.class));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),dashboard.class));
    }
}