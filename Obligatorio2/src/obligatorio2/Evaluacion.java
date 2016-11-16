
package obligatorio2;


public class Evaluacion {
    private int estrellas;
    private String reseña;
    private Usuario usuario;

    public Evaluacion(int estrellas, String reseña, Usuario usuario) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
