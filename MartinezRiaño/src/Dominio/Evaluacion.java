//Fernando Martinez(194360) - Federico Riaño(207356)// 
package Dominio;

public class Evaluacion {

    private int estrellas;
    private String resena;
    private Cliente usuario;
    private Restoran res;

    //**Constructores**//
    public Evaluacion(int estrellas, String resena, Cliente usuario, Restoran res) {
        this.estrellas = estrellas;
        this.resena = resena;
        this.usuario = usuario;
        this.res = res;
    }

    public Evaluacion(int estrellas, String resena, Restoran res) {
        this.estrellas = estrellas;
        this.resena = resena;

        this.res = res;
    }

    public Evaluacion() {
        this.estrellas = 0;
        this.resena = "";
        this.usuario = null;
        this.res = null;
    }

    //**Geters y seters**//
    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public Cliente getCliente() {
        return usuario;
    }

    public void setCliente(Cliente usuario) {
        this.usuario = usuario;
    }

}
