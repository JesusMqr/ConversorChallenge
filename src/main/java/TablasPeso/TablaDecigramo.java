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
public class TablaDecigramo extends TablaPeso {
    
    HashMap<String,Double> tablaDecigramo = new HashMap<>();
    
    public TablaDecigramo(){
        tablaDecigramo.put("mg",    100.0);
        tablaDecigramo.put("cg",    10.0 );
        tablaDecigramo.put("dg",    1.0 );
        tablaDecigramo.put("g",     0.1);
        tablaDecigramo.put("Dag",   0.01);
        tablaDecigramo.put("Hg",    0.001);
        tablaDecigramo.put("Kg",    0.0001);
        tablaDecigramo.put("T",     0.00001);
    }
    
    @Override
    public double GetValue(String peso){
        double value = 0.0;
        if (tablaDecigramo.containsKey(peso)){
            value = tablaDecigramo.get(peso);
        }
        return value;
    }
}
