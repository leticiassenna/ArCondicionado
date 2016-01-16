/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.arcondicionado.control.ArCondicionado;
import br.ifes.arcondicionado.model.Sensormeter;
import java.io.Console;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leticia
 */
public class TesteArCondicionado {
    
    public TesteArCondicionado() {
    
    }
    
    @Test
    public void TesteSensor(){
        Sensormeter sensor1 = new Sensormeter();
        
        sensor1.setCurrentPessoas(2, 1);
        
        Assert.assertEquals(2, sensor1.getCurrentNumPessoas());
    }
    
    @Test 
    public void TesteArCondicionado(){
        Sensormeter sensor1 = new Sensormeter();
        Sensormeter sensor2 = new Sensormeter();
        Sensormeter sensor3 = new Sensormeter();
        ArCondicionado arCondicionado = new ArCondicionado();
                
        sensor1.setCurrentPessoas(2, 1);
        sensor2.setCurrentPessoas(5, 2);
        sensor3.setCurrentPessoas(7, 3);
        
        Assert.assertEquals(4, arCondicionado.media_sensores(sensor1, sensor2, sensor3));
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
