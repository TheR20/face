package com.arturo.hentaiface.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ObtenerBD {

    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static ObtenerBD instance;

    private ObtenerBD(Context context) {
        this.openHelper = new ParametrosBD(context);
    }

    public static ObtenerBD getInstance(Context context) {
        if (instance == null) {
            instance = new ObtenerBD(context);
        }
        return instance;
    }
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    public SQLiteDatabase obtenermiBD(){
        return this.database;
    }

}