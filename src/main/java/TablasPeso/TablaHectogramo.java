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
public class TablaHectogramo extends TablaPeso {
    
    HashMap<String,Double> tablaHectogramo = new HashMap<>();
    
    public TablaHectogramo(){
        tablaHectogramo.put("mg",   1000000.0 );
        tablaHectogramo.put("cg",   10000.0 );
        tablaHectogramo.put("dg",   1000.0);
        tablaHectogramo.put("g",    100.0);
        tablaHectogramo.put("Dag",  10.0);
        tablaHectogramo.put("Hg",   1.0 );
        tablaHectogramo.put("Kg",   0.1);
        tablaHectogramo.put("T",    0.01);
    }
    
    @Override
    public double GetValue(String peso){
        double value = 0.0;
        if (tablaHectogramo.containsKey(peso)){
            value = tablaHectogramo.get(peso);
        }
        return value;
    }
}
