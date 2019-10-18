package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;
    TextView textTitle, textPrice, textDes;
    int image;
    String title,harga,des;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       imageView = findViewById(R.id.imageView2);
       textTitle = findViewById(R.id.textViewTitle2);
       textPrice = findViewById(R.id.textViewPrice2);
       textDes = findViewById(R.id.textViewDes2);

       title=getIntent().getStringExtra("title");
       des=getIntent().getStringExtra("deskripsi");
       harga=getIntent().getStringExtra("price");
       image = getIntent().getIntExtra("image",0);

       textTitle.setText(title);
       textDes.setText(des);
       textPrice.setText(harga);
       imageView.setImageResource(image);


    }
}
