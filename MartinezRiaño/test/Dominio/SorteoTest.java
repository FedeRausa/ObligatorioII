//Fernando Martinez(194360) - Federico Riaño(207356)// 
package Dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SorteoTest {

    //Atributos necesarios para poder llavar a cabo las pruebas de la clase Sorteo.//
    Sorteo sor;
    ArrayList<Cliente> lista1;
    ArrayList<Cliente> lista2;

    //Constructor//
    public SorteoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        sor = new Sorteo(3, "5 De Octubre", "Felicudades!! Has ganado una cena para dos personas.");
        lista1 = new ArrayList<Cliente>();
        lista2 = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("Pablo Escobar", 38, "pablito@gmail.com");
        Cliente cliente2 = new Cliente("Manuel GarcÃ­a", 23, "elManu@gmail.com");
        Cliente cliente3 = new Cliente("Chapu GuzmÃ¡n", 59, "elChapu@hotmail.com");
        Cliente cliente4 = new Cliente("Zacarias Flores del Campo", 34, "zacarias@gmail.com");
        Cliente cliente5 = new Cliente("Fernando MartÃ­nez ", 41, "fernando.a.martinez.75@gmail.com");
        Cliente cliente6 = new Cliente("Federico RiaÃ±o", 27, "federico.ria.1989@gmail.com");
        lista1.add(cliente1);
        lista1.add(cliente2);
        lista1.add(cliente3);
        lista1.add(cliente4);
        lista2.add(cliente5);
        lista2.add(cliente6);
        sor.setListaGanadores(lista1);

    }

    @After
    public void tearDown() {
    }

    //Se prueban los metodos geters y seters de la clase Sorteo.//
    @Test
    public void testGetCantGanadores() {
        System.out.println("getCantGanadores");
        int expResult = 3;
        int result = sor.getCantGanadores();
        assertEquals(expResult, result);
        if (result != expResult) {
            fail("Fallo en la prueba.");
        }
    }

    @Test
    public void testSetCantGanadores() {
        System.out.println("setCantGanadores");
        int cantGanadores = 0;
        sor.setCantGanadores(cantGanadores);
        if (cantGanadores != sor.getCantGanadores()) {
            fail("Fallo la prueba.");
        }
    }

    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        String expResult = "5 De Octubre";
        String result = sor.getFecha();
        assertEquals(expResult, result);
        if (!result.equals(result)) {
            fail("Fallo la prueba.");
        }
    }

    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "10 de Agosto";
        sor.setFecha(fecha);
        if (!fecha.equals(sor.getFecha())) {
            fail("Fallo la prueba.");
        }
    }

    @Test
    public void testGetTexto() {
        System.out.println("getTexto");
        String expResult = "Felicudades!! Has ganado una cena para dos personas.";
        String result = sor.getTexto();
        assertEquals(expResult, result);
        if (!result.equals(result)) {
            fail("Fallo la prueba.");
        }
    }

    @Test
    public void testSetTexto() {
        System.out.println("setTexto");
        String texto = "Felicidades!!";
        sor.setTexto(texto);
        if (!texto.equals(sor.getTexto())) {
            fail("Fallo la prueba.");
        }
    }

    @Test
    public void testGetListaGanadores() {
        System.out.println("getListaGanadores");
        ArrayList<Cliente> expResult = lista1;
        ArrayList<Cliente> result = sor.getListaGanadores();
        if (expResult.size() != sor.getListaGanadores().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < expResult.size(); i++) {
                if (!expResult.get(i).getMail().equals(sor.getListaGanadores().get(i).getMail())) {
                    fail("Fallo la prueba.");
                }
            }
        }

    }

    @Test
    public void testSetListaGanadores() {
        System.out.println("setListaGanadores");
        ArrayList<Cliente> listaGanadores = lista2;
        sor.setListaGanadores(listaGanadores);
        if (listaGanadores.size() != sor.getListaGanadores().size()) {
            fail("Fallo la prueba.");
        } else {
            for (int i = 0; i < listaGanadores.size(); i++) {
                if (!listaGanadores.get(i).getMail().equals(sor.getListaGanadores().get(i).getMail())) {
                    fail("Fallo la prueba.");
                }
            }
        }
    }

}
