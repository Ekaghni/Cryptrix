package com.generic_corp.cryptrix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.generic_corp.cryptrix.adapter.RecyclerviewAdapter;
import com.generic_corp.cryptrix.model.UserData;

import java.sql.RowId;
import java.util.ArrayList;
import java.util.List;

public class profitCalculatorRecyclerView extends AppCompatActivity {
    RecyclerView userRecycler;
    RecyclerviewAdapter recyclerViewAdapter;
    EditText searchView;
    CharSequence search="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profit_calculator_recycler_view);
        searchView = findViewById(R.id.search_bar);
        List<UserData> userDataList = new ArrayList<>();

        UserData itemone= new UserData("Item 1","Bitcoin","Calculate your profit for Bitcoin investment", R.drawable.bitcoin);
        UserData itemtwo = new UserData("Item 2","Etherium","Calculate your profit for Etherium investment", R.drawable.etherium);
        UserData itemthree = new UserData("Item 3","Tether","Calculate your profit for Tether investment", R.drawable.tether);
        UserData itemfour = new UserData("Item 4","Binance Coin","Calculate your profit for Binance Coin investment", R.drawable.binance);
        UserData itemfive = new UserData("Item 5","Cardano","Calculate your profit for Cardano investment", R.drawable.cardano);
        UserData itemsix = new UserData("Item 6","Dogecoin","Calculate your profit for Dogecoin investment", R.drawable.dogecoin);
        UserData itemseven = new UserData("Item 7","XRP","Calculate your profit for XRP investment", R.drawable.xrp);
        UserData itemeight = new UserData("Item 8","Polkadot","Calculate your profit for Polkadot investment", R.drawable.polkadot_coin);
        UserData itemnine = new UserData("Item 9","Uniswap","Calculate your profit for Uniswap investment", R.drawable.uniswap_coin);
        UserData itemten = new UserData("Item 10","Litecoin","Calculate your profit for Litecoin investment", R.drawable.litecoin_coin);
        UserData itemeleven = new UserData("Item 11","Solana","Calculate your profit for Solana Coin investment", R.drawable.solana);
        UserData itemtwelve = new UserData("Item 12","Chainlink","Calculate your profit for Chainlink investment", R.drawable.chainlink);
        UserData itemthirteen = new UserData("Item 13","Theta","Calculate your profit for Theta investment", R.drawable.theta_coin);
        UserData itemfourteen = new UserData("Item 14","Polygon","Calculate your profit for Polygon investment", R.drawable.polygon_coin);
        UserData itemfifteen = new UserData("Item 15","Stellar","Calculate your profit for Stellar investment", R.drawable.stellar_coin);
        UserData itemsixteen = new UserData("Item 16","VeChain","Calculate your profit for VeChain investment", R.drawable.vechain_coin);
        UserData itemseventeen = new UserData("Item 17","Filecoin","Calculate your profit for Filecoin investment", R.drawable.filecoin_coin);
        UserData itemeightteen = new UserData("Item 18","Dai","Calculate your profit for Dai investment", R.drawable.dai_coin);
        userDataList.add(itemone);
        userDataList.add(itemtwo);
        userDataList.add(itemthree);
        userDataList.add(itemfour);
        userDataList.add(itemfive);
        userDataList.add(itemsix);
        userDataList.add(itemseven);
        userDataList.add(itemeight);
        userDataList.add(itemnine);
        userDataList.add(itemten);
        userDataList.add(itemeleven);
        userDataList.add(itemtwelve);
        userDataList.add(itemthirteen);
        userDataList.add(itemfourteen);
        userDataList.add(itemfifteen);
        userDataList.add(itemsixteen);
        userDataList.add(itemseventeen);
        userDataList.add(itemeightteen);
        setUserRecycler(userDataList);

        searchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                recyclerViewAdapter.getFilter().filter(charSequence);
                search = charSequence;
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), dashboard.class));
    }

    private void setUserRecycler(List<UserData> userDataList){

        userRecycler = findViewById(R.id.userRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        userRecycler.setLayoutManager(layoutManager);
        recyclerViewAdapter = new RecyclerviewAdapter(this, userDataList);
        userRecycler.setAdapter(recyclerViewAdapter);
    }
}