package com.example.android43_vyvanhung_btvn5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Shop extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Items> listItems = new ArrayList<>();

    ImageView cong,tru;
    TextView Soluong,TongTien;
    ImageView tvgioHang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        tvgioHang = findViewById(R.id.giohang);
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        TongTien = findViewById(R.id.tongtien);
        recyclerView = findViewById(R.id.review);

        listItems.add(new Items("Trà sữa - Loyalty","57000","15 minutes-1.8km",0));
        listItems.add(new Items("Gà ủ muối ","120000","20 minutes-3.8km",0));
        listItems.add(new Items("Cơm rang dưa bò","35000","15 minutes-1.8km",0));
        listItems.add(new Items("Cơm rang thập cẩm","40000","8 minutes-1.2km",0));
        listItems.add(new Items("Trà sữa hồng kong","50000","15minutes-1.8km",0));
        listItems.add(new Items("Thịt quay móc mật","220000","15minutes-1.8km",0));
        listItems.add(new Items("Vịt quay Bắc Kinh","18000","15minutes-1.8km",0));
        listItems.add(new Items("Cơm bụi","25000","15minutes-1.8km",0));
        listItems.add(new Items("Xiên bẩn","5000","15minutes-1.8km",0));

        TongTien.setText(String.valueOf(TongTien(listItems)));

        AdapterItems adapter = new AdapterItems(listItems);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Shop.this, RecyclerView.VERTICAL, false);

        TongTien = (TextView) findViewById(R.id.tongtien);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



        tvgioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Cart.class);
                intent.putParcelableArrayListExtra("listItems", (ArrayList<? extends Parcelable>) listItems);
                startActivity(intent);

            }
        });



    }

    int TongTien(List<Items> listItems){
        int tong=0;
        for (Items items: listItems
             ) {
            if(items.amount>0){
                tong+=items.amount*Integer.parseInt(items.price);
            }

        }
        return tong;
    }

}