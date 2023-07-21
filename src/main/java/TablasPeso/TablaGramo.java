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
public class TablaGramo  extends TablaPeso{
    
    HashMap<String,Double> tablaGramo = new HashMap<>();
    
    public TablaGramo(){
        tablaGramo.put("mg",    1000.0 );
        tablaGramo.put("cg",    100.0);
        tablaGramo.put("dg",    10.0);
        tablaGramo.put("g",     1.0 );
        tablaGramo.put("Dag",   0.1);
        tablaGramo.put("Hg",    0.10);
        tablaGramo.put("Kg",    0.100);
        tablaGramo.put("T",     0.1000);
    }
    
   @Override
    public double GetValue(String peso){
        double value = 0.0;
        if (tablaGramo.containsKey(peso)){
            value = tablaGramo.get(peso);
        }
        return value;
    }
}
