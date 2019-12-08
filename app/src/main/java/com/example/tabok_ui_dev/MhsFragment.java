package com.example.tabok_ui_dev;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MhsFragment extends Fragment {

    private RecyclerView myRecyclerView;
    MhsModelAdapter mhsModelAdapter;
    List<MhsModel> mhsModels = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mhs, container,false);

        myRecyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
        MhsModelAdapter mhsModelAdapter = new MhsModelAdapter(mhsModels, getContext());
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(mhsModelAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mhsModels = new ArrayList<>();
        mhsModels.add(new MhsModel("Grafit", "A11.2017.10284", "bayugrafit@gmail.com"));
        mhsModels.add(new MhsModel("Nur", "A11.2017.10285", "nbayugrafit@gmail.com"));
        mhsModels.add(new MhsModel("Nur", "A11.2017.10285", "nbayugrafit@gmail.com"));
        mhsModels.add(new MhsModel("Nur", "A11.2017.10285", "nbayugrafit@gmail.com"));
    }
}
