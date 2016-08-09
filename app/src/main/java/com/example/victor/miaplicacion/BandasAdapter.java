package com.example.victor.miaplicacion;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by victo on 09/08/2016.
 */
public class BandasAdapter extends ArrayAdapter<Bandas> {

    Context context;
    int resouce;
    Bandas data[] = null;

    public BandasAdapter(Context context, int resource, Bandas[] data) {
        super(context, resource,data);

        this.context = context;
        this.resouce = resource;
        this.data = data;

    }

    public View getView(int posicion, View converView, ViewGroup parent){
        View row = converView;
        BandasHolder  holder = null;

        if(row==null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(resouce,parent,false);
            holder = new BandasHolder();
            holder.imageView = (ImageView) row.findViewById(R.id.imagen);
            holder.textView = (TextView) row.findViewById(R.id.textoa);
            row.setTag(holder);
        }else {
            holder = (BandasHolder) row.getTag();
        }

        Bandas bandas = data[posicion];
        holder.textView.setText(bandas.titulo);
        holder.imageView.setImageResource(bandas.icon);

        return row;
    }

    static class BandasHolder{
        ImageView imageView;
        TextView textView;
    }
}
