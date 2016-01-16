/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.arcondicionado.app;

import br.ifes.arcondicionado.control.ArCondicionado;
import br.ifes.arcondicionado.model.Sensormeter;

/**
 *
 * @author 20111BSI0161
 */
public class App {
    public static void main(String[] args){
        
        Sensormeter sensor1 = new Sensormeter();
        Sensormeter sensor2 = new Sensormeter();
        Sensormeter sensor3 = new Sensormeter();
        ArCondicionado arCondicionado = new ArCondicionado();
                
        sensor1.addObserver(arCondicionado);
        sensor1.setCurrentPessoas(2, 1);
        sensor2.addObserver(arCondicionado);
        sensor2.setCurrentPessoas(5, 2);
        sensor3.addObserver(arCondicionado);
        sensor3.setCurrentPessoas(7, 3);
        
    }
}
