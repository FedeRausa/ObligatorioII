//Fernando Martinez(194360) - Federico Riaño(207356)// 
package Dominio;

import java.util.*;

public class Sorteo {

    private int cantGanadores;
    private String fecha;
    private String texto;
    private ArrayList<Cliente> listaGanadores;

    //Constructores//
    public Sorteo(int cantGanadores, String fecha, String texto) {
        this.cantGanadores = cantGanadores;
        this.fecha = fecha;
        this.texto = texto;
        listaGanadores = new ArrayList<Cliente>();
    }

    public Sorteo() {
        this.cantGanadores = 0;
        this.fecha = "";
        this.texto = "";
        listaGanadores = new ArrayList<Cliente>();
    }

    //Geters y seters//
    public int getCantGanadores() {
        return cantGanadores;
    }

    public void setCantGanadores(int cantGanadores) {
        this.cantGanadores = cantGanadores;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList<Cliente> getListaGanadores() {
        return listaGanadores;
    }

    public void setListaGanadores(ArrayList<Cliente> listaGanadores) {
        this.listaGanadores = listaGanadores;
    }

}
