package com.example.android43_vyvanhung_btvn04;

import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterCoPhieu extends BaseAdapter {
    List<CoPhieu> CoPhieuList;

    public AdapterCoPhieu(List<CoPhieu> coPhieuList) {
       this.CoPhieuList = coPhieuList;
    }

    @Override
    public int getCount() {
        return CoPhieuList.size();
    }

    @Override
    public Object getItem(int position) {
        return CoPhieuList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.co_phieu,parent,false);

        TextView tvNgayGiaoDich,tvMaCCQ,tvGiaTriMua,tvGiaTriTT,tvLoiNHuan;
        tvNgayGiaoDich = view.findViewById(R.id.tvNgayGiaoDich);
        tvMaCCQ = view.findViewById(R.id.tvMaCCQ);
        tvGiaTriMua = view.findViewById(R.id.tvGiaTriMua);
        tvGiaTriTT = view.findViewById(R.id.tvGiaTriTT);
        tvLoiNHuan = view.findViewById(R.id.tvLoiNhuan);

        CoPhieu coPhieu = CoPhieuList.get(position);
        tvNgayGiaoDich.setText(coPhieu.getNgayGiaoDich());
        tvMaCCQ.setText(coPhieu.getMaCCQ());
        String strGiaTriMua = String.valueOf(coPhieu.getGiaTriMua());
        String strGiaTriTT = String.valueOf(coPhieu.getGiaTriMua());
        String strloiNhuan = String.valueOf(coPhieu.getGiaTriMua()) + " %";
        if(coPhieu.getNgayGiaoDich().length()==0) {
            strGiaTriMua = "";
            strGiaTriTT = "";
            strloiNhuan = "";
        }
        tvGiaTriMua.setText(strGiaTriMua);
        tvGiaTriTT.setText(strGiaTriTT);
        tvLoiNHuan.setText(strloiNhuan);

        return view;
    }
}
