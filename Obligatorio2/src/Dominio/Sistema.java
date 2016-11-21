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
    
   
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Sorteo> listaSorteos;
    private ArrayList<Restoran> listaRestoranes;
    private ArrayList<Evaluacion> listaEvaluaciones;
     
   public Sistema(){
    listaRestoranes = new ArrayList<Restoran>();
      listaClientes = new ArrayList<Cliente>();
      listaEvaluaciones = new ArrayList<Evaluacion>();
      listaSorteos = new ArrayList<Sorteo>();
     
   }

  
  
 //** Metodos para agregar a las listas**//
   
   public void agregarRestoran(Restoran res){ 
       this.getListaRestoranes().add(res);
   }

   public void agregarCliente(Cliente cli){ 
       this.getListaClientes().add(cli);
   }
   
   public void agregarSorteo(Sorteo s){ 
       this.getListaSorteos().add(s);
   }
   
   public void agregarEvaluacion(Evaluacion eva){ 
       this.getListaEvaluaciones().add(eva);
   }
   
   

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
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

    
   
  
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema sistema=new Sistema();
      Principal vista= new Principal(sistema);
       vista.setVisible(true);
        
    }
    
}
