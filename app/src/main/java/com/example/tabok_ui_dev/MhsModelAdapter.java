package com.example.tabok_ui_dev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MhsModelAdapter extends RecyclerView.Adapter<MhsModelAdapter.MhsModelViewHolder> {

    private List<MhsModel> mhsModels;
    private Context context;
    private ItemClickListener itemClickListener;

    public MhsModelAdapter(List<MhsModel>mhsModels, Context context){

        this.mhsModels = mhsModels;
        this.context = context;
    }

    @NonNull
    @Override
    public MhsModelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_mhs_list, parent,false);
        return new MhsModelAdapter.MhsModelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MhsModelViewHolder holder, int position) {
        holder.mhs_name.setText(mhsModels.get(position).getName());
        holder.mhs_nim.setText(mhsModels.get(position).getNim());
        holder.mhs_email.setText(mhsModels.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return mhsModels.size();
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

    public class MhsModelViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView mhs_name, mhs_nim, mhs_email;

        public MhsModelViewHolder(View view){
            super(view);
            mhs_name = view.findViewById(R.id.mhs_name);
            mhs_nim = view.findViewById(R.id.mhs_nim);
            mhs_email = view.findViewById(R.id.mhs_email);
        }

        @Override
        public void onClick(View v) {
            if (itemClickListener != null){
                itemClickListener.onClick(v, getAdapterPosition());
            }
        }
    }

}
