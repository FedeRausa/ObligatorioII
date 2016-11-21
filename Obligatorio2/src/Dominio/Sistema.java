/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import interfaz.Principal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Federico
 */
public class Sistema {
    
    private ArrayList<Evaluacion> listaFichas;
    private ArrayList<Cliente> listaUsuarios;
    private ArrayList<Cliente> listaUsuariosConFicha;
    private ArrayList<Sorteo> listaSorteos;
    private ArrayList<Restoran> listaRestoranes;
    private ArrayList<Evaluacion> listaEvaluaciones;
    private ArrayList<String> listaComidas;
   public Sistema(){
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

    public ArrayList<Cliente> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Cliente> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Cliente> getListaUsuariosConFicha() {
        return listaUsuariosConFicha;
    }

    public void setListaUsuariosConFicha(ArrayList<Cliente> listaUsuariosConFicha) {
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
        Sistema sistema=new Sistema();
      Principal vista= new Principal(sistema);
       vista.setVisible(true);
        
    }
    
}
