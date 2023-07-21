/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablasPeso;

import java.util.HashMap;

/**
 *
 * @author Jesus
 */
public class TablaDecagramo extends TablaPeso {
    
    HashMap<String,Double> tablaDecagramo = new HashMap<>();
    
    public TablaDecagramo(){
        tablaDecagramo.put("mg",    10000.0 );
        tablaDecagramo.put("cg",    1000.0 );
        tablaDecagramo.put("dg",    100.0);
        tablaDecagramo.put("g",     10.0);
        tablaDecagramo.put("Dag",   1.0);
        tablaDecagramo.put("Hg",    0.1);
        tablaDecagramo.put("Kg",    0.01);
        tablaDecagramo.put("T",     0.001);
    }
    
  @Override
    public double GetValue(String peso){
        double value = 0.0;
        if (tablaDecagramo.containsKey(peso)){
            value = tablaDecagramo.get(peso);
        }
        return value;
    }
}
