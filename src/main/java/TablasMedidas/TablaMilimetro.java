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
public class TablaMilimetro   extends TablaTemperatura{
    HashMap<String,Double>tablaMilimetro = new HashMap<>();
    
    public TablaMilimetro(){
        tablaMilimetro.put("mm",    1.0);
        tablaMilimetro.put("cm",    0.1);
        tablaMilimetro.put("dm",    0.01);
        tablaMilimetro.put("m",     0.001);
        tablaMilimetro.put("Dam",   0.0001);
        tablaMilimetro.put("Hm",    0.00001);
        tablaMilimetro.put("Km",    0.0000001);
        
    }

    @Override
    public double GetValue(String medida){
        double valor = 0.0;
        if(tablaMilimetro.containsKey(medida)){
            valor = tablaMilimetro.get(medida);
        }
        return valor;
    }
    
        
   
    
}
