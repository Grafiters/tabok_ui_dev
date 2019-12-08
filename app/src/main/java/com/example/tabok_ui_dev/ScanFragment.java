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


public class ScanFragment extends Fragment{

    public static TextView matkul, jam, kelas;
    Button btn_scann, absen;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scan, container,false);


        matkul = (TextView)view.findViewById(R.id.txt_matkul);
        btn_scann = (Button)view.findViewById(R.id.txt_scan);
        btn_scann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), ScannBased.class);
                startActivity(i);
            }
        });

        return view;
    }



}
