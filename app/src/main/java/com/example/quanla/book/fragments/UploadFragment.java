package com.example.quanla.book.fragments;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.quanla.book.R;
import com.example.quanla.book.WriteStoryActivity;

import java.io.File;
import java.util.ArrayList;

import in.myinnos.awesomeimagepicker.activities.AlbumSelectActivity;
import in.myinnos.awesomeimagepicker.helpers.ConstantsCustomGallery;
import in.myinnos.awesomeimagepicker.models.Image;

/**
 * A simple {@link Fragment} subclass.
 */
public class UploadFragment extends Fragment {
    ImageView imageView;
    Context context;
    TextView txt;
    Button btn_tieptheo;


    public UploadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context = this.getActivity();
        View view = inflater.inflate(R.layout.fragment_upload, container, false);
        imageView = (ImageView) view.findViewById(R.id.imageView);
        txt = (TextView) view.findViewById(R.id.txt_them);
        btn_tieptheo = (Button) view.findViewById(R.id.btn_tieptheo);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, AlbumSelectActivity.class);
                intent.putExtra(ConstantsCustomGallery.INTENT_EXTRA_LIMIT, 1);
                startActivityForResult(intent, ConstantsCustomGallery.REQUEST_CODE);
            }
        });

        btn_tieptheo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, WriteStoryActivity.class));
            }
        });



        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ConstantsCustomGallery.REQUEST_CODE && resultCode == Activity.RESULT_OK && data != null) {
            //The array list has the image paths of the selected images
            ArrayList<Image> images = data.getParcelableArrayListExtra(ConstantsCustomGallery.INTENT_EXTRA_IMAGES);

            for (int i = 0; i < images.size(); i++) {
                Uri uri = Uri.fromFile(new File(images.get(i).path));

                Glide.with(this).load(uri)
                        .placeholder(R.color.colorAccent)
                        .override(400, 400)
                        .crossFade()
                        .centerCrop()
                        .into(imageView);

                txt.setText("");




                // start play with image uri
            }
        }
    }
}
