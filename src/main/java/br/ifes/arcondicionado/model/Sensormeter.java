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
    private int currentNumPessoasSensor1 = 0;
    private int currentNumPessoasSensor2 = 0;
    private int currentNumPessoasSensor3 = 0;
    
    public void setCurrentPessoas(){
        calculaMediaPessoa();
        
        setChanged();
        notifyObservers();
    }
    
    public int calculaMediaPessoa(){
        this.currentNumPessoas = (currentNumPessoasSensor1 + currentNumPessoasSensor2 + currentNumPessoasSensor3)/3;
        if(currentNumPessoas<=0){
            return 0;
        }
        else{
            return currentNumPessoas;
        }
    }
    
    public int getCurrentNumPessoas(){
        return currentNumPessoas;
    }
    
    public void setSensor1(int pessoas){
        this.currentNumPessoasSensor1 = pessoas;
    }
    
    public void setSensor2(int pessoas){
        this.currentNumPessoasSensor2 = pessoas;
    }
    
    public void setSensor3(int pessoas){
        this.currentNumPessoasSensor3 = pessoas;
    }
}
