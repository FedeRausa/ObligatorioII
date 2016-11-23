//Fernando Martinez(194360) - Federico Riaño(207356)// 
package Dominio;

import interfaz.Principal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sistema {

    private ArrayList<Cliente> listaClientes;
    private ArrayList<Sorteo> listaSorteos;
    private ArrayList<Restoran> listaRestoranes;
    private ArrayList<Evaluacion> listaEvaluaciones;
    private ArrayList<Evaluacion> listaEvaluacionesAnonimas;

    //Constructor.//
    public Sistema() {
        listaRestoranes = new ArrayList<Restoran>();
        listaClientes = new ArrayList<Cliente>();
        listaEvaluaciones = new ArrayList<Evaluacion>();
        listaEvaluacionesAnonimas = new ArrayList<Evaluacion>();
        listaSorteos = new ArrayList<Sorteo>();
    }

    //** Metodos para agregar elementos a las listas, que son los tributos de mi clase Sistema**//
    public void agregarRestoran(Restoran res) {
        this.getListaRestoranes().add(res);
    }

    public void agregarCliente(Cliente cli) {
        this.getListaClientes().add(cli);
    }

    public void agregarSorteo(Sorteo s) {
        this.getListaSorteos().add(s);
    }

    public void agregarEvaluacion(Evaluacion eva) {
        this.getListaEvaluaciones().add(eva);
    }

    public void agregarEvaluacionAnonima(Evaluacion eva) {
        this.getListaEvaluacionesAnonimas().add(eva);
    }

    //Geters y seters//
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaUsuarios) { ////cambio
        this.listaClientes = listaUsuarios;
    }

    public ArrayList<Evaluacion> getListaEvaluacionesAnonimas() {
        return listaEvaluacionesAnonimas;
    }

    public void setListaEvaluacionesAnonimas(ArrayList<Evaluacion> listaEvaluacionesAnonimas) {
        this.listaEvaluacionesAnonimas = listaEvaluacionesAnonimas;
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

    //Metodo Ganadores: Este metodo Recibe un sorteo, de este obtiene el dato de cantidad de ganadores x, luego      //
    //                  con este dato busca x clientes al azar entro de la lista de clientes guardados en el sistema.//
    public void ganadores(Sorteo sor) {
        int cantGanadores = sor.getCantGanadores();
        int[] indices = new int[cantGanadores];
        for (int j = 0; j < indices.length; j++) {
            indices[j] = -1;
        }
        while (cantGanadores > 0) {
            int valorEntero = (int) Math.floor(Math.random() * (this.getListaClientes().size()));
            if (!Contiene(indices, valorEntero)) {
                indices[cantGanadores - 1] = valorEntero;
                cantGanadores--;
            }
        }
        for (int k = 0; k < indices.length; k++) {
            Cliente aux = this.getListaClientes().get(indices[k]);
            sor.getListaGanadores().add(aux);
        }
    }

    //Metodo contiene: Recibe un arreglo y un dato, retornando true si el elemento se encuentra en el arreglo.
    public boolean Contiene(int[] array, int dato) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == dato) {
                return true;
            }
        }
        return false;
    }

    //Metodo cargarRestoran: Agrega Restorantes a la lista para luego poder cargarlos en la tabla.//
    public void cargarRestoran() {
        Restoran res1 = new Restoran(1, "La Pasiva", "18 JULIO ", 10, 2, "Todo tipo de comidas");
        Restoran res2 = new Restoran(2, "McDonal's", "Manuel Oribe ", 11, 3, "Carnes Rojas y Aves");
        Restoran res3 = new Restoran(3, "Paris", "8 de Octubre ", 9, 0, "De pescados y mariscos");
        Restoran res4 = new Restoran(4, "El Subte", " Ejido ", 8, 4, "Todo tipo de comidas");
        Restoran res5 = new Restoran(5, "Marsella", "La rue", 10, 2, "Macrobiótico");
        Restoran res6 = new Restoran(6, "La Ricura", "Cuareim", 7, 2, "Vegetariano");
        Restoran res7 = new Restoran(7, "Ratatouille", "Cerro Largo ", 17, 5, "Todo tipo de comidas");
        Restoran res8 = new Restoran(8, "Burger King", "Bulevar Artigas ", 11, 4, "Carnes Rojas y Aves");
        agregarRestoran(res1);
        agregarRestoran(res2);
        agregarRestoran(res3);
        agregarRestoran(res4);
        agregarRestoran(res5);
        agregarRestoran(res6);
        agregarRestoran(res7);
        agregarRestoran(res8);
    }

    //Metodo cargarClientes: Agrega Restorantes a la lista para luego poder cargarlos en la tabla.// 
    public void cargarClientes() {
        Cliente cliente1 = new Cliente("Pablo Escobar", 38, "pablito@gmail.com");
        Cliente cliente2 = new Cliente("Manuel García", 23, "elManu@gmail.com");
        Cliente cliente3 = new Cliente("Chapu Guzmán", 59, "elChapu@hotmail.com");
        Cliente cliente4 = new Cliente("Zacarias Flores del Campo", 34, "zacarias@gmail.com");
        Cliente cliente5 = new Cliente("Fernando Martínez ", 41, "fernando.a.martinez.75@gmail.com");
        Cliente cliente6 = new Cliente("Federico Riaño", 27, "federico.ria.1989@gmail.com");
        Cliente cliente7 = new Cliente("Donald Trump", 70, "tamosFritos@hotmail.com");
        Cliente cliente8 = new Cliente("Hillary Clinton", 60, "palaproxima@gmail.com");
        Cliente cliente9 = new Cliente("Elba Gallo", 49, "elba@gmail.com");
        Cliente cliente10 = new Cliente("Armando Casas", 22, "casitas@gmail.com");
        agregarCliente(cliente1);
        agregarCliente(cliente2);
        agregarCliente(cliente3);
        agregarCliente(cliente4);
        agregarCliente(cliente5);
        agregarCliente(cliente6);
        agregarCliente(cliente7);
        agregarCliente(cliente8);
        agregarCliente(cliente9);
        agregarCliente(cliente10);
    }

    //Metodo validarMAil: Valida el Email utilizando expresión regular. 
    public boolean validarEmail(String email) {
        String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    //Metodo dameRestoran: Retorna el restoran que contiene el nombre pasado por parámetro.
    public Restoran dameRestoran(String nombre) {
        Iterator<Restoran> it = this.getListaRestoranes().iterator();
        Restoran buscado = null;
        while (it.hasNext()) {
            Restoran aux = it.next();
            if (aux.getNombre().equals(nombre)) {
                buscado = aux;
            }
        }
        return buscado;
    }

    

}
