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
public class TablaFahrenheitt extends TablaTemperatura {
    HashMap<String,Double> tablaFahrenheitt = new HashMap<>();
    
    public TablaFahrenheitt(){
        tablaFahrenheitt.put("Fahrenheitt", 1.0);
        tablaFahrenheitt.put("Celsius",-17.2222);
        tablaFahrenheitt.put("Kelvin", 255.9278);
    }
    @Override
    public double GetValue(String temperatura){
        double valor = 0.0;
        if(tablaFahrenheitt.containsKey(temperatura)){
            valor = tablaFahrenheitt.get(temperatura);
        }
            
        return valor;
    }
}
