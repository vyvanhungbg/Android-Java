package com.example.android43_vyvanhung_btvn5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Shop extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Items> ItemsList = new ArrayList<>();
    ImageView cong,tru;
    TextView Soluong,TongTien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        recyclerView = findViewById(R.id.review);

        ItemsList.add(new Items("Trà sữa - Loyalty","57000","15 minutes-1.8km",0));
        ItemsList.add(new Items("Gà ủ muối ","120000","20 minutes-3.8km",0));
        ItemsList.add(new Items("Cơm rang dưa bò","35000","15 minutes-1.8km",0));
        ItemsList.add(new Items("Cơm rang thập cẩm","40000","8 minutes-1.2km",0));
        ItemsList.add(new Items("Trà sữa hồng kong","50000","15minutes-1.8km",0));
        ItemsList.add(new Items("Thịt quay móc mật","220000","15minutes-1.8km",0));
        ItemsList.add(new Items("Vịt quay Bắc Kinh","18000","15minutes-1.8km",0));
        ItemsList.add(new Items("Cơm bụi","25000","15minutes-1.8km",0));
        ItemsList.add(new Items("Xiên bẩn","5000","15minutes-1.8km",0));

        AdapterItems adapter = new AdapterItems(ItemsList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Shop.this, RecyclerView.VERTICAL, false);

        TongTien = (TextView) findViewById(R.id.tongtien);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}