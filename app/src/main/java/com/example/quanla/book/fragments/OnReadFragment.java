package com.example.quanla.book.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quanla.book.R;
import com.example.quanla.book.adapters.OnReadAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class OnReadFragment extends Fragment {
    private RecyclerView rv;
    private OnReadAdapter onReadAdapter;

    public OnReadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_on_read, container, false);
        onReadAdapter = new OnReadAdapter();
        rv = (RecyclerView) view.findViewById(R.id.rv);
        rv.setAdapter(onReadAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.HORIZONTAL, false));

        return view;
    }

}
