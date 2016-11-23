//Fernando Martinez(194360) - Federico Riaño(207356)// 
package Dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvaluacionTest {
    //Atributos necesarios para poder llavar a cabo las pruebas de la clase Evaluacion.//

    Cliente cli;
    Cliente cli2;
    Restoran res;
    Evaluacion eva;

    //Constructor//
    public EvaluacionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cli = new Cliente("Fede", 27, "Federico.ria.1989@gmail.com");
        cli2 = new Cliente("Fer", 30, "Fer123@gmail.com");
        res = new Restoran(91, "Parrillada Pepe", "Colonia 1658", 8, 22, "Vegetariano");
        eva = new Evaluacion(3, "La comida es muy rica", cli, res);
    }

    @After
    public void tearDown() {
    }

    //Se prueban los metodos geters y seters de la clase Evaluacion//
    @Test
    public void testGetEstrellas() {
        System.out.println("getEstrellas");
        int expResult = 3;
        int result = eva.getEstrellas();
        assertEquals(expResult, result);
        if (result != expResult) {
            fail("Error en la prueba.");
        }
    }

    @Test
    public void testSetEstrellas() {
        System.out.println("setEstrellas");
        int estrellas = 0;

        eva.setEstrellas(estrellas);
        if (estrellas != eva.getEstrellas()) {
            fail("Error en la prueba.");
        }
    }

    @Test
    public void testGetReseña() {
        System.out.println("getRese\u00f1a");
        String expResult = "La comida es muy rica";
        String result = eva.getResena();
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("Error en la prueba.");
        }
    }

    @Test
    public void testSetReseña() {
        System.out.println("setRese\u00f1a");
        String resena = "Lacomida es rica";
        eva.setResena(resena);
        if (!resena.equals(eva.getResena())) {
            fail("Error en la prueba.");
        }
    }

    @Test
    public void testGetCliente() {
        System.out.println("getUsuario");
        Cliente expResult = cli;
        Cliente result = eva.getCliente();
        assertEquals(expResult, result);
        if (!expResult.getMail().equals(result.getMail())) {
            fail("Error en la prueba.");
        }
    }

    @Test
    public void testSetCliente() {
        System.out.println("setUsuario");
        Cliente usuario = cli2;
        eva.setCliente(usuario);
        if (!usuario.getMail().equals(eva.getCliente().getMail())) {
            fail("Error en la prueba.");
        }
    }

}
