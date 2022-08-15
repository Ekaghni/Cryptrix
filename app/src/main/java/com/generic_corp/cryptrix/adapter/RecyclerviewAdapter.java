package com.generic_corp.cryptrix.adapter;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.generic_corp.cryptrix.EtheriumProfitCalculator;
import com.generic_corp.cryptrix.R;
import com.generic_corp.cryptrix.binance_profit_calculator;
import com.generic_corp.cryptrix.cardano_profit_calculator;
import com.generic_corp.cryptrix.chainlink_profit_calculator;
import com.generic_corp.cryptrix.dai_profit_calculator;
import com.generic_corp.cryptrix.dogecoin_profit_calculator;
import com.generic_corp.cryptrix.litecoin_profit_calculator;
import com.generic_corp.cryptrix.model.UserData;
import com.generic_corp.cryptrix.polkadot_profit_calculator;
import com.generic_corp.cryptrix.polygon_profit_calculator;
import com.generic_corp.cryptrix.profitCalculator;
import com.generic_corp.cryptrix.solana_profit_calculator;
import com.generic_corp.cryptrix.stellar_profit_calculator;
import com.generic_corp.cryptrix.tether_profit_calculator;
import com.generic_corp.cryptrix.theta_profit_calculator;
import com.generic_corp.cryptrix.uniswap_profit_calculator;
import com.generic_corp.cryptrix.vechain_profit_calculator;
import com.generic_corp.cryptrix.xrp_profit_calculator;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.RecyclerviewHolder> {

    Context context;
    List<UserData> userDataList;
    List<UserData> filteredUserDataList;

    public RecyclerviewAdapter(Context context, List<UserData> userDataList) {
        this.context = context;
        this.userDataList = userDataList;
        this.filteredUserDataList = userDataList;
    }

    @NonNull
    @Override
    public RecyclerviewAdapter.RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_row_item, parent, false);
        return new RecyclerviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewHolder holder, final int position) {
        UserData row = userDataList.get(position);

        holder.userName.setText(filteredUserDataList.get(position).getUserName());
        holder.userDesc.setText(filteredUserDataList.get(position).getDesc());
        holder.userImage.setImageResource(filteredUserDataList.get(position).getImageUrl());

        itemAnimation.animateFadeIn(holder.itemView, position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (userDataList.get(position).getRowId().matches("Item 1")){
                    Intent intent = new Intent(context, profitCalculator.class);
                    context.startActivity(intent);
                }
                else if (userDataList.get(position).getRowId().matches("Item 2")){
                    Intent intent2 = new Intent(context, EtheriumProfitCalculator.class);
                    context.startActivity(intent2);
                }
                else if (userDataList.get(position).getRowId().matches("Item 3")){
                    Intent intent3 = new Intent(context, tether_profit_calculator.class);
                    context.startActivity(intent3);
                }
                else if (userDataList.get(position).getRowId().matches("Item 4")){
                    Intent intent4 = new Intent(context, binance_profit_calculator.class);
                    context.startActivity(intent4);
                }
                else if (userDataList.get(position).getRowId().matches("Item 5")){
                    Intent intent5 = new Intent(context, cardano_profit_calculator.class);
                    context.startActivity(intent5);
                }else if (userDataList.get(position).getRowId().matches("Item 6")){
                    Intent intent6 = new Intent(context, dogecoin_profit_calculator.class);
                    context.startActivity(intent6);
                }else if (userDataList.get(position).getRowId().matches("Item 7")){
                    Intent intent7 = new Intent(context, xrp_profit_calculator.class);
                    context.startActivity(intent7);
                }else if (userDataList.get(position).getRowId().matches("Item 8")){
                    Intent intent8 = new Intent(context, polkadot_profit_calculator.class);
                    context.startActivity(intent8);
                }else if (userDataList.get(position).getRowId().matches("Item 9")){
                    Intent intent9 = new Intent(context,uniswap_profit_calculator.class );
                    context.startActivity(intent9);
                }else if (userDataList.get(position).getRowId().matches("Item 10")){
                    Intent intent10 = new Intent(context, litecoin_profit_calculator.class);
                    context.startActivity(intent10);
                }else if (userDataList.get(position).getRowId().matches("Item 11")){
                    Intent intent11 = new Intent(context, solana_profit_calculator.class);
                    context.startActivity(intent11);
                }else if (userDataList.get(position).getRowId().matches("Item 12")){
                    Intent intent12 = new Intent(context, chainlink_profit_calculator.class);
                    context.startActivity(intent12);
                }else if (userDataList.get(position).getRowId().matches("Item 13")){
                    Intent intent13 = new Intent(context,theta_profit_calculator.class );
                    context.startActivity(intent13);
                }else if (userDataList.get(position).getRowId().matches("Item 14")){
                    Intent intent14 = new Intent(context, polygon_profit_calculator.class);
                    context.startActivity(intent14);
                }else if (userDataList.get(position).getRowId().matches("Item 15")){
                    Intent intent15 = new Intent(context, stellar_profit_calculator.class);
                    context.startActivity(intent15);
                }else if (userDataList.get(position).getRowId().matches("Item 16")){
                    Intent intent16 = new Intent(context,vechain_profit_calculator.class );
                    context.startActivity(intent16);
                }else if (userDataList.get(position).getRowId().matches("Item 18")){
                    Intent intent17 = new Intent(context, dai_profit_calculator.class);
                    context.startActivity(intent17);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return filteredUserDataList.size();
    }

    public static final class RecyclerviewHolder extends RecyclerView.ViewHolder {


        CircleImageView userImage;
        TextView userName, userDesc, textView11;

        public RecyclerviewHolder(@NonNull View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.userImage);
            userName = itemView.findViewById(R.id.userName);
            userDesc = itemView.findViewById(R.id.userDesc);
            textView11 = itemView.findViewById(R.id.textViewxyz);


        }
    }

    public Filter getFilter(){

        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {

                String Key = charSequence.toString();
                if(Key.isEmpty()){
                    filteredUserDataList = userDataList;
                }
                else{
                    List<UserData> lstFiltered = new ArrayList<>();
                    for(UserData row: userDataList){
                        if(row.getUserName().toLowerCase().contains(Key.toLowerCase())){
                            lstFiltered.add(row);
                        }
                    }
                    filteredUserDataList = lstFiltered;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredUserDataList;
                return filterResults;
            }
            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {

                filteredUserDataList = (List<UserData>)filterResults.values;
                notifyDataSetChanged();

            }
        };

    }


}