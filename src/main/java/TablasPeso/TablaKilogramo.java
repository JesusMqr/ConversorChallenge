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
public class TablaKilogramo  extends TablaPeso{
    
    HashMap<String,Double> tablaKilogramo = new HashMap<>();
    
    public TablaKilogramo(){
        tablaKilogramo.put("mg",    1000000.0);
        tablaKilogramo.put("cg",    100000.0 );
        tablaKilogramo.put("dg",    10000.0);
        tablaKilogramo.put("g",     1000.0);
        tablaKilogramo.put("Dag",   100.0);
        tablaKilogramo.put("Hg",    10.0 );
        tablaKilogramo.put("Kg",    1.0 );
        tablaKilogramo.put("T",     0.1);
    }
    
    @Override
    public double GetValue(String peso){
        double value = 0.0;
        if (tablaKilogramo.containsKey(peso)){
            value = tablaKilogramo.get(peso);
        }
        return value;
    }
}
