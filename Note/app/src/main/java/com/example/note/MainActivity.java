package com.example.note;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvTime, tvDate, tvTags, tvWeeks,tvTune;
    int lastSelectedHour =-1;
    int lastSelectedMinute = -1;

    android.widget.Spinner spinner;
    List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTime = findViewById(R.id.tvTime);
        tvDate = findViewById(R.id.tvDate);
        tvTags = findViewById(R.id.tvTags);
        tvWeeks = findViewById(R.id.tvWeeks);
        tvTune= findViewById(R.id.tvTune);
        spinner =  findViewById(R.id.id_spinnerType);
        tvTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Hour = 14;
                int Minute = 20;
                TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        tvTime.setText(hourOfDay + ":" + minute);
                        lastSelectedHour = hourOfDay;
                        lastSelectedMinute = minute;

                    }
                };
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this,timeSetListener,lastSelectedHour,lastSelectedMinute,true);
                timePickerDialog.show();
            }
        });


        tvDate.setOnClickListener(new View.OnClickListener() {
//            String str = java.time.LocalDate.now().toString();
//            String strSplit[] = str.split("-");
            int day = 01;
            int month = 07;
            int year = 2021;
            @Override
            public void onClick(View v) {
                DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        tvDate.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                    }
                };

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,dateSetListener,year,month,day);
                datePickerDialog.show();
            }
        });


        tvTags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str[] = {"Family", "Game", "Android", "VTC", "Friend"};
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("B???n h??y ch???n m???t c??ng vi???c !");

                builder.setSingleChoiceItems(str, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        tvWeeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] strings = {"Monday","Tuesday","Wednesday","Thusday","Friday","Satuday","Sunday"};

                boolean[] booleans = {false,true,false,false,false,false,false};
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Ch???n M???t v??i ng??y n??o !");

                builder.setMultiChoiceItems(strings, booleans, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                    }
                });

                builder.setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });


                builder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.create().show();
            }
        });


        tvTune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,v);
                MenuInflater menuInflater = popupMenu.getMenuInflater();
                menuInflater.inflate(R.menu.menu_tune,popupMenu.getMenu());
                popupMenu.show();
            }
        });


//        Spinner

        list.add("Work");
        list.add("Friend");
        list.add("Family");

        ArrayAdapter<String> spinnerAdaper = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,list);
        spinnerAdaper.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdaper);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.actionSave:
                Toast.makeText(MainActivity.this,"???? l??u",Toast.LENGTH_LONG).show();
                break;
            case R.id.actionExit:
                break;
        }
        return super.onOptionsItemSelected(item);
    }



}