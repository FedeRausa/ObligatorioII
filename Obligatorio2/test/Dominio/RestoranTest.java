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
public class RestoranTest {
    
    private Restoran rest;
   
    
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
        
        rest = new Restoran(1,"nombre","dir",8,20,"comida");
        
    }
    
    @After
    public void tearDown() {
    }

   
    
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String expResult = "nombre";
        String result = rest.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("Error en la prueba");
        }    
    }

    /**
     * Test of setNombre method, of class Restoran.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        rest.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        if(!rest.getNombre().equals(nombre)){
            fail("Error en la prueba");
        } 
    }

    /**
     * Test of getDireccion method, of class Restoran.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        String expResult = "dir";
        String result = rest.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("Error en la prueba");
        }   
    }

    /**
     * Test of getIdRestorant method, of class Restoran.
     */
    @Test
    public void testGetIdRestorant() {
        System.out.println("getIdRestorant");
        int expResult = 1;
        int result = rest.getIdRestorant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("Error en la prueba");
        } 
    }

    /**
     * Test of setIdRestorant method, of class Restoran.
     */
    @Test
    public void testSetIdRestorant() {
        System.out.println("setIdRestorant");
        int idRestorant = 0;
        
        rest.setIdRestorant(idRestorant);
        // TODO review the generated test code and remove the default call to fail.
        if(rest.getIdRestorant() != idRestorant){
            fail("Error en la prueba");
        } 
    }

    /**
     * Test of setDireccion method, of class Restoran.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        rest.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        if(!rest.getDireccion().equals(direccion)){
            fail("Error en la prueba");
        } 
    }

    /**
     * Test of getApertura method, of class Restoran.
     */
    @Test
    public void testGetApertura() {
        System.out.println("getApertura");
        int expResult = 8;
        int result = rest.getApertura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("Error en la prueba");
        } 
    }

    /**
     * Test of setApertura method, of class Restoran.
     */
    @Test
    public void testSetApertura() {
        System.out.println("setApertura");
        int apertura = 0;
        rest.setApertura(apertura);
        // TODO review the generated test code and remove the default call to fail.
        if(apertura != rest.getApertura()){
            fail("Error en la prueba");
        } 
    }

    /**
     * Test of getCierre method, of class Restoran.
     */
    @Test
    public void testGetCierre() {
        System.out.println("getCierre");
        int expResult = 20;
        int result = rest.getCierre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("Error en la prueba");
        } 
    }

    /**
     * Test of setCierre method, of class Restoran.
     */
    @Test
    public void testSetCierre() {
        System.out.println("setCierre");
        int cierre = 0;
        rest.setCierre(cierre);
        // TODO review the generated test code and remove the default call to fail.
        if(cierre != rest.getCierre()){
            fail("Error en la prueba");
        } 
    }

    /**
     * Test of getComida method, of class Restoran.
     */
    @Test
    public void testGetComida() {
        System.out.println("getComida");
        String expResult = "comida";
        String result = rest.getComida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("Error en la prueba");
        }
    }

    /**
     * Test of setComida method, of class Restoran.
     */
    @Test
    public void testSetComida() {
        System.out.println("setComida");
        String comida = "";
        rest.setComida(comida);
        // TODO review the generated test code and remove the default call to fail.
        if(!rest.getComida().equals(comida)){
            fail("Error en la prueba");
        }
    }

    

    

   
    
}
