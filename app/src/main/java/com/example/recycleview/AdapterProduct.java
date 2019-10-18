package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ProductViewHolder> {

    private Context Ctx;
    private List<Product> productList;



    public AdapterProduct(Context ctx, List<Product> productList) {
        Ctx = ctx;
        this.productList = productList;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.list_layout,null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, final int position) {

        final Product product = productList.get(position);
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewPrice.setText(product.getPrice());
        holder.textViewDes.setText(product.getDes());
        holder.imageView.setImageDrawable(Ctx.getResources().getDrawable(product.getImage()));
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ctx,Main2Activity.class);
                intent.putExtra("image",product.getImage());
                intent.putExtra("title",product.getTitle());
                intent.putExtra("deskripsi",product.getDes());
                intent.putExtra("price",product.getPrice());
                Ctx.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle, textViewPrice, textViewDes;
        RelativeLayout relativeLayout;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);


            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            textViewDes = itemView.findViewById(R.id.textViewDes);
            relativeLayout= itemView.findViewById(R.id.relative);

        }
    }
}
