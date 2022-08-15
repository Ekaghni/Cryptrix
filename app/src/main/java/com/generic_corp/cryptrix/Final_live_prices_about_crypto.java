package com.generic_corp.cryptrix;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.collection.LLRBNode;

public class Final_live_prices_about_crypto extends AppCompatActivity {

    //btc
    TextView btc_usd_live_price,btc_inr_live_price,btc_precentage;
    MaterialCardView btc_cardview;
    AppCompatImageView btc_arrow;

    //etherium
    TextView etherium_usd_live_price,etherium_inr_live_price,etherium_precentage;
    MaterialCardView etherium_cardview;
    AppCompatImageView etherium_arrow;

    //tether
    TextView tether_usd_live_price,tether_inr_live_price,tether_precentage;
    MaterialCardView tether_cardview;
    AppCompatImageView tether_arrow;

    //binance
    TextView binance_usd_live_price,binance_inr_live_price,binance_precentage;
    MaterialCardView binance_cardview;
    AppCompatImageView binance_arrow;

    //cardano
    TextView cardano_usd_live_price,cardano_inr_live_price,cardano_precentage;
    MaterialCardView cardano_cardview;
    AppCompatImageView cardano_arrow;

    //dogecoin
    TextView dogecoin_usd_live_price,dogecoin_inr_live_price,dogecoin_precentage;
    MaterialCardView dogecoin_cardview;
    AppCompatImageView dogecoin_arrow;

    //xrp
    TextView xrp_usd_live_price,xrp_inr_live_price,xrp_precentage;
    MaterialCardView xrp_cardview;
    AppCompatImageView xrp_arrow;

    //polkadot
    TextView polkadot_usd_live_price,polkadot_inr_live_price,polkadot_precentage;
    MaterialCardView polkadot_cardview;
    AppCompatImageView polkadot_arrow;

    //uniswap
    TextView uniswap_usd_live_price,uniswap_inr_live_price,uniswap_precentage;
    MaterialCardView uniswap_cardview;
    AppCompatImageView uniswap_arrow;

    //litecoin
    TextView litecoin_usd_live_price,litecoin_inr_live_price,litecoin_precentage;
    MaterialCardView litecoin_cardview;
    AppCompatImageView litecoin_arrow;

    //solana
    TextView solana_usd_live_price,solana_inr_live_price,solana_precentage;
    MaterialCardView solana_cardview;
    AppCompatImageView solana_arrow;

    //chainlink
    TextView chainlink_usd_live_price,chainlink_inr_live_price,chainlink_precentage;
    MaterialCardView chainlink_cardview;
    AppCompatImageView chainlink_arrow;

    //theta
    TextView theta_usd_live_price,theta_inr_live_price,theta_precentage;
    MaterialCardView theta_cardview;
    AppCompatImageView theta_arrow;

    //polygon
    TextView polygon_usd_live_price,polygon_inr_live_price,polygon_precentage;
    MaterialCardView polygon_cardview;
    AppCompatImageView polygon_arrow;

    //stellar
    TextView stellar_usd_live_price,stellar_inr_live_price,stellar_precentage;
    MaterialCardView stellar_cardview;
    AppCompatImageView stellar_arrow;

    //vechain
    TextView vechain_usd_live_price,vechain_inr_live_price,vechain_precentage;
    MaterialCardView vechain_cardview;
    AppCompatImageView vechain_arrow;

    //filecoin
    TextView filecoin_usd_live_price,filecoin_inr_live_price,filecoin_precentage;
    MaterialCardView filecoin_cardview;
    AppCompatImageView filecoin_arrow;

    //dai
    TextView dai_usd_live_price,dai_inr_live_price,dai_precentage;
    MaterialCardView dai_cardview;
    AppCompatImageView dai_arrow;


