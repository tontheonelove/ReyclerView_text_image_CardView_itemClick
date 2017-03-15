package com.theonelove.reyclerviewdancardviewandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by TON on 15/3/2560.
 */

public class ReyclerAdapter extends RecyclerView.Adapter<ReyclerViewHolder> {



    private final Context context;

    String [] name={"Apple","Facebook","Twitter","Google",
            "Microsoft","Wikipedia","Yahoo","Youtube"};


    LayoutInflater inflater;
    public ReyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public ReyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.item_list, parent, false);

        ReyclerViewHolder viewHolder=new ReyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ReyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);

    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            ReyclerViewHolder vholder = (ReyclerViewHolder) v.getTag();

            int position = vholder.getPosition();


            //This is For Onclick To New Activity

            if (position == 0 && position <getItemCount ()) {
                Intent intent = new Intent (context, SuccessActivity.class);
                context.startActivity (intent);

            }

            if (position == 1 && position <getItemCount ()) {
                Intent intent1 = new Intent (context, SuccessActivity.class);
                context.startActivity (intent1);

            }

            if (position == 2 && position <getItemCount ()) {
                Intent intent2 = new Intent (context, SuccessActivity.class);
                context.startActivity (intent2);

            }

            if (position == 3 && position <getItemCount ()) {
                Intent intent3 = new Intent (context, SuccessActivity.class);
                context.startActivity (intent3);

            }

            if (position == 4 && position <getItemCount ()) {
                Intent intent4 = new Intent (context, SuccessActivity.class);
                context.startActivity (intent4);

            }

        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }




}
