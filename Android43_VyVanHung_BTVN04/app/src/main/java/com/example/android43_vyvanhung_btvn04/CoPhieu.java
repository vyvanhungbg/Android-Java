package com.example.android43_vyvanhung_btvn04;

public class CoPhieu {
    String ngayGiaoDich,maCCQ;
    double giaTriMua,giaTriThiTruong,loiNhuan;

    public CoPhieu() {
        this.ngayGiaoDich = "";
        this.maCCQ = "";

    }
    public CoPhieu(String ngayGiaoDich, String maCCQ, double giaTriMua, double giaTriThiTruong, double loiNhuan) {
        this.ngayGiaoDich = ngayGiaoDich;
        this.maCCQ = maCCQ;
        this.giaTriMua = giaTriMua;
        this.giaTriThiTruong = giaTriThiTruong;
        this.loiNhuan = loiNhuan;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getMaCCQ() {
        return maCCQ;
    }

    public void setMaCCQ(String maCCQ) {
        this.maCCQ = maCCQ;
    }

    public double getGiaTriMua() {
        return giaTriMua;
    }

    public void setGiaTriMua(double giaTriMua) {
        this.giaTriMua = giaTriMua;
    }

    public double getGiaTriThiTruong() {
        return giaTriThiTruong;
    }

    public void setGiaTriThiTruong(double giaTriThiTruong) {
        this.giaTriThiTruong = giaTriThiTruong;
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(double loiNhuan) {
        this.loiNhuan = loiNhuan;
    }
}
