package com.example.apidemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.PopupMenu;
import android.widget.TextView;

import java.util.List;

public class AdapterProduct extends BaseAdapter {
    List<Product> list;

    public AdapterProduct(List<Product> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.iterm_product,parent,false);
        Product product = new Product();
        TextView tvTitle,tvPublish;
        tvTitle = view.findViewById(R.id.tv_title);
        tvPublish = view.findViewById(R.id.publisd_id);

        tvTitle.setText(product.getTitle());
        tvPublish.setText(String.valueOf(product.getStatus()));

        return view;
    }
}
