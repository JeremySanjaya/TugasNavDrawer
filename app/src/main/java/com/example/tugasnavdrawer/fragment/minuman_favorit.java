
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

public class minuman_favorit extends Fragment implements Adapterlist.ItemClickListener{

    private RecyclerView recyclerView;
    private Adapterlist adapter;
    private List<ListData> dataList;

    public minuman_favorit() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_minuman_favorit, container, false);

        recyclerView = view.findViewById(R.id.minumfav);
        dataList = new ArrayList<>();

        dataList.add(new ListData("Air Putih",  R.drawable.air_putih));
        dataList.add(new ListData("Fruit Tea",  R.drawable.fruit_tea));
        dataList.add(new ListData("Es Teh",  R.drawable.es_teh));
        dataList.add(new ListData("Fanta",  R.drawable.fanta));
        dataList.add(new ListData("Tea Jus",  R.drawable.tea_jus));

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