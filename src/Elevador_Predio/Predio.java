/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elevador_Predio;

import java.util.ArrayList;

/**
 *
 * @author kimsc
 */
public class Predio {

    int andares =15;
    ArrayList<Elevador> Elevadores;

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public ArrayList<Elevador> getElevadores() {
        return Elevadores;
    }

    public void setElevadores(ArrayList<Elevador> Elevadores) {
        this.Elevadores = Elevadores;
    }

    public void addElevadorLista(Elevador e){
    Elevadores.add(e);
    }
        
    public Predio(int totalAndares) {
        this.andares = totalAndares;
        Elevadores = new ArrayList();
    }

    public void addElevador(int andares, int capacidade) {
        Elevador e = new Elevador(andares, capacidade);
        Elevadores.add(e);
    }

    public Elevador elevadorMaisProximo(int andar) {
        Elevador e = Elevadores.get(0);
        for (Elevador elev : Elevadores) {
            if (elev.getDistancia(andar) < e.getDistancia(andar)) {
                e = elev;
            }
        }
        return e;
    }

}
