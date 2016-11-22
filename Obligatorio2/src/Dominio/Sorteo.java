
package Dominio;

import java.util.*;


public class Sorteo {
    private Restoran restoran;
    private int cantGanadores;
    private int fecha;
    private String texto;
    private ArrayList<Cliente> listaGanadores;

    public Sorteo(Restoran restoran, int cantGanadores, int fecha, String texto) {
        this.restoran = restoran;
        this.cantGanadores = cantGanadores;
        this.fecha = fecha;
        this.texto = texto;
    }

    public Sorteo() {
        this.restoran = null;
        this.cantGanadores = 0;
        this.fecha = 0;
        this.texto = "";
    }

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }

    public int getCantGanadores() {
        return cantGanadores;
    }

    public void setCantGanadores(int cantGanadores) {
        this.cantGanadores = cantGanadores;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
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


