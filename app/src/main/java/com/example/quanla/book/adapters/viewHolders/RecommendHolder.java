package com.example.quanla.book.adapters.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quanla.book.R;
import com.example.quanla.book.data.models.Book;

/**
 * Created by QuanLA on 11/16/2017.
 */

public class RecommendHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;
    public RecommendHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.iv);
        textView = (TextView) itemView.findViewById(R.id.txt_name);
    }
    public void bind(Book book){
        textView.setText(book.getName());
        imageView.setImageResource(book.getImage());
    }
}
