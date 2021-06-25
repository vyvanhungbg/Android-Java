package com.example.android43_vyvanhung_btvn5;

import android.os.Parcel;
import android.os.Parcelable;

public class Items implements Parcelable {
    String name;
    String price;
    String time;
    int amount;

    public Items(String name, String price, String time, int amount) {
        this.name = name;
        this.price = price;
        this.time = time;
        this.amount = amount;
    }

    protected Items(Parcel in) {
        name = in.readString();
        price = in.readString();
        time = in.readString();
        amount = in.readInt();
    }

    public static final Creator<Items> CREATOR = new Creator<Items>() {
        @Override
        public Items createFromParcel(Parcel in) {
            return new Items(in);
        }

        @Override
        public Items[] newArray(int size) {
            return new Items[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(price);
        dest.writeString(time);
        dest.writeInt(amount);
    }
}
