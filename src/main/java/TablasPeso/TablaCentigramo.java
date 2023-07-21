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
public class TablaCentigramo extends TablaPeso{
    
    HashMap<String,Double> tablaCentigramo = new HashMap<>();
    
    public TablaCentigramo(){
        tablaCentigramo.put("mg",   10.0 );
        tablaCentigramo.put("cg",   1.0 );
        tablaCentigramo.put("dg",   0.1 );
        tablaCentigramo.put("g",    0.01 );
        tablaCentigramo.put("Dag",  0.001);
        tablaCentigramo.put("Hg",   0.0001 );
        tablaCentigramo.put("Kg",   0.00001 );
        tablaCentigramo.put("T",    0.000001 );
    }
    
    @Override
    public double GetValue(String peso){
        double value = 0.0;
        if (tablaCentigramo.containsKey(peso)){
            value = tablaCentigramo.get(peso);
        }
        return value;
    }
}