    FirebaseDatabase database;
    DatabaseReference bitcoin_data_ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_live_prices_about_crypto);

        //Bitcoin initialisations-
        btc_usd_live_price = findViewById(R.id.btc_usd_live_prices);
        btc_inr_live_price = findViewById(R.id.btc_inr_live_prices);
        btc_cardview = findViewById(R.id.btc_percentage_cardview);
        btc_arrow = findViewById(R.id.btc_percentage_arrow);
        btc_precentage = findViewById(R.id.btc_percentage);

        //Etherium initialisations-
        etherium_usd_live_price = findViewById(R.id.etherium_usd_live_prices);
        etherium_inr_live_price = findViewById(R.id.etherium_inr_live_prices);
        etherium_cardview = findViewById(R.id.etherium_percentage_cardview);
        etherium_arrow = findViewById(R.id.etherium_percentage_arrow);
        etherium_precentage = findViewById(R.id.etherium_percentage);

        //Tether initialisations-
        tether_usd_live_price = findViewById(R.id.tether_usd_live_prices);
        tether_inr_live_price = findViewById(R.id.tether_inr_live_prices);
        tether_cardview = findViewById(R.id.tether_percentage_cardview);
        tether_arrow = findViewById(R.id.tether_percentage_arrow);
        tether_precentage = findViewById(R.id.tether_percentage);

        //Binance initialisations-
        binance_usd_live_price = findViewById(R.id.binance_usd_live_prices);
        binance_inr_live_price = findViewById(R.id.binance_inr_live_prices);
        binance_cardview = findViewById(R.id.binance_percentage_cardview);
        binance_arrow = findViewById(R.id.binance_percentage_arrow);
        binance_precentage = findViewById(R.id.binance_percentage);

        //Cardano initialisations-
        cardano_usd_live_price = findViewById(R.id.cardano_usd_live_prices);
        cardano_inr_live_price = findViewById(R.id.cardano_inr_live_prices);
        cardano_cardview = findViewById(R.id.cardano_percentage_cardview);
        cardano_arrow = findViewById(R.id.cardano_percentage_arrow);
        cardano_precentage = findViewById(R.id.cardano_percentage);

        //Dogecoin initialisations-
        dogecoin_usd_live_price = findViewById(R.id.dogecoin_usd_live_prices);
        dogecoin_inr_live_price = findViewById(R.id.dogecoin_inr_live_prices);
        dogecoin_cardview = findViewById(R.id.dogecoin_percentage_cardview);
        dogecoin_arrow = findViewById(R.id.dogecoin_percentage_arrow);
        dogecoin_precentage = findViewById(R.id.dogecoin_percentage);

        //Xrp initialisations-
        xrp_usd_live_price = findViewById(R.id.xrp_usd_live_prices);
        xrp_inr_live_price = findViewById(R.id.xrp_inr_live_prices);
        xrp_cardview = findViewById(R.id.xrp_percentage_cardview);
        xrp_arrow = findViewById(R.id.xrp_percentage_arrow);
        xrp_precentage = findViewById(R.id.xrp_percentage);

        //Polkadot initialisations-
        polkadot_usd_live_price = findViewById(R.id.polkadot_usd_live_prices);
        polkadot_inr_live_price = findViewById(R.id.polkadot_inr_live_prices);
        polkadot_cardview = findViewById(R.id.polkadot_percentage_cardview);
        polkadot_arrow = findViewById(R.id.polkadot_percentage_arrow);
        polkadot_precentage = findViewById(R.id.polkadot_percentage);

        //Uniswap initialisations-
        uniswap_usd_live_price = findViewById(R.id.uniswap_usd_live_prices);
        uniswap_inr_live_price = findViewById(R.id.uniswap_inr_live_prices);
        uniswap_cardview = findViewById(R.id.uniswap_percentage_cardview);
        uniswap_arrow = findViewById(R.id.uniswap_percentage_arrow);
        uniswap_precentage = findViewById(R.id.uniswap_percentage);

        //Litecoin initialisations-
        litecoin_usd_live_price = findViewById(R.id.litecoin_usd_live_prices);
        litecoin_inr_live_price = findViewById(R.id.litecoin_inr_live_prices);
        litecoin_cardview = findViewById(R.id.litecoin_percentage_cardview);
        litecoin_arrow = findViewById(R.id.litecoin_percentage_arrow);
        litecoin_precentage = findViewById(R.id.litecoin_percentage);

        //Solana initialisations-
        solana_usd_live_price = findViewById(R.id.solana_usd_live_prices);
        solana_inr_live_price = findViewById(R.id.solana_inr_live_prices);
        solana_cardview = findViewById(R.id.solana_percentage_cardview);
        solana_arrow = findViewById(R.id.solana_percentage_arrow);
        solana_precentage = findViewById(R.id.solana_percentage);

        //Chainlink initialisations-
        chainlink_usd_live_price = findViewById(R.id.chainlink_usd_live_prices);
        chainlink_inr_live_price = findViewById(R.id.chainlink_inr_live_prices);
        chainlink_cardview = findViewById(R.id.chainlink_percentage_cardview);
        chainlink_arrow = findViewById(R.id.chainlink_percentage_arrow);
        chainlink_precentage = findViewById(R.id.chainlink_percentage);

        //Theta initialisations-
        theta_usd_live_price = findViewById(R.id.theta_usd_live_prices);
        theta_inr_live_price = findViewById(R.id.theta_inr_live_prices);
        theta_cardview = findViewById(R.id.theta_percentage_cardview);
        theta_arrow = findViewById(R.id.theta_percentage_arrow);
        theta_precentage = findViewById(R.id.theta_percentage);

        //Polygon initialisations-
        polygon_usd_live_price = findViewById(R.id.polygon_usd_live_prices);
        polygon_inr_live_price = findViewById(R.id.polygon_inr_live_prices);
        polygon_cardview = findViewById(R.id.polygon_percentage_cardview);
        polygon_arrow = findViewById(R.id.polygon_percentage_arrow);
        polygon_precentage = findViewById(R.id.polygon_percentage);

        //Stellar initialisations-
        stellar_usd_live_price = findViewById(R.id.stellar_usd_live_prices);
        stellar_inr_live_price = findViewById(R.id.stellar_inr_live_prices);
        stellar_cardview = findViewById(R.id.stellar_percentage_cardview);
        stellar_arrow = findViewById(R.id.stellar_percentage_arrow);
        stellar_precentage = findViewById(R.id.stellar_percentage);

        //Vechain initialisations-
        vechain_usd_live_price = findViewById(R.id.vechain_usd_live_prices);
        vechain_inr_live_price = findViewById(R.id.vechain_inr_live_prices);
        vechain_cardview = findViewById(R.id.vechain_percentage_cardview);
        vechain_arrow = findViewById(R.id.vechain_percentage_arrow);
        vechain_precentage = findViewById(R.id.vechain_percentage);

        //Filecoin initialisations-
        filecoin_usd_live_price = findViewById(R.id.filecoin_usd_live_prices);
        filecoin_inr_live_price = findViewById(R.id.filecoin_inr_live_prices);
        filecoin_cardview = findViewById(R.id.filecoin_percentage_cardview);
        filecoin_arrow = findViewById(R.id.filecoin_percentage_arrow);
        filecoin_precentage = findViewById(R.id.filecoin_percentage);

        //Dai initialisations-
        dai_usd_live_price = findViewById(R.id.dai_usd_live_prices);
        dai_inr_live_price = findViewById(R.id.dai_inr_live_prices);
        dai_cardview = findViewById(R.id.dai_percentage_cardview);
        dai_arrow = findViewById(R.id.dai_percentage_arrow);
        dai_precentage = findViewById(R.id.dai_percentage);



        database = FirebaseDatabase.getInstance("https://cryptrix-f9a82-default-rtdb.asia-southeast1.firebasedatabase.app/");
        bitcoin_data_ref = database.getReference();
        Log.d("Success0","xyz");

        //Functions calling-

        Bitcoin_Lp();
        Etherium_Lp();
        Tether_Lp();
        Binance_Lp();
        Cardano_Lp();
        Dogecoin_Lp();
        Xrp_Lp();
        Polkadot();
        Uniswap();
        Litecoin();
        Solana();
        Chainlink();
        Theta();
        Polygon();
        Stellar();
        Vechain();
        Filecoin();
        Dai();



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), dashboard.class));
    }

    //Bitcoin function-

    public void Bitcoin_Lp(){

        bitcoin_data_ref.child("livePrice").child("bitcoin").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Bitcoin_Price_Integer = snapshot.child("INR").getValue(String.class);
                    btc_inr_live_price.setText(inr_Bitcoin_Price_Integer);
                    String usd_Bitcoin_Price_Integer = snapshot.child("USD").getValue(String.class);
                    btc_usd_live_price.setText(usd_Bitcoin_Price_Integer);
                    String percentage_Bitcoin_Integer = snapshot.child("percentage").getValue(String.class);
                    btc_precentage.setText(percentage_Bitcoin_Integer);
                    float percent = Float.parseFloat(percentage_Bitcoin_Integer);
                    if (percent<0){
                        btc_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        btc_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        btc_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        btc_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Etherium Function -

    public void Etherium_Lp(){

        bitcoin_data_ref.child("livePrice").child("etherium").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Etherium_Price_Integer = snapshot.child("INR").getValue(String.class);
                    etherium_inr_live_price.setText(inr_Etherium_Price_Integer);
                    String usd_Etherium_Price_Integer = snapshot.child("USD").getValue(String.class);
                    etherium_usd_live_price.setText(usd_Etherium_Price_Integer);
                    String percentage_Etherium_Integer = snapshot.child("percentage").getValue(String.class);
                    etherium_precentage.setText(percentage_Etherium_Integer);
                    float percent = Float.parseFloat(percentage_Etherium_Integer);
                    if (percent<0){
                        etherium_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        etherium_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        etherium_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        etherium_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Tether Function -

    public void Tether_Lp(){

        bitcoin_data_ref.child("livePrice").child("tether").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Tether_Price_Integer = snapshot.child("INR").getValue(String.class);
                    tether_inr_live_price.setText(inr_Tether_Price_Integer);
                    String usd_Tether_Price_Integer = snapshot.child("USD").getValue(String.class);
                    tether_usd_live_price.setText(usd_Tether_Price_Integer);
                    String percentage_Tether_Integer = snapshot.child("percentage").getValue(String.class);
                    tether_precentage.setText(percentage_Tether_Integer);
                    float percent = Float.parseFloat(percentage_Tether_Integer);
                    if (percent<0){
                        tether_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        tether_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        tether_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        tether_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Tether Function -

    public void Binance_Lp(){

        bitcoin_data_ref.child("livePrice").child("binance").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Binance_Price_Integer = snapshot.child("INR").getValue(String.class);
                    binance_inr_live_price.setText(inr_Binance_Price_Integer);
                    String usd_Binance_Price_Integer = snapshot.child("USD").getValue(String.class);
                    binance_usd_live_price.setText(usd_Binance_Price_Integer);
                    String percentage_Binance_Integer = snapshot.child("percentage").getValue(String.class);
                    binance_precentage.setText(percentage_Binance_Integer);
                    float percent = Float.parseFloat(percentage_Binance_Integer);
                    if (percent<0){
                        binance_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        binance_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        binance_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        binance_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Cardano Function -

    public void Cardano_Lp(){

        bitcoin_data_ref.child("livePrice").child("cardano").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Cardano_Price_Integer = snapshot.child("INR").getValue(String.class);
                    cardano_inr_live_price.setText(inr_Cardano_Price_Integer);
                    String usd_Cardano_Price_Integer = snapshot.child("USD").getValue(String.class);
                    cardano_usd_live_price.setText(usd_Cardano_Price_Integer);
                    String percentage_Cardano_Integer = snapshot.child("percentage").getValue(String.class);
                    cardano_precentage.setText(percentage_Cardano_Integer);
                    float percent = Float.parseFloat(percentage_Cardano_Integer);
                    if (percent<0){
                        cardano_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        cardano_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        cardano_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        cardano_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Dogecoin Function -

    public void Dogecoin_Lp(){

        bitcoin_data_ref.child("livePrice").child("dogecoin").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Dogecoin_Price_Integer = snapshot.child("INR").getValue(String.class);
                    dogecoin_inr_live_price.setText(inr_Dogecoin_Price_Integer);
                    String usd_Dogecoin_Price_Integer = snapshot.child("USD").getValue(String.class);
                    dogecoin_usd_live_price.setText(usd_Dogecoin_Price_Integer);
                    String percentage_Dogecoin_Integer = snapshot.child("percentage").getValue(String.class);
                    dogecoin_precentage.setText(percentage_Dogecoin_Integer);
                    float percent = Float.parseFloat(percentage_Dogecoin_Integer);
                    if (percent<0){
                        dogecoin_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        dogecoin_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        dogecoin_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        dogecoin_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Xrp Function -

    public void Xrp_Lp(){

        bitcoin_data_ref.child("livePrice").child("xrp").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Xrp_Price_Integer = snapshot.child("INR").getValue(String.class);
                    xrp_inr_live_price.setText(inr_Xrp_Price_Integer);
                    String usd_Xrp_Price_Integer = snapshot.child("USD").getValue(String.class);
                    xrp_usd_live_price.setText(usd_Xrp_Price_Integer);
                    String percentage_Xrp_Integer = snapshot.child("percentage").getValue(String.class);
                    xrp_precentage.setText(percentage_Xrp_Integer);
                    float percent = Float.parseFloat(percentage_Xrp_Integer);
                    if (percent<0){
                        xrp_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        xrp_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        xrp_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        xrp_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Polkadot Function -

    public void Polkadot(){

        bitcoin_data_ref.child("livePrice").child("polkadot").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Polkadot_Price_Integer = snapshot.child("INR").getValue(String.class);
                    polkadot_inr_live_price.setText(inr_Polkadot_Price_Integer);
                    String usd_Polkadot_Price_Integer = snapshot.child("USD").getValue(String.class);
                    polkadot_usd_live_price.setText(usd_Polkadot_Price_Integer);
                    String percentage_Polkadot_Integer = snapshot.child("percentage").getValue(String.class);
                    polkadot_precentage.setText(percentage_Polkadot_Integer);
                    float percent = Float.parseFloat(percentage_Polkadot_Integer);
                    if (percent<0){
                        polkadot_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        polkadot_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        polkadot_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        polkadot_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Uniswap Function -

    public void Uniswap(){

        bitcoin_data_ref.child("livePrice").child("uniswap").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Uniswap_Price_Integer = snapshot.child("INR").getValue(String.class);
                    uniswap_inr_live_price.setText(inr_Uniswap_Price_Integer);
                    String usd_Uniswap_Price_Integer = snapshot.child("USD").getValue(String.class);
                    uniswap_usd_live_price.setText(usd_Uniswap_Price_Integer);
                    String percentage_Uniswap_Integer = snapshot.child("percentage").getValue(String.class);
                    uniswap_precentage.setText(percentage_Uniswap_Integer);
                    float percent = Float.parseFloat(percentage_Uniswap_Integer);
                    if (percent<0){
                        uniswap_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        uniswap_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        uniswap_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        uniswap_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Litecoin Function -

    public void Litecoin(){

        bitcoin_data_ref.child("livePrice").child("litecoin").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Litecoin_Price_Integer = snapshot.child("INR").getValue(String.class);
                    litecoin_inr_live_price.setText(inr_Litecoin_Price_Integer);
                    String usd_Litecoin_Price_Integer = snapshot.child("USD").getValue(String.class);
                    litecoin_usd_live_price.setText(usd_Litecoin_Price_Integer);
                    String percentage_Litecoin_Integer = snapshot.child("percentage").getValue(String.class);
                    litecoin_precentage.setText(percentage_Litecoin_Integer);
                    float percent = Float.parseFloat(percentage_Litecoin_Integer);
                    if (percent<0){
                        litecoin_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        litecoin_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        litecoin_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        litecoin_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Solana Function -

    public void Solana(){

        bitcoin_data_ref.child("livePrice").child("solana").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Solana_Price_Integer = snapshot.child("INR").getValue(String.class);
                    solana_inr_live_price.setText(inr_Solana_Price_Integer);
                    String usd_Solana_Price_Integer = snapshot.child("USD").getValue(String.class);
                    solana_usd_live_price.setText(usd_Solana_Price_Integer);
                    String percentage_Solana_Integer = snapshot.child("percentage").getValue(String.class);
                    solana_precentage.setText(percentage_Solana_Integer);
                    float percent = Float.parseFloat(percentage_Solana_Integer);
                    if (percent<0){
                        solana_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        solana_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        solana_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        solana_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Chainlink Function -

    public void Chainlink(){

        bitcoin_data_ref.child("livePrice").child("chainlink").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Chainlink_Price_Integer = snapshot.child("INR").getValue(String.class);
                    chainlink_inr_live_price.setText(inr_Chainlink_Price_Integer);
                    String usd_Chainlink_Price_Integer = snapshot.child("USD").getValue(String.class);
                    chainlink_usd_live_price.setText(usd_Chainlink_Price_Integer);
                    String percentage_Chainlink_Integer = snapshot.child("percentage").getValue(String.class);
                    chainlink_precentage.setText(percentage_Chainlink_Integer);
                    float percent = Float.parseFloat(percentage_Chainlink_Integer);
                    if (percent<0){
                        chainlink_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        chainlink_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        chainlink_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        chainlink_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Theta Function -

    public void Theta(){

        bitcoin_data_ref.child("livePrice").child("theta").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Theta_Price_Integer = snapshot.child("INR").getValue(String.class);
                    theta_inr_live_price.setText(inr_Theta_Price_Integer);
                    String usd_Theta_Price_Integer = snapshot.child("USD").getValue(String.class);
                    theta_usd_live_price.setText(usd_Theta_Price_Integer);
                    String percentage_Theta_Integer = snapshot.child("percentage").getValue(String.class);
                    theta_precentage.setText(percentage_Theta_Integer);
                    float percent = Float.parseFloat(percentage_Theta_Integer);
                    if (percent<0){
                        theta_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        theta_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        theta_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        theta_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Polygon Function -

    public void Polygon(){

        bitcoin_data_ref.child("livePrice").child("polygon").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Polygon_Price_Integer = snapshot.child("INR").getValue(String.class);
                    polygon_inr_live_price.setText(inr_Polygon_Price_Integer);
                    String usd_Polygon_Price_Integer = snapshot.child("USD").getValue(String.class);
                    polygon_usd_live_price.setText(usd_Polygon_Price_Integer);
                    String percentage_Polygon_Integer = snapshot.child("percentage").getValue(String.class);
                    polygon_precentage.setText(percentage_Polygon_Integer);
                    float percent = Float.parseFloat(percentage_Polygon_Integer);
                    if (percent<0){
                        polygon_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        polygon_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        polygon_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        polygon_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Stellar Function -

    public void Stellar(){

        bitcoin_data_ref.child("livePrice").child("stellar").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Stellar_Price_Integer = snapshot.child("INR").getValue(String.class);
                    stellar_inr_live_price.setText(inr_Stellar_Price_Integer);
                    String usd_Stellar_Price_Integer = snapshot.child("USD").getValue(String.class);
                    stellar_usd_live_price.setText(usd_Stellar_Price_Integer);
                    String percentage_Stellar_Integer = snapshot.child("percentage").getValue(String.class);
                    stellar_precentage.setText(percentage_Stellar_Integer);
                    float percent = Float.parseFloat(percentage_Stellar_Integer);
                    if (percent<0){
                        stellar_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        stellar_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        stellar_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        stellar_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Vechain Function -

    public void Vechain(){

        bitcoin_data_ref.child("livePrice").child("vechain").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Vechain_Price_Integer = snapshot.child("INR").getValue(String.class);
                    vechain_inr_live_price.setText(inr_Vechain_Price_Integer);
                    String usd_Vechain_Price_Integer = snapshot.child("USD").getValue(String.class);
                    vechain_usd_live_price.setText(usd_Vechain_Price_Integer);
                    String percentage_Vechain_Integer = snapshot.child("percentage").getValue(String.class);
                    vechain_precentage.setText(percentage_Vechain_Integer);
                    float percent = Float.parseFloat(percentage_Vechain_Integer);
                    if (percent<0){
                        vechain_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        vechain_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        vechain_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        vechain_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Filecoin Function -

    public void Filecoin(){

        bitcoin_data_ref.child("livePrice").child("filecoin").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Filecoin_Price_Integer = snapshot.child("INR").getValue(String.class);
                    filecoin_inr_live_price.setText(inr_Filecoin_Price_Integer);
                    String usd_Filecoin_Price_Integer = snapshot.child("USD").getValue(String.class);
                    filecoin_usd_live_price.setText(usd_Filecoin_Price_Integer);
                    String percentage_Filecoin_Integer = snapshot.child("percentage").getValue(String.class);
                    filecoin_precentage.setText(percentage_Filecoin_Integer);
                    float percent = Float.parseFloat(percentage_Filecoin_Integer);
                    if (percent<0){
                        filecoin_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        filecoin_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        filecoin_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        filecoin_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }

    //Dai Function -

    public void Dai(){

        bitcoin_data_ref.child("livePrice").child("dai").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.d("Success1","onData Change is called");
                if (snapshot.exists()) {
                    Log.d("Success2","snapshot exists");

                    String inr_Dai_Price_Integer = snapshot.child("INR").getValue(String.class);
                    dai_inr_live_price.setText(inr_Dai_Price_Integer);
                    String usd_Dai_Price_Integer = snapshot.child("USD").getValue(String.class);
                    dai_usd_live_price.setText(usd_Dai_Price_Integer);
                    String percentage_Dai_Integer = snapshot.child("percentage").getValue(String.class);
                    dai_precentage.setText(percentage_Dai_Integer);
                    float percent = Float.parseFloat(percentage_Dai_Integer);
                    if (percent<0){
                        dai_cardview.setCardBackgroundColor(getResources().getColor(R.color.red));
                        dai_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_downward_24));
                    }
                    else if (percent>0){
                        dai_cardview.setCardBackgroundColor(getResources().getColor(R.color.green));
                        dai_arrow.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_upward_24));
                    }
                }
                else {
                    Toast.makeText(Final_live_prices_about_crypto.this,"Data does not exist!",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Final_live_prices_about_crypto.this,error.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }



}