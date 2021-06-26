package com.example.android43_vyvanhung_btvn5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Cart extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Items> listItems = new ArrayList<>();
    List<Items> cart = new ArrayList<>();
    TextView tvTongTien;
    ImageView actionBarBack ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        recyclerView = findViewById(R.id.recycleView);
        Intent intent = getIntent();
        listItems = intent.getParcelableArrayListExtra("listItems");
        getItemInShop(listItems,cart);
        AdapterItems adapterItems = new AdapterItems(cart);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Cart.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterItems);
        actionBarBack = findViewById(R.id.actionBack);
        tvTongTien = findViewById(R.id.tvTongTien);
        tvTongTien.setText(String.valueOf(TongTien(cart)));
        actionBarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getBaseContext(),Shop.class);
                intent.putParcelableArrayListExtra("cart", (ArrayList<? extends Parcelable>) cart);
                startActivity(intent1);

            }
        });

    }
    private  void getItemInShop(List<Items> listItems,List<Items> cart){
        for (Items items: listItems
        ) {
            if(items.amount>0){
                cart.add(items);
            }
        }
    }
    Double TongTien(List<Items> listItems){
        Double tong=0d;
        for (Items items: listItems
        ) {
            if(items.amount>0){
                tong+=items.amount*Double.parseDouble(items.price);
            }

        }
        return tong;
    }
}