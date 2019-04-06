package com.arturo.hentaiface;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.arturo.hentaiface.Controladores.ControladorChica;

public class SelectActivity extends AppCompatActivity {

    private ListView listMain;
    //private AdView mAdView;

    String nombre = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        initComponents();
    }

    void initComponents() {
        listMain = (ListView) findViewById(R.id.listMain);
        ControladorChica controlador = new ControladorChica(this);
        ListAdapter adaptador = new com.arturo.hentaiface.Adaptadores.ListAdapter(
                this,
                this,
                controlador.obtenerLista()
        );
        listMain.setAdapter(adaptador);
        listMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView nombre = view.findViewById(R.id.nombreChica);
                Intent intent = new Intent(SelectActivity.this, MainActivity.class);
                intent.putExtra("nombre", (nombre.getText()).toString());
                startActivity(intent);
            }
        });
      /*  MobileAds.initialize(this, "ca-app-pub-5146175048698339/8125361594");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/
    }
}
