package Testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Elevador_Predio.Predio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kimsc
 */
public class TestePredio {
    private Predio p;
    public TestePredio() {
    }
   
    
    @Test
    public void testeConstrutor(){
    p = new Predio(15);
    assertEquals(p.getAndares(),15);
    
    }
    
      @Test
    public void testeAddElevador(){
    p = new Predio(15);
    p.addElevador(15, 10);
    assertEquals(p.getElevadores().size(),1);
    
    }
    
    
}
