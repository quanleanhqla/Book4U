package com.example.quanla.book.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quanla.book.R;
import com.example.quanla.book.adapters.viewHolders.OnReadHolder;
import com.example.quanla.book.data.DbFake;
import com.example.quanla.book.data.models.Book;

/**
 * Created by QuanLA on 11/8/2017.
 */

public class OnReadAdapter extends RecyclerView.Adapter<OnReadHolder> {
    @Override
    public OnReadHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_on_read, parent, false);

        OnReadHolder onReadHolder = new OnReadHolder(view);
        return onReadHolder;
    }

    @Override
    public void onBindViewHolder(OnReadHolder holder, int position) {
        Book book = DbFake.instance.getAllBook().get(position);

        holder.bind(book);


    }

    @Override
    public int getItemCount() {
        return DbFake.instance.getAllBook().size();
    }
}
