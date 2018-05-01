package com.example.quanla.book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.quanla.book.adapters.BookAdapter;

public class XemTatCaActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ImageView iv;
    private BookAdapter bookAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xem_tat_ca);
        getSupportActionBar().hide();

        rv = (RecyclerView) findViewById(R.id.rv);
        iv = (ImageView) findViewById(R.id.iv_back);

        bookAdapter = new BookAdapter(this);
        rv.setAdapter(bookAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
