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
public class TablaMetro  extends TablaTemperatura{
    HashMap<String,Double>tablaMetro = new HashMap<>();
    
    public TablaMetro(){
        tablaMetro.put("mm",    1000.0);
        tablaMetro.put("cm",    100.0);
        tablaMetro.put("dm",    10.0);
        tablaMetro.put("m",     1.0);
        tablaMetro.put("Dam",   0.1);
        tablaMetro.put("Hm",    0.01);
        tablaMetro.put("Km",    0.001);
        
    }
    @Override
    public double GetValue(String medida){
        double valor = 0.0;
        if(tablaMetro.containsKey(medida)){
            valor = tablaMetro.get(medida);
        }
        return valor;
    }
    
    
    
        
   
    
}
