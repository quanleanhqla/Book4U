package com.example.quanla.book.fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quanla.book.R;
import com.example.quanla.book.XemTatCaActivity;
import com.example.quanla.book.adapters.BookAdapter;
import com.example.quanla.book.adapters.RecommendAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecommentFragment extends Fragment {

    private RecyclerView rv1;
    private RecyclerView rv2;
    private RecyclerView rv3;
    private TextView txt1;
    private ImageView iv1;

    private RecommendAdapter bookAdapter;
    private Context context;
    public RecommentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recomment, container, false);
        context = this.getActivity();
        rv1 = (RecyclerView) view.findViewById(R.id.rv);
        rv2 = (RecyclerView) view.findViewById(R.id.rv1);
        rv3 = (RecyclerView) view.findViewById(R.id.rv2);
        txt1 = (TextView) view.findViewById(R.id.txt1);
        iv1 = (ImageView) view.findViewById(R.id.iv1);
        bookAdapter = new RecommendAdapter(this.getActivity());

        rv1.setAdapter(bookAdapter);
        rv1.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.HORIZONTAL, false));
        rv2.setAdapter(bookAdapter);
        rv2.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.HORIZONTAL, false));
        rv3.setAdapter(bookAdapter);
        rv3.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.HORIZONTAL, false));

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, XemTatCaActivity.class));
            }
        });

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, XemTatCaActivity.class));
            }
        });


        return view;
    }

}
