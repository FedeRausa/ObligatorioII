
package Dominio;


public class Evaluacion {
    private int estrellas;
    private String reseña;
    private Cliente usuario;

    //**Constructores**//
    
    public Evaluacion(int estrellas, String reseña, Cliente usuario) {
        this.estrellas = estrellas;
        this.reseña = reseña;
        this.usuario = usuario;
    }
    
    public Evaluacion() {
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
