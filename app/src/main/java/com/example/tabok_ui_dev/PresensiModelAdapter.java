package com.example.tabok_ui_dev;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PresensiModelAdapter extends RecyclerView.Adapter<PresensiModelAdapter.PresensiModelViewHolder> {

    private List<PresensiModels> presensiModels;
    private Context context;

    public PresensiModelAdapter(List<PresensiModels> presensiModels, Context context){
        this.presensiModels = presensiModels;
        this.context = context;
    }

    @NonNull
    @Override
    public PresensiModelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_presensi, parent, false);
        return new PresensiModelAdapter.PresensiModelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PresensiModelViewHolder holder, int position) {
        holder.matkul.setText(presensiModels.get(position).getMatkul_presen());
        holder.kelas.setText(presensiModels.get(position).getKelas_presen());
        holder.result.setText(presensiModels.get(position).getResult_presen());
    }

    @Override
    public int getItemCount() {
        return presensiModels.size();
    }

    public class PresensiModelViewHolder extends RecyclerView.ViewHolder {
        TextView matkul, kelas, result;
        public PresensiModelViewHolder(@NonNull View itemView) {
            super(itemView);
            matkul = itemView.findViewById(R.id.matkul_presen);
            kelas = itemView.findViewById(R.id.kelas_presen);
            result = itemView.findViewById(R.id.result_presen);
        }
    }
}
