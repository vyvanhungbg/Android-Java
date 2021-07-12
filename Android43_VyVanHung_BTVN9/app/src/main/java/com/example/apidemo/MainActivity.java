package com.example.apidemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.apidemo.databinding.ActivityMainBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AdapterProduct adapterProduct;
    ActivityMainBinding binding;
    String jSon = "{\"id\":\"144\",\"publisher_id\":\"3\",\"content_type\":\"3\",\"tab\":\"0\",\"title\":\"Chinese Series\",\"avatar\":null}";
    String listJSon = "[{\"id\":\"144\",\"publisher_id\":\"3\",\"content_type\":\"3\",\"tab\":\"0\",\"title\":\"Chinese Series\",\"avatar\":null},{\"id\":\"111\",\"publisher_id\":\"113\",\"content_type\":\"113\",\"tab\":\"110\",\"title\":\"Series Phim\",\"avatar\":\"----------\"}]";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        getJonArr();
    }

    private  void getJon(){
        try {
            JSONObject jsonObject = new JSONObject(jSon);


            int id = jsonObject.getInt("id");
            String title = jsonObject.getString("title");
            binding.tvView.setText(title);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private  void getJonArr(){
        try {
            List<Product> list = new ArrayList<>();
            JSONArray arr = new JSONArray(listJSon);
            for(int i=0;i<arr.length();i++){
                JSONObject jsonObject = arr.getJSONObject(i);
                list.add(new Product(jsonObject.getInt("id"),jsonObject.getString("title"),jsonObject.getInt("publisher_id") ));
            }

            AdapterProduct adapterProduct = new AdapterProduct(list);
            binding.listview.setAdapter(adapterProduct);
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

}