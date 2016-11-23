
package Dominio;

import interfaz.Principal;


public class Inicio {
    
    //**Main**//
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Principal vista = new Principal(sistema);
        vista.setVisible(true);

    }
}
