package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterProduct adapter;

    List<Product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView =(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList.add(
                new Product(
                        1,
                        "Pecel Lele",
                        "15000",
                        R.drawable.gojek,"Pecel Lele keju"));
        productList.add(
                new Product(
                        2,
                        "Nasi Goreng Mercon",
                        "14500",
                        R.drawable.gojek,"Nasi Goreng Pedas Gila"));
        productList.add(
                new Product(
                        3,
                        "Ayam Geprek Keju",
                        "20000",
                        R.drawable.gojek,"Ayam Geprek kejunya banyak"));
        productList.add(
                new Product(
                        4,
                        "Kari Ayam",
                        "17500",
                        R.drawable.gojek,"Kari Ayam Kampung"));
        productList.add(
                new Product(
                        5,
                        "Tahu Bulat",
                        "500",
                        R.drawable.gojek,"Digoreng dadakan"));
        productList.add(
                new Product(
                        6,
                        "Salad Buah",
                        "12000",
                        R.drawable.gojek,"Salad buah ga pake Nasi"));



        adapter = new AdapterProduct(this,productList);
        recyclerView.setAdapter(adapter);


    }

   // public void pindah(View view) {
     //   Intent intent = new Intent(MainActivity.this,Main2Activity.class);
       // startActivity(intent);
   // }
}
