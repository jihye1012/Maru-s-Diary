package com.example.maru_s_diary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeActivity extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_home);
//
//        LinearLayoutManager linearLayoutManager
//                = new LinearLayoutManager(this);
//
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(linearLayoutManager);
//
//
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = v.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager
                = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        return v;
    }
}