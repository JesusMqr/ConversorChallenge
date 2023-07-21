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
public class TablaDecimetro extends TablaMedida {
    HashMap<String,Double>tablaDecimetro = new HashMap<>();
    
    public TablaDecimetro(){
        tablaDecimetro.put("mm",    100.0);
        tablaDecimetro.put("cm",    10.0);
        tablaDecimetro.put("dm",    1.0);
        tablaDecimetro.put("m",     0.1);
        tablaDecimetro.put("Dam",   0.01);
        tablaDecimetro.put("Hm",    0.001);
        tablaDecimetro.put("Km",    0.0001);
        
    }
    @Override
    public double GetValue(String medida){
        double valor = 0.0;
        if(tablaDecimetro.containsKey(medida)){
            valor = tablaDecimetro.get(medida);
        }
        return valor;
    }
    
        
   
    
}
