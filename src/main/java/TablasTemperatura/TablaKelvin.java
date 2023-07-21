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
public class TablaKelvin extends TablaTemperatura {
    HashMap<String,Double> tablaKelvin = new HashMap<>();
    
    public TablaKelvin(){
        tablaKelvin.put("Fahrenheitt", -457.87);
        tablaKelvin.put("Celsius",-272.15);
        tablaKelvin.put("Kelvin", 1.0);
    }
    @Override
    public double GetValue(String temperatura){
        double valor = 0.0;
        if(tablaKelvin.containsKey(temperatura)){
            valor = tablaKelvin.get(temperatura);
        }
            
        return valor;
    }
}
