package com.example.tabok_ui_dev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MatkulModelAdapter extends RecyclerView.Adapter<MatkulModelAdapter.MatkulModelViewHolder> {

    private List<MatkulModel> matkulModels;
    private Context context;
    private ItemClickListener itemClickListener;

    public MatkulModelAdapter(List<MatkulModel>matkulModels, Context context){
        this.matkulModels = matkulModels;
        this.context = context;
    }

    @NonNull
    @Override
    public MatkulModelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_matkul, parent, false);
        return new MatkulModelAdapter.MatkulModelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatkulModelViewHolder holder, int position) {
        holder.matkul.setText(matkulModels.get(position).getMatkul());
        holder.time.setText(matkulModels.get(position).getTime());
        holder.kelas.setText(matkulModels.get(position).getKelas());
    }

    @Override
    public int getItemCount() {
        return matkulModels.size();
    }

    public class MatkulModelViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private LinearLayout detail_matkul;
        TextView matkul, time, kelas;

        public MatkulModelViewHolder(@NonNull View itemView) {
            super(itemView);
            matkul = itemView.findViewById(R.id.matkul);
            time = itemView.findViewById(R.id.waktu);
            kelas = itemView.findViewById(R.id.kelas);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
