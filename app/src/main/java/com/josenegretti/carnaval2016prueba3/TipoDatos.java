package com.josenegretti.carnaval2016prueba3;

/**
 * Created by José on 29/12/2015.
 */
public class TipoDatos  {
    private String[] numero;
    private String[] nombre;

    public TipoDatos(String[] numero, String[] nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public String[] getNumero() {
        return numero;
    }

    public void setNumero(String[] numero) {
        this.numero = numero;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }
}
