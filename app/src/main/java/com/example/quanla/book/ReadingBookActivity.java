package com.example.quanla.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ReadingBookActivity extends AppCompatActivity {

    private ImageView left;
    private ImageView right;
    private TextView content;
    private int index;
    private ScrollView sv;
    private EditText edt_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_book);
        getSupportActionBar().hide();
        Intent intent = getIntent();


        left = (ImageView) findViewById(R.id.iv_left);
        right = (ImageView) findViewById(R.id.iv_right);
        content = (TextView) findViewById(R.id.content);
        sv = (ScrollView) findViewById(R.id.sv);
        edt_page = (EditText) findViewById(R.id.edt_page);

        ArrayList<String> arr = new ArrayList<>();

        arr.add(getString(R.string.sodo_content));
        arr.add(getString(R.string.sodo_phan2));

        if(intent.getExtras()!=null){
            String position = intent.getExtras().getString("position");
            index=Integer.parseInt(position)+1;
            content.setText(arr.get(index-1));
            edt_page.setHint("Phần "+index);
        }
        else{
            content.setText(R.string.sodo_content);
            index=1;
            edt_page.setHint("Phần "+index);
        }

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==1){
                    Toast.makeText(ReadingBookActivity.this, "Bạn đang đọc phần 1 mà", Toast.LENGTH_SHORT).show();
                }
                else {
                    index--;
                    content.setText(R.string.sodo_content);
                    sv.scrollTo(0, sv.getTop());
                    edt_page.setHint("Phần "+index);
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==2){
                    Toast.makeText(ReadingBookActivity.this, "Hết rồi", Toast.LENGTH_SHORT).show();
                }
                else {
                    index++;
                    content.setText(R.string.sodo_phan2);
                    sv.scrollTo(0, sv.getTop());
                    edt_page.setHint("Phần "+index);
                }
            }
        });

    }
}
