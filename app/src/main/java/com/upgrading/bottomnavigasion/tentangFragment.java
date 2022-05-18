package com.upgrading.bottomnavigasion;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class tentangFragment extends Fragment {

    private RecyclerView rv_teman;
    private temanAdapter adapter;
    private ArrayList<temanModel> arrayList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tentang, container, false);

        rv_teman = view.findViewById(R.id.rv_teman_tentang);

        addData();

        return view;
    }

    private void addData() {
        arrayList = new ArrayList<>();
        arrayList.add(new temanModel("Javier Gavra Abhinaya", "0858 6647 8673", R.drawable.ic_launcher_background));
        arrayList.add(new temanModel("Muh Wahyu Ageng", "0821 2806 6795", R.drawable.ic_launcher_background));
        arrayList.add(new temanModel("M. Firdan Azhari", "0858 0342 6476", R.drawable.ic_launcher_background));
        arrayList.add(new temanModel("khoiru Rizal kalam ", "0851 5537 0503", R.drawable.ic_launcher_background));
        arrayList.add(new temanModel("Daffa Syauqi Sarif ", "0852 9314 2663", R.drawable.ic_launcher_background));
        arrayList.add(new temanModel("Putra Pratama Miharjo ", "0895 3618 08250", R.drawable.ic_launcher_background));
        arrayList.add(new temanModel("Sinatrya Rasyid", "0895 3548 80006", R.drawable.ic_launcher_background));
        arrayList.add(new temanModel("M. Vitto Chorleone", "0812 9582 2119", R.drawable.ic_launcher_background));

        adapter = new temanAdapter(arrayList, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        rv_teman.setHasFixedSize(true);
        rv_teman.setItemViewCacheSize(20);
        rv_teman.setDrawingCacheEnabled(true);
        rv_teman.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        rv_teman.setLayoutManager(layoutManager);
        rv_teman.setAdapter(adapter);
    }
}