package com.example.quanla.book.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quanla.book.BookDetailActivity;
import com.example.quanla.book.R;
import com.example.quanla.book.adapters.viewHolders.BookHolder;
import com.example.quanla.book.data.DbFake;
import com.example.quanla.book.data.models.Book;

/**
 * Created by QuanLA on 11/7/2017.
 */

public class BookAdapter extends RecyclerView.Adapter<BookHolder> {
    Context context;

    public BookAdapter(Context context) {
        this.context = context;
    }

    @Override
    public BookHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_book, parent, false);

        BookHolder bookHolder = new BookHolder(view);

        return bookHolder;
    }

    @Override
    public void onBindViewHolder(BookHolder holder, int position) {
        final Book book = DbFake.instance.getAllBook().get(position);

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
