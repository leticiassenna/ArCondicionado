/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.arcondicionado.control.ArCondicionado;
import br.ifes.arcondicionado.control.SensorMonitor;
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
    public void TesteArCondicionado(){
        Sensormeter sensor = new Sensormeter();
        ArCondicionado arCondicionado = new ArCondicionado();
                
        sensor.addObserver(arCondicionado);
        sensor.setSensor1(2);
        sensor.setSensor2(5);
        sensor.setSensor3(7);
        sensor.setCurrentPessoas();
        
        Assert.assertEquals("Temperatura normalizando", null);
        //int compareTo = arCondicionado.toString().compareTo("Temperatura normalizando");
        //Assert.assertEquals(2, compareTo);
    }
    
    @Test
    public void TesteSensorMonitor(){
        Sensormeter sensor = new Sensormeter();
        SensorMonitor monitor = new SensorMonitor();
                
        sensor.addObserver(monitor);
        sensor.setSensor1(2);
        sensor.setSensor2(5);
        sensor.setSensor3(7);
        sensor.setCurrentPessoas();
        
        Assert.assertEquals("ALERT - Temperatura subindo", null);
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
