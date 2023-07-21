/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablasTemperatura;

import java.util.HashMap;

/**
 *
 * @author Jesus
 */
public class TablaCelsius extends TablaTemperatura {
    
    HashMap<String,Double> tablaCelsius = new HashMap<>();
    
    public TablaCelsius(){
        tablaCelsius.put("Fahrenheitt", 33.8);
        tablaCelsius.put("Celsius",1.0);
        tablaCelsius.put("Kelvin", 247.15);
    }
    @Override
    public double GetValue(String temperatura){
        double valor = 0.0;
        if(tablaCelsius.containsKey(temperatura)){
            valor = tablaCelsius.get(temperatura);
        }
            
        return valor;
    }
}
