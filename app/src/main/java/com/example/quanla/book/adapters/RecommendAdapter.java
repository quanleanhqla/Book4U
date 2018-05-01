package com.example.quanla.book.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quanla.book.BookDetailActivity;
import com.example.quanla.book.R;
import com.example.quanla.book.adapters.viewHolders.RecommendHolder;
import com.example.quanla.book.data.DbFake;
import com.example.quanla.book.data.models.Book;

/**
 * Created by QuanLA on 11/16/2017.
 */

public class RecommendAdapter extends RecyclerView.Adapter<RecommendHolder> {
    Context context;

    public RecommendAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecommendHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_recommend, parent, false);

        RecommendHolder recommendHolder = new RecommendHolder(view);
        return recommendHolder;
    }

    @Override
    public void onBindViewHolder(RecommendHolder holder, int position) {
        Book book = DbFake.instance.getAllBook().get(position);

        holder.bind(book);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, BookDetailActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return DbFake.instance.getAllBook().size();
    }
}
