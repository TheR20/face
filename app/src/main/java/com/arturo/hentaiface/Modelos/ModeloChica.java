package com.arturo.hentaiface.Modelos;

public class ModeloChica {
    private String nombreChica;
    private String urlFoto;
    private String urlAudio;

    public ModeloChica() {
    }

    public ModeloChica(String nombreChica, String urlFoto, String urlAudio) {
        this.nombreChica = nombreChica;
        this.urlFoto = urlFoto;
        this.urlAudio = urlAudio;
    }

    public String getNombreChica() {
        return nombreChica;
    }

    public void setNombreChica(String nombreChica) {
        this.nombreChica = nombreChica;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getUrlAudio() {
        return urlAudio;
    }

    public void setUrlAudio(String urlAudio) {
        this.urlAudio = urlAudio;
    }
}
