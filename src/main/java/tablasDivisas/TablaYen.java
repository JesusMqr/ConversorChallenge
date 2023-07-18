/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablasDivisas;

import java.util.HashMap;

/**
 *
 * @author Jesus
 */
public class TablaYen  extends TablaDivisa {
    HashMap<String,Double> tablaYen = new HashMap<>();
    
    public TablaYen() {
    tablaYen.put("Sol",39.06);
    tablaYen.put("Euro", 156.09);
    tablaYen.put("Libra Esterlina",181.57);
    tablaYen.put("Dolar",138.87);
    tablaYen.put("Won Sur-Coreano", 0.11);
    tablaYen.put("Yen Japones", 1.0);
    
    
    }
    @Override
    public double GetValue(String moneda){
        double valor = 0.0;
        if (tablaYen.containsKey(moneda)) {
            valor = tablaYen.get(moneda);
        }
        return valor;
    }
    
    
    
   


}
    
  
    




