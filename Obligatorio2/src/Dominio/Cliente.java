
package Dominio;

public class Cliente {
    private String nombre;
    private int edad;
    private String mail;

    public Cliente(String nombre, int edad, String mail) {
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
    
}
