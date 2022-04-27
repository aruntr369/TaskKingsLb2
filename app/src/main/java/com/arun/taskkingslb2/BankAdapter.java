package com.arun.taskkingslb2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BankAdapter extends RecyclerView.Adapter<BankAdapter.MyViewHolder> {

    Context context;
    List<BankData> bankList;

    public BankAdapter(Context context, List<BankData> bankList) {
        this.context = context;
        this.bankList = bankList;
    }

    @NonNull
    @Override
    public BankAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BankAdapter.MyViewHolder holder, int position) {

        BankData bankData = bankList.get(position);
        holder.name.setText(bankData.getBranch_name());
        holder.date.setText("Created date :"+bankData.getCreated_date());
        holder.address.setText("Branch Address :"+bankData.getBranch_address());
    }

    @Override
    public int getItemCount() {
        return bankList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name , address , date ;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.user_iname);
            date = itemView.findViewById(R.id.tvDate);
            address = itemView.findViewById(R.id.tvAdress);
        }
    }
}
