package com.arturo.hentaiface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

import com.arturo.hentaiface.Controladores.ControladorChica;
import com.arturo.hentaiface.Modelos.ModeloChica;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearChica;
    private Button accionUno;
    private Button accionDos;
    private Button accionTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents() {
        ControladorChica controlador = new ControladorChica(this);
        /*
        Servido capitan :v

         */
    }
}
