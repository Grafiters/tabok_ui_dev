package com.example.tabok_ui_dev;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PresensiFragment extends Fragment {
    private RecyclerView myRecyclerView;
    PresensiModelAdapter presensiModelAdapter;
    List<PresensiModels> presensiModels = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_presensi, container,false);

        myRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerView);
        PresensiModelAdapter presensiModelAdapter = new PresensiModelAdapter(presensiModels, getContext());
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(presensiModelAdapter);

        return v;
    }
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presensiModels = new ArrayList<>();
        presensiModels.add(new PresensiModels("Manajemen Proyek", "A11.4501", "75%"));
        presensiModels.add(new PresensiModels("Jaringan Komputer", "A11.4503", "86%"));
        presensiModels.add(new PresensiModels("Premograman Perangkat Bergerak", "A11.4502", "7.56%"));
    }
}
