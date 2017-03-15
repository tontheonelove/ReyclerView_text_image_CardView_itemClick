package com.theonelove.reyclerviewdancardviewandroid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by TON on 15/3/2560.
 */

public class ReyclerViewHolder extends RecyclerView.ViewHolder {


    TextView tv1,tv2;
    ImageView imageView;

    public ReyclerViewHolder(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.daftar_judul);

        tv2= (TextView) itemView.findViewById(R.id.daftar_deskripsi);

        imageView= (ImageView) itemView.findViewById(R.id.daftar_icon);

    }

}
