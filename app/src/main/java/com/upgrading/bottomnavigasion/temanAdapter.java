package com.upgrading.bottomnavigasion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class temanAdapter extends RecyclerView.Adapter<temanAdapter.ViewHolder> {
    private ArrayList<temanModel> dataList;
    private tentangFragment mContext;

    public temanAdapter(ArrayList<temanModel> dataList, tentangFragment mContext) {
        this.dataList = dataList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public temanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.teman_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull temanAdapter.ViewHolder holder, int position) {
        holder.img_logo.setImageResource(dataList.get(position).getFoto());
        holder.tv_nama.setText(dataList.get(position).getNamaOrang());
        holder.tv_nomorTelpon.setText(dataList.get(position).getNomorTelpon());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_nama, tv_nomorTelpon;
        private ImageView img_logo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_nama = itemView.findViewById(R.id.tv_namaOrang);
            this.tv_nomorTelpon = itemView.findViewById(R.id.tv_nomorTelpon);
            this.img_logo = itemView.findViewById(R.id.img_foto);

        }
    }
}
