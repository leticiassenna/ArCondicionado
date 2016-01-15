/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.arcondicionado.app;

import br.ifes.arcondicionado.control.ArCondicionado;
import br.ifes.arcondicionado.control.SensorMonitor;
import br.ifes.arcondicionado.model.Sensormeter;

/**
 *
 * @author 20111BSI0161
 */
public class App {
    public static void main(String[] args){
        SensorMonitor monitor = new SensorMonitor();
        
        Sensormeter sensor = new Sensormeter();
        ArCondicionado arCondicionado = new ArCondicionado();
                
        sensor.addObserver(arCondicionado);
        sensor.addObserver(monitor);
        sensor.setSensor1(2);
        sensor.setSensor2(5);
        sensor.setSensor3(7);
        sensor.setCurrentPessoas();
        
        sensor.setSensor1(0);
        sensor.setSensor2(0);
        sensor.setSensor3(0);
        sensor.setCurrentPessoas();

        
    }
}
