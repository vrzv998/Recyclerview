package com.example.vrzv.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOnHolder> {

    String data1[],data2[];
    int img[];
    Context ctx;

    public MyOwnAdapter(Context ct, String s1[], String s2[], int i1[]){
        ctx=ct;
        data1 = s1;
        data2 = s2;
        img = i1;
    }

    @Override
    public MyOnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myinflator = LayoutInflater.from(ctx);
        View myOwnView = myinflator.inflate(R.layout.my_row,parent,false);
        return new MyOnHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOnHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.myImage.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOnHolder extends RecyclerView.ViewHolder{
        TextView t1,t2;
        ImageView myImage;
        public MyOnHolder(View itemView) {
            super(itemView);
            t1 = (TextView)itemView.findViewById(R.id.text1);
            t2 = (TextView)itemView.findViewById(R.id.text2);
            myImage = (ImageView)itemView.findViewById(R.id.myImage);
        }
    }
}
