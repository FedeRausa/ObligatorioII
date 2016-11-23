//Fernando Martinez(194360) - Federico Riaño(207356)// 
package Dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestoranTest {

    //Atributos necesarios para poder llavar a cabo las pruebas de la clase Restoran.//
    private Restoran rest;

    //Constructor//
    public RestoranTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        rest = new Restoran(1, "nombre", "dir", 8, 20, "comida");
    }

    @After
    public void tearDown() {
    }

    //Se prueban los metodos geters y seters de la clase Restoran//
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "nombre";
        String result = rest.getNombre();
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("Error en la prueba");
        }
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        rest.setNombre(nombre);
        if (!rest.getNombre().equals(nombre)) {
            fail("Error en la prueba");
        }
    }

    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        String expResult = "dir";
        String result = rest.getDireccion();
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("Error en la prueba");
        }
    }

    @Test
    public void testGetIdRestorant() {
        System.out.println("getIdRestorant");
        int expResult = 1;
        int result = rest.getIdRestorant();
        assertEquals(expResult, result);
        if (result != expResult) {
            fail("Error en la prueba");
        }
    }

    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        rest.setDireccion(direccion);
        if (!rest.getDireccion().equals(direccion)) {
            fail("Error en la prueba");
        }
    }

    @Test
    public void testGetApertura() {
        System.out.println("getApertura");
        int expResult = 8;
        int result = rest.getApertura();
        assertEquals(expResult, result);
        if (result != expResult) {
            fail("Error en la prueba");
        }
    }

    @Test
    public void testSetApertura() {
        System.out.println("setApertura");
        int apertura = 0;
        rest.setApertura(apertura);
        if (apertura != rest.getApertura()) {
            fail("Error en la prueba");
        }
    }

    @Test
    public void testGetCierre() {
        System.out.println("getCierre");
        int expResult = 20;
        int result = rest.getCierre();
        assertEquals(expResult, result);
        if (result != expResult) {
            fail("Error en la prueba");
        }
    }

    @Test
    public void testSetCierre() {
        System.out.println("setCierre");
        int cierre = 0;
        rest.setCierre(cierre);
        if (cierre != rest.getCierre()) {
            fail("Error en la prueba");
        }
    }

    @Test
    public void testGetComida() {
        System.out.println("getComida");
        String expResult = "comida";
        String result = rest.getComida();
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("Error en la prueba");
        }
    }

    @Test
    public void testSetComida() {
        System.out.println("setComida");
        String comida = "";
        rest.setComida(comida);
        if (!rest.getComida().equals(comida)) {
            fail("Error en la prueba");
        }
    }
}
