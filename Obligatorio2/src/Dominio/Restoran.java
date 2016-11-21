
package Dominio;


public class Restoran extends Sistema{
    
    private String nombre;
    private String direccion;
    private int apertura;
    private int cierre;
    private String comida;
    private int promedio;
    private int id;

    

    public Restoran(int idRestorant,String nombre, String direccion, int apertura, int cierre, String comida) {
        this.id = modificarIdRestoran();
        this.nombre = nombre;
        this.direccion = direccion;
        this.apertura = apertura;
        this.cierre = cierre;
        this.comida = comida;
        this.promedio = 0;
        
        
        
    }

    public Restoran() {
    }

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
        return id;
    }

    public void setIdRestorant(int idRestorant) {
        this.id = idRestorant;
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

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
    
    public int getId() {
        return id;
    }

    public void setId( int id) {
        this.id = id;
    }
    
    
}
