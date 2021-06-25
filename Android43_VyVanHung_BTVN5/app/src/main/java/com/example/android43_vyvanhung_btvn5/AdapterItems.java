package com.example.android43_vyvanhung_btvn5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterItems extends RecyclerView.Adapter<AdapterItems.ViewHolder>{
    List<Items> itemsList;

    public AdapterItems(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.items,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( AdapterItems.ViewHolder holder, int position) {
        Items items = itemsList.get(position);
        holder.tvName.setText(items.getName());
        holder.tvPrice.setText(items.getPrice() + " vnđ");
        holder.tvTime.setText(items.getTime());
        holder.tvSoLuong.setText(String.valueOf(items.getAmount()));



    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView cong,tru;
        TextView tvName,tvPrice,tvTime, tvSoLuong;
        public ViewHolder(View view) {
            super(view);
            cong = view.findViewById(R.id.cong);
            tru = view.findViewById(R.id.tru);
            tvName = view.findViewById(R.id.tvName);
            tvPrice = view.findViewById(R.id.tvPrice);
            tvTime = view.findViewById(R.id.tvTime);
            tvSoLuong= view.findViewById(R.id.soluong);
        }
    }
}
