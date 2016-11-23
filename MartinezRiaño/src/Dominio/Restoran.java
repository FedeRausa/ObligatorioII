//Fernando Martinez(194360) - Federico Riaño(207356)// 
package Dominio;

public class Restoran {

    private String nombre;
    private String direccion;
    private int apertura;
    private int cierre;
    private String comida;
    private int idRestoran;

    //Contructores//
    public Restoran(int id, String nombre, String direccion, int apertura, int cierre, String comida) {
        this.idRestoran = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.apertura = apertura;
        this.cierre = cierre;
        this.comida = comida;
    }

    public Restoran() {
        this.idRestoran = 0;
        this.nombre = "";
        this.direccion = "";
        this.apertura = 0;
        this.cierre = 0;
        this.comida = "";
    }

    //Geters y seters//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getIdRestorant() {
        return idRestoran;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getApertura() {
        return apertura;
    }

    public void setApertura(int apertura) {
        this.apertura = apertura;
    }

    public int getCierre() {
        return cierre;
    }

    public void setCierre(int cierre) {
        this.cierre = cierre;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
}
