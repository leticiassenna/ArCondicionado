/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.arcondicionado.model;

import java.util.Observable;

/**
 *
 * @author 20111BSI0161
 */
public class Sensormeter extends Observable{
    private int currentNumPessoas = 0;
    private int codSensor;
    
    public void setCurrentPessoas(int numPessoas, int codSensor){
        this.currentNumPessoas = numPessoas;
        this.codSensor = codSensor;
        setChanged();
        notifyObservers();
    }
    
    public int getCurrentNumPessoas(){
        return currentNumPessoas;
    }
    
    public int getCodSensor(){
        return codSensor;
    }
}
