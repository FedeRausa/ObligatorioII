
package Dominio;


public class Evaluacion {
    private int estrellas;
    private String reseña;
    private Cliente usuario;
    private Restoran res;

    //**Constructores**//
    
    public Evaluacion(int estrellas, String reseña, Cliente usuario, Restoran res) {
        this.estrellas = estrellas;
        this.reseña = reseña;
        this.usuario = usuario;
        this.res = res;
    }
    
    public Evaluacion() {
        this.estrellas = 0;
        this.reseña = "";
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

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }
    
    
    
}
