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


    public ModeloChica obtenerElemento(String name, int number) {

        ModeloChica modelo = new ModeloChica();
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
                modelo.setNombreChica(cursor.getString(0));
                modelo.setUrlFoto(cursor.getString(1));
                modelo.setUrlAudio(cursor.getString(2));
                cursor.moveToNext();
            }
            cursor.close();
            close();
            return modelo;
        } else {
            close();
            return null;
        }

    }


    public ArrayList<ModeloChica> obtenerLista() {
        open();
        Cursor cursor;
        ArrayList<ModeloChica> lista = new ArrayList<>();
        cursor = bdhhface.rawQuery("SELECT chica, foto1 FROM fotos", null);
        if (cursor.moveToFirst()) {
            while (!cursor.isAfterLast()) {
                ModeloChica modelo = new ModeloChica();
                modelo.setNombreChica(cursor.getString(0));
                modelo.setUrlFoto(cursor.getString(1));
                lista.add(modelo);
                cursor.moveToNext();
            }
            cursor.close();
            close();
            return lista;
        } else {
            close();
            return null;
        }

    }

}
