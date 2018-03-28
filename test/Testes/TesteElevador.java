/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Elevador_Predio.Elevador;
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
public class TesteElevador {
    private Elevador e;
    public TesteElevador() {
    }
    
     @Test
    public void testeConstrutor() {
       e = new Elevador(8,15);
       assertEquals(e.getAndarAtual(),0);
       assertEquals(e.getAndares(),8);
       assertEquals(e.getCapacidade(),15);
       assertEquals(e.getNumPessoas(),0);
       assertEquals(e.getRota(),2);
    }
    
    
    @Test
    public void testeEntrar(){
    e = new Elevador(8,15);
    assertEquals(e.entrar(10),true);
    }
    
     @Test
    public void testeEntrarFalse(){
    e = new Elevador(8,15);
    assertEquals(e.entrar(16),false);
    }
    
    @Test
    public void testeSairFalse(){
    e = new Elevador(8,15);
    assertEquals(e.sair(16),false);
    }
    
    @Test
    public void testeSair(){
    e = new Elevador(8,15);
    e.entrar(5);
    assertEquals(e.sair(4),true);
    }
    
     @Test
    public void testeSelecionaAndar(){
    e = new Elevador(8,15);
    e.selecionarAndar(2);
    assertEquals(e.getComandos().size(),1);
    
    }
    @Test
    public void testeSubir(){
    e = new Elevador(8,15);
    e.selecionarAndar(2);
    e.subir(2);
    assertEquals(e.getAndarAtual(),2);
    }
    
    @Test
    public void testeDescer(){
    e = new Elevador(8,15);
    e.selecionarAndar(2);
    e.selecionarAndar(4);
    e.subir(4);
    e.descer(2);
    assertEquals(e.getAndarAtual(),2);
    }
    
    @Test
    public void testeAbrirPorta(){
      e = new Elevador(8,15);
      e.entrar(5);
      e.abrePorta(5, 2);
      assertEquals(e.getNumPessoas(),8);
    }
    
    @Test
    public void testeDeslocar(){
      e = new Elevador(8,15);
      e.entrar(10);
      e.deslocar(2, 5, 5);
      assertEquals(e.getAndarAtual(),5);
      assertEquals(e.getNumPessoas(),7);
    
    }
   
   

}
