package com.example.tabok_ui_dev;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    TextView name;
    Button btn_scann;
    private RecyclerView recyclerView;
    MatkulModelAdapter matkulModelAdapter;
    List<MatkulModel> matkulModels = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_home, container,false);

        recyclerView = (RecyclerView)view.findViewById(R.id.jadwal);
        MatkulModelAdapter matkulModelAdapter = new MatkulModelAdapter(matkulModels, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(matkulModelAdapter);

        name = (TextView)view.findViewById(R.id.nama);
        btn_scann = (Button)view.findViewById(R.id.btn_absen);
        btn_scann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ScannBased.class);
                startActivity(i);
            }
        });
        name.setText("Grafiters");

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        matkulModels = new ArrayList<>();
        matkulModels.add(new MatkulModel("Manajemen Proyek", "Selasa, 09:30", "A11.4501"));
        matkulModels.add(new MatkulModel("Sistem Informasi", "Rabu, 09:30", "A11.4503"));
        matkulModels.add(new MatkulModel("Sistem Basis Data", "Kamis, 09:30", "A11.4502"));
        matkulModels.add(new MatkulModel("Jaringan Komputer", "Kamis, 12:30", "A11.4504"));
    }
}
