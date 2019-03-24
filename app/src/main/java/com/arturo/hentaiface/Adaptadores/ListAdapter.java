package com.arturo.hentaiface.Adaptadores;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.arturo.hentaiface.Modelos.ModeloChica;
import com.arturo.hentaiface.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private Activity activity;
    private ArrayList<ModeloChica> items;

    public ListAdapter(Activity activity, Context context, ArrayList<ModeloChica> items) {
        this.activity = activity;
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {

        TextView nombre;
        ImageView imagen;
        ModeloChica modelo;
        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.girl_card, null);
        }

        modelo = items.get(position);
        nombre = (TextView) v.findViewById(R.id.nombreChica);
        imagen = (ImageView) v.findViewById(R.id.fondoChica);

        nombre.setText(modelo.getNombreChica());
        Glide.with(context).load(modelo.getUrlFoto()).into(imagen);

        return v;
    }
}
