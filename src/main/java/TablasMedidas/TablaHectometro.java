/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablasMedidas;

import java.util.HashMap;

/**
 *
 * @author Jesus
 */
public class TablaHectometro  extends TablaTemperatura{
    HashMap<String,Double>tablaHectometro = new HashMap<>();
    
    public TablaHectometro(){
        tablaHectometro.put("mm",   100000.0);
        tablaHectometro.put("cm",   10000.0);
        tablaHectometro.put("dm",   1000.0);
        tablaHectometro.put("m",    100.0);
        tablaHectometro.put("Dam",  10.0);
        tablaHectometro.put("Hm",   1.0);
        tablaHectometro.put("Km",   0.1);
        
    }
    @Override
    public double GetValue(String medida){
        double valor = 0.0;
        if(tablaHectometro.containsKey(medida)){
            valor = tablaHectometro.get(medida);
        }
        return valor;
    }
    
        
   
    
}
