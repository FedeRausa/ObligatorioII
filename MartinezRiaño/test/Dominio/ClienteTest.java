//Fernando Martinez(194360) - Federico Riaño(207356)// 
package Dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    //Atributos necesarios para poder llavar a cabo las pruebas de la clase Cliente.//
    private Cliente cli;

    //Constructor//
    public ClienteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cli = new Cliente("nombre", 20, "mail");
    }

    @After
    public void tearDown() {
    }

    //Se prueban los metodos geters y seters de la clase Cliente//
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "nombre";
        String result = cli.getNombre();
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("Error en la prueba.");
        }
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        cli.setNombre(nombre);
        if (!nombre.equals(cli.getNombre())) {
            fail("Error en la prueba.");
        }
    }

    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        int expResult = 20;
        int result = cli.getEdad();
        assertEquals(expResult, result);
        if (result != expResult) {
            fail("Error en la prueba.");
        }
    }

    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        cli.setEdad(edad);
        if (edad != cli.getEdad()) {
            fail("Error en la prueba.");
        }
    }

    @Test
    public void testGetMail() {
        System.out.println("getMail");
        String expResult = "mail";
        String result = cli.getMail();
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("Error en la prueba.");
        }

    }

    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        cli.setMail(mail);
        if (!mail.equals(cli.getMail())) {
            fail("Error en la prueba.");
        }
    }

}
