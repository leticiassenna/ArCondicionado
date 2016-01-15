/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.arcondicionado.control;

import br.ifes.arcondicionado.model.Sensormeter;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author 20111BSI0161
 */
public class ArCondicionado implements Observer{
    @Override
    public void update(Observable obs, Object obj) {
        Sensormeter sensor = (Sensormeter) obs;
        
        if(sensor.getCurrentNumPessoas() > 0){
            System.out.println("Temperatura normalizando");
        }
        else {
            System.out.println("Nenhuma mudanca");
        }
    }
}
