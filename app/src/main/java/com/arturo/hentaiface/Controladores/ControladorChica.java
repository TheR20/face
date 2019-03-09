package com.arturo.hentaiface.Controladores;

import android.content.Context;
import android.database.Cursor;

import com.arturo.hentaiface.BD.VinculoBD;
import com.arturo.hentaiface.Modelos.ModeloChica;

import java.util.ArrayList;

public class ControladorChica extends VinculoBD {

    public ControladorChica() {
        super();
    }

    public ControladorChica(Context context) {
        super(context);
    }


    public ArrayList<ModeloChica> obtenerElemento(String name, int number) {
        open();

        Cursor cursor;
        String opcFoto = "foto";
        String opcAudio = "audio";
        ArrayList<ModeloChica> elementos = new ArrayList<>();

        opcFoto += String.valueOf(number);
        opcAudio += String.valueOf(number);

        cursor = bdhhface.rawQuery("" +
                "SELECT chica, " + opcFoto + ", " + opcAudio + " " +
                "FROM fotos " +
                "WHERE chica = ?", new String[]{name});
        if (cursor.moveToFirst()) {
            while (!cursor.isAfterLast()) {
                final ModeloChica model = new ModeloChica();
                model.setNombreChica(cursor.getString(0));
                model.setUrlFoto(cursor.getString(1));
                model.setUrlAudio(cursor.getString(2));
                elementos.add(model);
                cursor.moveToNext();
            }
            cursor.close();
            close();
            return elementos;
        } else {
            return null;
        }

    }

}
