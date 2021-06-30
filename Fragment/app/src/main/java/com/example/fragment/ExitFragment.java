package com.example.fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ExitFragment extends Fragment {

    public static ExitFragment newInstance() {

        Bundle args = new Bundle();

        ExitFragment fragment = new ExitFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable

    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_exit_fragment,container,false);
        return view;
    }
}