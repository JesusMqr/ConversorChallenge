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
public class TablaKilometro  extends TablaMedida{
    HashMap<String,Double>tablaKilometro = new HashMap<>();
    
    public TablaKilometro(){
        tablaKilometro.put("mm",    1000000.0);
        tablaKilometro.put("cm",    100000.0);
        tablaKilometro.put("dm",    10000.0);
        tablaKilometro.put("m",     1000.0);
        tablaKilometro.put("Dam",   100.0);
        tablaKilometro.put("Hm",    10.0);
        tablaKilometro.put("Km",    1.0);
        
    }
    @Override
    public double GetValue(String medida){
        double valor = 0.0;
        if(tablaKilometro.containsKey(medida)){
            valor = tablaKilometro.get(medida);
        }
        return valor;
    }
    
        
   
    
}
