package com.example.quanla.book;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.quanla.book.adapters.BookAdapter;
import com.example.quanla.book.adapters.RecommendAdapter;

public class BookDetailActivity extends AppCompatActivity {
    private RecyclerView rv;
    private RecommendAdapter bookAdapter;
    private ImageView img;
    private Button btn_docngay;
    private Context context;
    private Dialog dialog;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        context = this;
        bookAdapter = new RecommendAdapter(this);
        rv = (RecyclerView) findViewById(R.id.rv) ;
        img = (ImageView) findViewById(R.id.iv_back);
        btn_docngay = (Button) findViewById(R.id.btn_docngay);
        relativeLayout = (RelativeLayout) findViewById(R.id.rel);
        rv.setAdapter(bookAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btn_docngay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, ReadingBookActivity.class));
            }
        });

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = new Dialog(BookDetailActivity.this);
                dialog.setContentView(R.layout.dialog_mucluc);
                dialog.setTitle("Mục lục");
                ListView lv = (ListView) dialog.findViewById(R.id.lv);
                final String arr[] = {"Phần 1", "Phần 2"};
                ArrayAdapter<String> adapter=new ArrayAdapter<String>
                        (dialog.getContext(), android.R.layout.simple_list_item_1, arr);
                lv.setAdapter(adapter);
                dialog.show();
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent = new Intent(context, ReadingBookActivity.class);
                            String position = i+"";
                            intent.putExtra("position", position);
                            startActivity(intent);
                            dialog.dismiss();

                    }
                });
            }
        });
        getSupportActionBar().hide();
    }
}
