/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2;

import interfaz.Principal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Federico
 */
public class Obligatorio2 {
    
    private ArrayList<Evaluacion> listaFichas;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Usuario> listaUsuariosConFicha;
    private ArrayList<Sorteo> listaSorteos;
    private ArrayList<Restoran> listaRestoranes;
    private ArrayList<Evaluacion> listaEvaluaciones;
    private ArrayList<String> listaComidas;
   public Obligatorio2(){
       listaRestoranes = new ArrayList<Restoran>();
   }
   
   public void agregarRestoran(Restoran res){ 
       res.setId(res.getId());
   
   this.getListaRestoranes().add(res);
       
   
}

    public ArrayList<Evaluacion> getListaFichas() {
        return listaFichas;
    }

    public void setListaFichas(ArrayList<Evaluacion> listaFichas) {
        this.listaFichas = listaFichas;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Usuario> getListaUsuariosConFicha() {
        return listaUsuariosConFicha;
    }

    public void setListaUsuariosConFicha(ArrayList<Usuario> listaUsuariosConFicha) {
        this.listaUsuariosConFicha = listaUsuariosConFicha;
    }

    public ArrayList<Sorteo> getListaSorteos() {
        return listaSorteos;
    }

    public void setListaSorteos(ArrayList<Sorteo> listaSorteos) {
        this.listaSorteos = listaSorteos;
    }

    public ArrayList<Restoran> getListaRestoranes() {
        return listaRestoranes;
    }

    public void setListaRestoranes(ArrayList<Restoran> listaRestoranes) {
        this.listaRestoranes = listaRestoranes;
    }

    public ArrayList<Evaluacion> getListaEvaluaciones() {
        return listaEvaluaciones;
    }

    public void setListaEvaluaciones(ArrayList<Evaluacion> listaEvaluaciones) {
        this.listaEvaluaciones = listaEvaluaciones;
    }

    public ArrayList<String> getListaComidas() {
        return listaComidas;
    }

    public void setListaComidas(ArrayList<String> listaComidas) {
        this.listaComidas = listaComidas;
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Obligatorio2 sistema=new Obligatorio2();
      Principal vista= new Principal(sistema);
       vista.setVisible(true);
        
    }
    
}
