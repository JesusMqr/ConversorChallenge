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
public class TablaMiligramo  extends TablaPeso{
    
    HashMap<String,Double> tablaMiligramo = new HashMap<>();
    
    public TablaMiligramo(){
        tablaMiligramo.put("mg",    1.0 );
        tablaMiligramo.put("cg",    0.1 );
        tablaMiligramo.put("dg",    0.01 );
        tablaMiligramo.put("g",     0.001);
        tablaMiligramo.put("Dag",   0.0001);
        tablaMiligramo.put("Hg",    0.00001 );
        tablaMiligramo.put("Kg",    0.00001);
        tablaMiligramo.put("T",     0.000001);
    }
    
   @Override
    public double GetValue(String peso){
        double value = 0.0;
        if (tablaMiligramo.containsKey(peso)){
            value = tablaMiligramo.get(peso);
        }
        return value;
    }
}
