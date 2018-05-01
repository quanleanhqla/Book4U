package com.example.quanla.book.adapters.viewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quanla.book.R;
import com.example.quanla.book.data.models.Book;

/**
 * Created by QuanLA on 11/7/2017.
 */

public class BookHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView txtName;
    private TextView txtCategory;
    private TextView txtSummary;
    public BookHolder(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.iv);
        txtName = (TextView) itemView.findViewById(R.id.txt_name);
        txtCategory = (TextView) itemView.findViewById(R.id.txt_category);
        txtSummary = (TextView) itemView.findViewById(R.id.txt_summary);
    }

    public void bind(Book book){
        imageView.setImageResource(book.getImage());
        txtName.setText(book.getName());
        txtCategory.setText(book.getCategory());
        txtSummary.setText(book.getSummary());
    }
}