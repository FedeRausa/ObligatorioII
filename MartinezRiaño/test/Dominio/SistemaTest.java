//Fernando Martinez(194360) - Federico Riaño(207356)// 
package Dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {

    //Atributos necesarios para poder llavar a cabo las pruebas de la clase Cliente.//
    Sistema sis;
    ArrayList<Cliente> listaClientes;
    ArrayList<Sorteo> listaSorteos;
    ArrayList<Restoran> listaRestoranes;
    ArrayList<Evaluacion> listaEvaluaciones;
    ArrayList<Evaluacion> listaEvaluacionesAnonimas;
    ArrayList<String> listaComidas;
    Restoran res1;
    Restoran res2;
    Cliente cli1;
    Cliente cli2;
    Sorteo sor;
    Sorteo sor2;
    Cliente cli10;
    Cliente cli11;
    Cliente cliente1;
    Cliente cliente2;
    Restoran res10;
    Evaluacion eva1;
    Evaluacion eva2;
    ArrayList<Cliente> lista1;
    ArrayList<Evaluacion> listaEva;
    ArrayList<Sorteo> listaSor;
    ArrayList<Restoran> listaRest;

//Constructor//    
    public SistemaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        sis = new Sistema();
        listaRestoranes = new ArrayList<Restoran>();
        listaComidas = new ArrayList<String>();
        listaClientes = new ArrayList<Cliente>();
        listaEvaluaciones = new ArrayList<Evaluacion>();
        listaEvaluacionesAnonimas = new ArrayList<Evaluacion>();
        listaSorteos = new ArrayList<Sorteo>();
        res1 = new Restoran(1, "La Pasiva", "18 JULIO ", 10, 2, "Todo tipo de comidas");
        res2 = new Restoran(2, "Mc Donals", "Manuel Oribe ", 11, 3, "Carnes Rojas y Aves");
        sis.agregarRestoran(res1);
        sis.agregarRestoran(res2);
        cli1 = new Cliente("Elba Gallo", 49, "elba@gmail.com");
        cli2 = new Cliente("Armando Casas", 22, "casitas@gmail.com");
        sis.agregarCliente(cli1);
        sis.agregarCliente(cli2);
        sor = new Sorteo(3, "5 De Octubre", "Felicudades!! Has ganado una cena para dos personas.");
        sor2 = new Sorteo(1, "6 de MArzo", "Felicudades!!");
        sor.setListaGanadores(sis.getListaClientes());
        cli10 = new Cliente("Fede", 27, "Federico.ria.1989@gmail.com");
        cli11 = new Cliente("Fer", 30, "Fer123@gmail.com");
        res10 = new Restoran(91, "Parrillada Pepe", "Colonia 1658", 8, 22, "Vegetariano");
        eva1 = new Evaluacion(3, "La comida es muy rica", cli10, res10);
        cliente1 = new Cliente("Pablo Escobar", 38, "pablito@gmail.com");
        cliente2 = new Cliente("Manuel García", 23, "elManu@gmail.com");
        lista1 = new ArrayList<Cliente>();
        listaEva = new ArrayList<Evaluacion>();
        eva2 = new Evaluacion(2, "Porcionenes chicas", cli1, res1);
        listaSor = new ArrayList<Sorteo>();
        listaRest = new ArrayList<Restoran>();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAgregarRestoran() {
        System.out.println("agregarRestoran");
        Restoran res = res1;
        sis.agregarRestoran(res);
        if (sis.getListaRestoranes().get(sis.getListaRestoranes().size() - 1).getIdRestorant() != res1.getIdRestorant()) {
            fail("fallo de prueba.");
        }
    }

    @Test
    public void testAgregarCliente() {
        System.out.println("agregarCliente");
        Cliente cli = cli1;
        sis.agregarCliente(cli);
        if (!sis.getListaClientes().get(sis.getListaClientes().size() - 1).getMail().equals(cli1.getMail())) {
            fail("fallo de prueba.");
        }
    }

    @Test
    public void testAgregarSorteo() {               ///Reviso las personas sorteadas 
        System.out.println("agregarSorteo");
        Sorteo s = sor;
        sis.agregarSorteo(s);

        if (sor.getListaGanadores().size() != sis.getListaSorteos().get(sis.getListaSorteos().size() - 1).getListaGanadores().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < sor.getListaGanadores().size(); i++) {
                if (!sis.getListaSorteos().get(sis.getListaSorteos().size() - 1).getListaGanadores().get(i).getMail().equals(sor.getListaGanadores().get(i).getMail())) {
                    fail("Fallo la prueba.");
                }
            }
        }
        if (sor.getCantGanadores() != sis.getListaSorteos().get(sis.getListaSorteos().size() - 1).getCantGanadores()) {
            fail("Fallo la prueba.");
        }
        if (!sor.getTexto().equals(sis.getListaSorteos().get(sis.getListaSorteos().size() - 1).getTexto())) {
            fail("Fallo la prueba.");
        }
    }

    @Test
    public void testAgregarEvaluacion() {
        System.out.println("agregarEvaluacion");
        Evaluacion eva = eva1;
        sis.agregarEvaluacion(eva);

        if (sis.getListaEvaluaciones().get(sis.getListaEvaluaciones().size() - 1).getEstrellas() != eva1.getEstrellas()) {
            fail("Fallo la prueba.");
        }
        if (!sis.getListaEvaluaciones().get(sis.getListaEvaluaciones().size() - 1).getResena().equals(eva1.getResena())) {
            fail("Fallo la prueba.");
        }
        if (!sis.getListaEvaluaciones().get(sis.getListaEvaluaciones().size() - 1).getCliente().getMail().equals(eva1.getCliente().getMail())) {
            fail("Fallo la prueba.");
        }
    }

    @Test
    public void testAgregarEvaluacionAnonima() {
        System.out.println("agregarEvaluacionAnonima");
        Evaluacion eva = eva1;
        sis.agregarEvaluacion(eva);

        if (sis.getListaEvaluaciones().get(sis.getListaEvaluaciones().size() - 1).getEstrellas() != eva1.getEstrellas()) {
            fail("Fallo la prueba.");
        }
        if (!sis.getListaEvaluaciones().get(sis.getListaEvaluaciones().size() - 1).getResena().equals(eva1.getResena())) {
            fail("Fallo la prueba.");
        }

    }

    @Test
    public void testGetListaClientes() {
        System.out.println("getListaClientes");
        ArrayList<Cliente> expResult = sis.getListaClientes();

        if (expResult.size() != sis.getListaClientes().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < sis.getListaClientes().size(); i++) {
                if (!sis.getListaClientes().get(i).getMail().equals(expResult.get(i).getMail())) {
                    fail("Fallo la prueba.");
                }
            }
        }
    }

    @Test
    public void testSetListaClientes() {
        System.out.println("setListaClientes");
        lista1.add(cliente1);
        lista1.add(cliente2);
        ArrayList<Cliente> listaUsuarios = lista1;
        sis.setListaClientes(lista1);

        if (listaUsuarios.size() != sis.getListaClientes().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (!listaUsuarios.get(i).getMail().equals(sis.getListaClientes().get(i).getMail())) {
                    fail("Fallo la prueba.");
                }
            }
        }
    }

    @Test
    public void testGetListaEvaluacionesAnonimas() {
        System.out.println("getListaEvaluacionesAnonimas");
        ArrayList<Evaluacion> expResult = sis.getListaEvaluacionesAnonimas();

        if (expResult.size() != sis.getListaEvaluacionesAnonimas().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < sis.getListaEvaluacionesAnonimas().size(); i++) {
                if (!sis.getListaEvaluacionesAnonimas().get(i).getCliente().getMail().equals(expResult.get(i).getCliente().getMail())) {
                    fail("Fallo la prueba.");
                }
                if (!sis.getListaEvaluacionesAnonimas().get(i).getResena().equals(expResult.get(i).getResena())) {
                    fail("Fallo la prueba.");
                }
                if (sis.getListaEvaluacionesAnonimas().get(i).getEstrellas() != expResult.get(i).getEstrellas()) {
                    fail("Fallo la prueba.");
                }
            }
        }
    }

    @Test
    public void testSetListaEvaluacionesAnonimas() {
        System.out.println("setListaEvaluacionesAnonimas");
        listaEva.add(eva1);
        listaEva.add(eva2);
        ArrayList<Evaluacion> listaEvaluacionesAnon = listaEva;
        sis.setListaEvaluacionesAnonimas(listaEvaluacionesAnon);

        if (listaEvaluacionesAnon.size() != sis.getListaEvaluacionesAnonimas().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < listaEvaluacionesAnon.size(); i++) {
                if (!listaEvaluacionesAnon.get(i).getCliente().getMail().equals(sis.getListaEvaluacionesAnonimas().get(i).getCliente().getMail())) {
                    fail("Fallo la prueba.");
                }
                if (!listaEvaluacionesAnon.get(i).getResena().equals(sis.getListaEvaluacionesAnonimas().get(i).getResena())) {
                    fail("Fallo la prueba.");
                }
                if (listaEvaluacionesAnon.get(i).getEstrellas() != sis.getListaEvaluacionesAnonimas().get(i).getEstrellas()) {
                    fail("Fallo la prueba.");
                }
            }
        }
    }

    @Test
    public void testGetListaSorteos() {
        System.out.println("getListaSorteos");
        ArrayList<Sorteo> expResult = sis.getListaSorteos();

        if (expResult.size() != sis.getListaSorteos().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < expResult.size(); i++) {
                if (!expResult.get(i).getFecha().equals(sis.getListaSorteos().get(i).getFecha())) {
                    fail("Fallo la prueba.");
                }
                if (!expResult.get(i).getTexto().equals(sis.getListaSorteos().get(i).getTexto())) {
                    fail("Fallo la prueba.");
                }
                if (expResult.get(i).getCantGanadores() != sis.getListaSorteos().get(i).getCantGanadores()) {
                    fail("Fallo la prueba.");
                }
                if (expResult.get(i).getListaGanadores().size() != sis.getListaSorteos().get(i).getListaGanadores().size()) {
                    fail("Fallo la prueba.");
                } else {
                    for (int k = 0; i < expResult.get(i).getListaGanadores().size(); k++) {
                        if (!expResult.get(i).getListaGanadores().get(k).getMail().equals(sis.getListaSorteos().get(i).getListaGanadores().get(k).getMail())) {
                            fail("Fallo la prueba.");
                        }
                    }
                }

            }
        }
    }

    @Test
    public void testSetListaSorteos() {
        System.out.println("setListaSorteos");
        listaSor.add(sor2);
        ArrayList<Sorteo> listaSorteos = listaSor;
        sis.setListaSorteos(listaSorteos);

        if (listaSorteos.size() != sis.getListaSorteos().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < listaSorteos.size(); i++) {
                if (!listaSorteos.get(i).getFecha().equals(sis.getListaSorteos().get(i).getFecha())) {
                    fail("Fallo la prueba.");
                }
                if (!listaSorteos.get(i).getTexto().equals(sis.getListaSorteos().get(i).getTexto())) {
                    fail("Fallo la prueba.");
                }
                if (listaSorteos.get(i).getCantGanadores() != sis.getListaSorteos().get(i).getCantGanadores()) {
                    fail("Fallo la prueba.");
                }
                if (listaSorteos.get(i).getListaGanadores().size() != sis.getListaSorteos().get(i).getListaGanadores().size()) {
                    fail("Fallo la prueba.");
                } else {
                    for (int k = 0; i < listaSorteos.get(i).getListaGanadores().size(); k++) {
                        if (!listaSorteos.get(i).getListaGanadores().get(k).getMail().equals(sis.getListaSorteos().get(i).getListaGanadores().get(k).getMail())) {
                            fail("Fallo la prueba.");
                        }
                    }
                }

            }
        }
    }

    @Test
    public void testGetListaRestoranes() {
        System.out.println("getListaRestoranes");

        ArrayList<Restoran> expResult = sis.getListaRestoranes();

        if (expResult.size() != sis.getListaRestoranes().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < sis.getListaRestoranes().size(); i++) {
                if (sis.getListaRestoranes().get(i).getIdRestorant() != expResult.get(i).getIdRestorant()) {
                    fail("Fallo la prueba.");
                }
            }
        }
    }

    @Test
    public void testSetListaRestoranes() {
        System.out.println("setListaRestoranes");
        listaRest.add(res1);
        listaRest.add(res2);

        sis.setListaRestoranes(listaRest);

        if (listaRest.size() != sis.getListaRestoranes().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < sis.getListaRestoranes().size(); i++) {
                if (sis.getListaRestoranes().get(i).getIdRestorant() != listaRest.get(i).getIdRestorant()) {
                    fail("Fallo la prueba.");
                }
            }
        }
    }

    @Test
    public void testGetListaEvaluaciones() {
        System.out.println("getListaEvaluaciones");
        ArrayList<Evaluacion> expResult = sis.getListaEvaluaciones();

        if (expResult.size() != sis.getListaEvaluaciones().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < sis.getListaEvaluaciones().size(); i++) {
                if (!sis.getListaEvaluaciones().get(i).getCliente().getMail().equals(expResult.get(i).getCliente().getMail())) {
                    fail("Fallo la prueba.");
                }
                if (!sis.getListaEvaluaciones().get(i).getResena().equals(expResult.get(i).getResena())) {
                    fail("Fallo la prueba.");
                }
                if (sis.getListaEvaluaciones().get(i).getEstrellas() != expResult.get(i).getEstrellas()) {
                    fail("Fallo la prueba.");
                }
                if (!sis.getListaEvaluaciones().get(i).getCliente().getMail().equals(expResult.get(i).getCliente().getMail())) {
                    fail("Fallo la prueba.");
                }
            }
        }
    }

    @Test
    public void testSetListaEvaluaciones() {
        System.out.println("setListaEvaluaciones");

        listaEva.add(eva1);
        listaEva.add(eva2);
        // ArrayList<Evaluacion> listaE =  listaEva;
        sis.setListaEvaluaciones(listaEva);

        if (listaEva.size() != sis.getListaEvaluaciones().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < listaEva.size(); i++) {
                if (!listaEva.get(i).getCliente().getMail().equals(sis.getListaEvaluaciones().get(i).getCliente().getMail())) {
                    fail("Fallo la prueba.");
                }
                if (!listaEva.get(i).getResena().equals(sis.getListaEvaluaciones().get(i).getResena())) {
                    fail("Fallo la prueba.");
                }
                if (listaEva.get(i).getEstrellas() != sis.getListaEvaluaciones().get(i).getEstrellas()) {
                    fail("Fallo la prueba.");
                }
                if (!sis.getListaEvaluaciones().get(i).getCliente().getMail().equals(listaEva.get(i).getCliente().getMail())) {
                    fail("Fallo la prueba.");
                }
            }
        }

    }

    @Test
    public void testGanadores() {
        System.out.println("Ganadores");
        sis.ganadores(sor2);
        sis.setListaClientes(lista1);

        if (sor2.getListaGanadores().size() != sor2.getCantGanadores()) {
            fail("Fallo la prueba.");
        }

    }

    @Test
    public void testContiene() {
        System.out.println("Contiene");
        int[] array = new int[2];
        array[1] = 4;
        array[0] = 3;
        int dato = 3;
        boolean expResult = true;

        if (expResult != sis.Contiene(array, dato)) {
            fail("Fallo la prueba.");
        }
    }
    
    @Test
    public void testContiene2() {
        System.out.println("Contiene2");
        int[] array = new int[0];
        int dato = 3;
        boolean expResult = false;

        if (expResult != sis.Contiene(array, dato)) {
            fail("Fallo la prueba.");
        }
    }
    
    @Test
    public void testContiene3() {
        System.out.println("Contiene2");
        int[] array = new int[5];
        array[0] = 8;
        array[1] = 3;
        array[2] = 1;
        array[3] = 2;
        array[4] = 6;
        
        int dato = 6;
        boolean expResult = true;

        if (expResult != sis.Contiene(array, dato)) {
            fail("Fallo la prueba.");
        }
    }
    
        @Test
    public void testContiene4() {
        System.out.println("Contiene2");
        int[] array = new int[5];
        array[0] = 8;
        array[1] = 3;
        array[2] = 1;
        array[3] = 2;
        array[4] = 6;
        
        int dato = 7;
        boolean expResult = false;

        if (expResult != sis.Contiene(array, dato)) {
            fail("Fallo la prueba.");
        }
    }

    
    @Test
    public void testCargarRestoran() {
        System.out.println("cargarRestoran");
        int largoInicial = sis.getListaRestoranes().size();
        int diferencia = 8;
        sis.cargarRestoran();
        int largoFinal = sis.getListaRestoranes().size();
        if (largoFinal - largoInicial != diferencia) {
            fail("Fallo la prueba.");
        }
    }

    @Test
    public void testCargarClientes() {
        System.out.println("cargarClientes");
        int largoInicial = sis.getListaClientes().size();
        int diferencia = 10;                                //Se agregan 10 clientes
        sis.cargarClientes();
        int largoFinal = sis.getListaClientes().size();
        if (largoFinal - largoInicial != diferencia) {
            fail("Fallo la prueba.");
        }

    }

    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Sistema.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}
