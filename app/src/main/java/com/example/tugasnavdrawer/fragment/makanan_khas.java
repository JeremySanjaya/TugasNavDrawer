package com.example.tugasnavdrawer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasnavdrawer.Adapterlist;
import com.example.tugasnavdrawer.ListData;
import com.example.tugasnavdrawer.R;

import java.util.ArrayList;
import java.util.List;

public class makanan_khas extends Fragment implements Adapterlist.ItemClickListener{

    private RecyclerView recyclerView;
    private Adapterlist adapter;
    private List<ListData> dataList;

    public makanan_khas() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_makanan_khas, container, false);

        recyclerView = view.findViewById(R.id.makanan);
        dataList = new ArrayList<>();

        dataList.add(new ListData("Nasi Langi", R.drawable.nasi_langi));
        dataList.add(new ListData("Pecel Gudeg", R.drawable.pecel_gudeg));
        dataList.add(new ListData("Pecel Pincuk Garagan", R.drawable.pecel_pincuk_garagan));
        dataList.add(new ListData("Lontong Kupang", R.drawable.lontong_kupang));
        dataList.add(new ListData("Prol Tape", R.drawable.prol_tape));

        adapter = new Adapterlist(dataList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}