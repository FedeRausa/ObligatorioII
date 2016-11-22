
package Dominio;


public class Evaluacion {
    private int estrellas;
    private String reseña;
    private Cliente usuario;

    
    private Restoran res;

    public Evaluacion(int estrellas, String reseña, Cliente usuario,Restoran restoran) {
        this.res=restoran;
        this.estrellas = estrellas;
        this.reseña = reseña;
        this.usuario = usuario;
    }

    public Evaluacion() {
    }

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
    public Restoran getRes() {
        return res;
    }

    public void setRes(Restoran res) {
        this.res = res;
    }
    
    
}
