package com.example.android43_vyvanhung_btvn04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<CoPhieu> coPhieulist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lv);
        coPhieulist = new ArrayList<CoPhieu>();
        coPhieulist.add(new CoPhieu("28/08/2001","VFMVF8",500.000,600.00123,6.00));
        coPhieulist.add(new CoPhieu("20/01/2001","VFMVF1",567.000,690.2349,12.00));
        coPhieulist.add(new CoPhieu("28/08/2001","VFMVF1",1500.030,1500.109,0.00));
        coPhieulist.add(new CoPhieu("28/08/2001","VFMVF9",124.450,130.345,6.20));
        coPhieulist.add(new CoPhieu("28/08/2001","VFMVF5",302.230,290.04323,3.28));
        coPhieulist.add(new CoPhieu("","",0,0,0));
        coPhieulist.add(new CoPhieu());
        coPhieulist.add(new CoPhieu());
        coPhieulist.add(new CoPhieu());
        coPhieulist.add(new CoPhieu());
        coPhieulist.add(new CoPhieu());
        coPhieulist.add(new CoPhieu());
        coPhieulist.add(new CoPhieu());
        coPhieulist.add(new CoPhieu());
        coPhieulist.add(new CoPhieu());
        coPhieulist.add(new CoPhieu());
        AdapterCoPhieu adapterCoPhieu = new AdapterCoPhieu(coPhieulist);
        listView.setAdapter(adapterCoPhieu);
    }

}