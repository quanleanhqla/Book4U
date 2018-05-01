package com.example.quanla.book.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.quanla.book.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {


    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        final String arr[] = {"Tình yêu", "Hành động", "Giáo dục", "Gia đình"};
        ListView listView = (ListView) view.findViewById(R.id.listview);

        ArrayAdapter<String>adapter=new ArrayAdapter<String>
                (this.getContext(), android.R.layout.simple_list_item_1, arr);
        listView.setAdapter(adapter);

        return view;
    }

}
