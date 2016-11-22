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
    
    //private ArrayList<Evaluacion> listaFichas;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Sorteo> listaSorteos;
    private ArrayList<Restoran> listaRestoranes;
    private ArrayList<Evaluacion> listaEvaluaciones;
    private ArrayList<String> listaComidas;
    
    private int idRestoran;
   
    //***Constructor**//
    
    public Sistema(){
       
       listaRestoranes = new ArrayList<Restoran>();
       listaComidas = new ArrayList<String>();
       listaClientes = new ArrayList<Cliente>();
       listaEvaluaciones = new ArrayList<Evaluacion>();
       listaSorteos = new ArrayList<Sorteo>();
       idRestoran = 0;
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
   
    //**Geters y seters**//
    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaUsuarios) {
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

    public ArrayList<String> getListaComidas() {
        return listaComidas;
    }

    public void setListaComidas(ArrayList<String> listaComidas) {
        this.listaComidas = listaComidas;
    }
   
    //**Metodos utiles manejo de aplicacion**//
    
    public int modificarIdRestoran(){
        this.idRestoran++;
        return idRestoran;
    }
    
     public void Ganadores(int cantGanadores, Sorteo sor){
       int[] indices = new int [cantGanadores];
       ArrayList<Cliente> ganadores;
       
       while (cantGanadores > 0){
           int valorEntero = (int) Math.floor(Math.random()*(20-1+1)+1);
           if (!Contiene(indices,valorEntero)){
               indices[cantGanadores]= valorEntero;
           }
           cantGanadores--;
       }
       
       for (int k = 0; k <indices.length; k++){
           Cliente aux = this.getListaClientes().get(k);
           sor.getListaGanadores().add(aux);
       }
      
    return ;  
    }
   
    public boolean Contiene(int[] array, int dato){
            for(int j = 0; j < array.length ; j++){
                if(array[j] == dato){
                    return true;
                }
            }
            
            return false;
    }
    
    
    //**Main**//
    public static void main(String[] args) {
        Sistema sistema=new Sistema();
      Principal vista= new Principal(sistema);
       vista.setVisible(true);
        
    }
    
}
