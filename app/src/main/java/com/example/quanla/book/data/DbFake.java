package com.example.quanla.book.data;

import com.example.quanla.book.R;
import com.example.quanla.book.data.models.Book;

import java.util.ArrayList;

/**
 * Created by QuanLA on 11/7/2017.
 */

public class DbFake {
    private ArrayList<Book> arrayList;

    public static final DbFake instance = new DbFake();

    public ArrayList<Book> getAllBook(){
        if(arrayList==null){
            arrayList = new ArrayList<>();
            arrayList.add(new Book(R.drawable.chamvang,"", "Chạm vạng", "Tình yêu", "Ma cà rồng và sói cùng yêu người trần và đánh nhau"));
            arrayList.add(new Book(R.drawable.sodo,"", "Số đỏ", "Giáo dục", "Thằng nào tóc đỏ thằng ấy rất là khôn"));
            arrayList.add(new Book(R.drawable.harrypotter,"", "Harry Potter", "Giáo dục", "Thằng nào tóc đỏ thằng ấy rất là khôn"));
            arrayList.add(new Book(R.drawable.sontinhthuytinh,"", "Sơn Tinh Thủy Tinh", "Truyền thuyết", "Thằng nào tóc đỏ thằng ấy rất là khôn"));
            arrayList.add(new Book(R.drawable.tamcam,"", "Tấm Cám", "Cổ tích", "Thằng nào tóc đỏ thằng ấy rất là khôn"));
            arrayList.add(new Book(R.drawable.thanthoaihylap,"", "Thần thoại Hy Lạp", "Thần thoại", "Thằng nào tóc đỏ thằng ấy rất là khôn"));
            arrayList.add(new Book(R.drawable.ythiendolong,"", "Ỷ Thiên Đồ Long Ký", "Kiếm hiệp", "Thằng nào tóc đỏ thằng ấy rất là khôn"));
        }
        return arrayList;
    }


}
