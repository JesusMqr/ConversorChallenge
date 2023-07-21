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
public class TablaDecametro  extends TablaTemperatura{
    HashMap<String,Double>tablaDecametro = new HashMap<>();
    
    public TablaDecametro(){
        tablaDecametro.put("mm",    10000.0);
        tablaDecametro.put("cm",    1000.0);
        tablaDecametro.put("dm",    100.0);
        tablaDecametro.put("m",     10.0);
        tablaDecametro.put("Dam",   1.0);
        tablaDecametro.put("Hm",    0.1);
        tablaDecametro.put("Km",    0.01);
        
    }
    @Override
    public double GetValue(String medida){
        double valor = 0.0;
        if(tablaDecametro.containsKey(medida)){
            valor = tablaDecametro.get(medida);
        }
        return valor;
    }
    
        
   
    
}
