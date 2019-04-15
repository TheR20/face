package com.arturo.hentaiface.BD;


import android.content.Context;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class ParametrosBD extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "hhface.db";
    private static final int DATABASE_VERSION = 1;

    public ParametrosBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        setForcedUpgrade(DATABASE_VERSION);
    }


}