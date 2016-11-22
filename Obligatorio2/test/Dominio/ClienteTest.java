/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Federico
 */
public class ClienteTest {
    
    private Cliente cli;
    
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
        cli = new Cliente("nombre",20,"mail");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "nombre";
        String result = cli.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("Error en la prueba.");
        }
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        cli.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        if(!nombre.equals(cli.getNombre())){
            fail("Error en la prueba.");
        }
    }

    /**
     * Test of getEdad method, of class Cliente.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        int expResult = 20;
        int result = cli.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("Error en la prueba.");
        }
    }

    /**
     * Test of setEdad method, of class Cliente.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        cli.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        if(edad != cli.getEdad()){
            fail("Error en la prueba.");
        }
    }

    /**
     * Test of getMail method, of class Cliente.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        String expResult = "mail";
        String result = cli.getMail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("Error en la prueba.");
        }
    
    }

    /**
     * Test of setMail method, of class Cliente.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "";
        cli.setMail(mail);
        // TODO review the generated test code and remove the default call to fail.
        if(!mail.equals(cli.getMail())){
            fail("Error en la prueba.");
        }
    }
    
}
