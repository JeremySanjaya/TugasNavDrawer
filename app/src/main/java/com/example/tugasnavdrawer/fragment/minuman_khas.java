
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

public class minuman_khas extends Fragment implements Adapterlist.ItemClickListener {

    private RecyclerView recyclerView;
    private Adapterlist adapter;
    private List<ListData> dataList;
    public minuman_khas() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_minuman_khas, container, false);

        recyclerView = view.findViewById(R.id.minuman);
        dataList = new ArrayList<>();

        dataList.add(new ListData("Wedang Cor", R.drawable.wedang_cor));
        dataList.add(new ListData("Wedang Uwuh", R.drawable.wedang_uwuh));
        dataList.add(new ListData("Bajigur",  R.drawable.bajigur));
        dataList.add(new ListData("Sarabba",  R.drawable.sarabba));
        dataList.add(new ListData("Bir Pletok",  R.drawable.bir_pletok));

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