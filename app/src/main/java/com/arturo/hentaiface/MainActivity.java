package com.arturo.hentaiface;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.arturo.hentaiface.Controladores.ControladorChica;
import com.arturo.hentaiface.Modelos.ModeloChica;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout linearChica;
    private ImageView imagen;
    private Button accionUno;
    private Button accionDos;
    private Button accionTres;
    private Button b3;
    private Button b4;
    private Button b5;
    private String foto;
    private String autdio;
    private  ProgressBar simpleProgressBar;
    int cuenta = 0;

    MediaPlayer md;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         imagen=findViewById(R.id.imagep);
        linearChica = findViewById(R.id.fondo);
        accionUno = findViewById(R.id.bo);
        accionDos = findViewById(R.id.bo2);
        accionTres = findViewById(R.id.bo3);
        b3 = findViewById(R.id.bo4);
        b4 = findViewById(R.id.bo5);
        b5 = findViewById(R.id.bo6);
        initComponents();


    }

    private void initComponents() {

        simpleProgressBar= findViewById(R.id.progressBar); // initiate the progress bar
        simpleProgressBar.setMax(100); // 100 maximum value for the progress value

       accionDos.setEnabled(false);
       accionTres.setEnabled(false);
       b3.setEnabled(false);
       b4.setEnabled(false);
       b5.setEnabled(false);

    }


    public void Cambio1(View view){
        llamada((1));
        cuenta = cuenta +1;
        simpleProgressBar.setProgress(cuenta);
        revisarprogreso();
        Sonido(1);
    }
    public void Cambio2(View view){
        llamada((2));
        cuenta = cuenta +3;
        simpleProgressBar.setProgress(cuenta);
        revisarprogreso();
        Sonido(2);
    }
    public void Cambio3(View view){
        cuenta = cuenta +5;
        simpleProgressBar.setProgress(cuenta);
        llamada((3));
        revisarprogreso();
        Sonido(3);
    }
    public void Cambio4(View view){
        cuenta = cuenta +7;
        simpleProgressBar.setProgress(cuenta);
        llamada((4));
        revisarprogreso();
        Sonido(4);
    }
    public void Cambio5(View view){

        cuenta = cuenta +10;
        simpleProgressBar.setProgress(cuenta);
        llamada((5));
        revisarprogreso();
        Sonido(5);
    }

    public void Cambio6(View view){


        llamada((6));
        Sonido(5);
    }


    public void Sonido(int bot){

        Random rand = new Random();
        // Obtain a number between [0 - 49].
        int bto = bot;
        int random = 0;
        switch (bto){
            case 1:
                random = 8;
                break;
            case 2:
                random = 17;
                break;
            case 3:
                random = 26;
                break;
            case 4:
                random = 35;
                break;
            case 5:
                random = 44;
                break;

        }
        int n = rand.nextInt(random);

        switch (n) {


            case 0:
                md = MediaPlayer.create(this,R.raw.a1);
                break;

            case 1:
                md = MediaPlayer.create(this,R.raw.a2);
                break;

            case 2:
                md = MediaPlayer.create(this,R.raw.a3);
                break;
                 case 3:
            md = MediaPlayer.create(this,R.raw.a4);
            break;
             case 4:
            md = MediaPlayer.create(this,R.raw.a5);
            break;
             case 5:
            md = MediaPlayer.create(this,R.raw.a6);
            break;
             case 6:
            md = MediaPlayer.create(this,R.raw.a7);
            break;
             case 7:
            md = MediaPlayer.create(this,R.raw.a8);
            break;
             case 8:
            md = MediaPlayer.create(this,R.raw.a9);
            break;
             case 9:
            md = MediaPlayer.create(this,R.raw.a10);
            break;
             case 10:
            md = MediaPlayer.create(this,R.raw.a11);
            break;
             case 11:
            md = MediaPlayer.create(this,R.raw.a12);
            break;
             case 12:
            md = MediaPlayer.create(this,R.raw.a13);
            break;
             case 13:
            md = MediaPlayer.create(this,R.raw.a14);
            break;
             case 14:
            md = MediaPlayer.create(this,R.raw.a15);
            break;
             case 15:
            md = MediaPlayer.create(this,R.raw.a16);
            break;
             case 16:
            md = MediaPlayer.create(this,R.raw.a17);
            break;
             case 17:
            md = MediaPlayer.create(this,R.raw.a18);
            break;
             case 18:
            md = MediaPlayer.create(this,R.raw.a19);
            break;
             case 19:
            md = MediaPlayer.create(this,R.raw.a20);
            break;
             case 20:
            md = MediaPlayer.create(this,R.raw.a21);
            break;
             case 21:
            md = MediaPlayer.create(this,R.raw.a22);
            break;
             case 22:
            md = MediaPlayer.create(this,R.raw.a23);
            break;
             case 23:
            md = MediaPlayer.create(this,R.raw.a24);
            break;
             case 24:
            md = MediaPlayer.create(this,R.raw.a25);
            break;
             case 25:
            md = MediaPlayer.create(this,R.raw.a26);
            break;
             case 26:
            md = MediaPlayer.create(this,R.raw.a27);
            break;
             case 27:
            md = MediaPlayer.create(this,R.raw.a28);
            break;
             case 28:
            md = MediaPlayer.create(this,R.raw.a29);
            break;
             case 29:
            md = MediaPlayer.create(this,R.raw.a30);
            break;
             case 30:
            md = MediaPlayer.create(this,R.raw.a31);
            break;
             case 31:
            md = MediaPlayer.create(this,R.raw.a32);
            break;
            case 32:
            md = MediaPlayer.create(this,R.raw.a33);
            break;
             case 33:
            md = MediaPlayer.create(this,R.raw.a34);
            break;
             case 34:
            md = MediaPlayer.create(this,R.raw.a35);
            break;
             case 35:
            md = MediaPlayer.create(this,R.raw.a36);
            break;
            case 36:
            md = MediaPlayer.create(this,R.raw.a37);
            break;
            case 37:
            md = MediaPlayer.create(this,R.raw.a38);
            break; case 38:
            md = MediaPlayer.create(this,R.raw.a39);
            break;
             case 39:
            md = MediaPlayer.create(this,R.raw.a40);
            break; case 40:
            md = MediaPlayer.create(this,R.raw.a41);
            break;
             case 41:
            md = MediaPlayer.create(this,R.raw.a42);
            break;
             case 42:
            md = MediaPlayer.create(this,R.raw.a43);
            break;
             case 43:
            md = MediaPlayer.create(this,R.raw.a44);
            break;
             case 44:
            md = MediaPlayer.create(this,R.raw.a45);
            break;

        }

        md.start();
    }

    public void llamada(int numero){
        ControladorChica controlador = new ControladorChica(this);
        ModeloChica modelo = new ModeloChica();
        modelo = controlador.obtenerElemento("Asuna",numero);
        foto =  modelo.getUrlFoto();
        Glide.with(this).load(foto).placeholder(R.mipmap.ic_launcher).into(imagen);
    }

    public void revisarprogreso(){
        int progressValue=simpleProgressBar.getProgress();

              if(progressValue >= 10)
                accionDos.setEnabled(true);

        if(progressValue >= 20 )
                accionTres.setEnabled(true);


        if(progressValue >= 50)
                b3.setEnabled(true);


        if(progressValue >= 78)
                b4.setEnabled(true);


        if(progressValue >= 100)
                b5.setEnabled(true);



    }

}
