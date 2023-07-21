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
public class TablaCentimetro  extends TablaTemperatura{
    HashMap<String,Double>tablaCentimetro = new HashMap<>();
    
    public TablaCentimetro(){
        tablaCentimetro.put("mm",   10.0);
        tablaCentimetro.put("cm",   1.0);
        tablaCentimetro.put("dm",   0.1);
        tablaCentimetro.put("m",    0.01);
        tablaCentimetro.put("Dam",  0.001);
        tablaCentimetro.put("Hm",   0.0001);
        tablaCentimetro.put("Km",   0.00001);
        
    }
    @Override
    public double GetValue(String medida){
        double valor = 0.0;
        if(tablaCentimetro.containsKey(medida)){
            valor = tablaCentimetro.get(medida);
        }
        return valor;
    }
    
        
   
    
}
