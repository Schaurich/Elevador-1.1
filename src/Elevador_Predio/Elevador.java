/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elevador_Predio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kimsc
 */
public class Elevador {

    private int andarAtual;
    private int capacidade;
    private int numPessoas;
    private int andares;
    private int rota; // 1 descendo / 2 subindo
    private ArrayList<Integer> comandos;

    public Elevador(int andares, int capacidade) {
        this.andares = andares;
        this.capacidade = capacidade;
        this.numPessoas = 0;
        this.andarAtual = 0;
        this.rota = 2;
        this.comandos = new ArrayList<Integer>();
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public int getRota() {
        return rota;
    }

    public void setRota(int rota) {
        this.rota = rota;
    }

    public ArrayList getComandos() {
        return comandos;
    }

    public void setComandos(ArrayList comandos) {
        this.comandos = comandos;
    }

    public boolean entrar(int pessoas) {
        int total = getNumPessoas() + pessoas;
        if (getCapacidade() >= total) {
            numPessoas += pessoas;
            return true;
        }
        return false;
    }

    public boolean sair(int pessoas) {
        int total = getNumPessoas() - pessoas;
        if (total >= 0) {
            numPessoas -= pessoas;
            return true;
        }
        return false;
    }

    public int getDistancia(int andar) {
        int distancia = Math.abs(getAndarAtual() - andar);
        return distancia;
    }

    public void subir(int andar) {
        int pos = comandos.indexOf(andar);
        comandos.remove(pos);
        setAndarAtual(andar);
    }

    public void descer(int andar) {
        int pos = comandos.indexOf(andar);
        comandos.remove(pos);
        setAndarAtual(andar);
    }

    public void selecionarAndar(int andar) {
        comandos.add(andar);
    }

    public void abrePorta(int in, int out) {
        sair(out);
        entrar(in);
    }

    public void deslocar(int in, int out, int andar) {
        abrePorta(in,out);
        selecionarAndar(andar);
        if(getAndarAtual()<andar){
        subir(andar);
        }else{
        descer(andar);
        }
        
        
    }

    public void organizaComandos() {
        Collections.sort(comandos);
    }

    /*public int proximoAndar() {
        int next = 0;
        organizaComandos();
        if (rota == 2) {
            for (Integer i : comandos) {
                if (i > this.getAndarAtual()) {
                    next = i;
                }
                break;
            }
            return next;
        } else {
            if (rota == 1) {
                for (Integer i : comandos) {
                    if (i < this.getAndarAtual()) {
                        next = i;
                    }
                    break;
                }
                return next;
            }

        }
        return next;
    }*/
}
