
package obligatorio2;


public class Restoran {
    private String nombre;
    private String direccion;
    private int apertura;
    private int cierre;
    private String comida;
    private int promedio;

    public Restoran(String nombre, String direccion, int apertura, int cierre, String comida) {
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
    
    
    
    
}