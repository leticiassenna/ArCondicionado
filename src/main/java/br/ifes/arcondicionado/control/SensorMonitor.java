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
public class SensorMonitor implements Observer{
    
    public int TEMP_TO_ALERT = 25;
    
    @Override
    public void update(Observable observable, Object arg){
        
        Sensormeter sensor = (Sensormeter) observable;
        this.TEMP_TO_ALERT = + sensor.getCurrentNumPessoas();
        
        if (sensor.getCurrentNumPessoas() > 0){
            System.out.println("ALERT - Temperatura subindo");
            this.TEMP_TO_ALERT = - sensor.getCurrentNumPessoas();
        }
        else{
            System.out.println("Fresquinho");
        }
        
    }
    
}
