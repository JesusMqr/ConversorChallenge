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
public class TablaLibra  extends TablaDivisa {
    HashMap<String,Double> tablaLibra = new HashMap<>();
    
    public TablaLibra() {
    tablaLibra.put("Sol",0.21);
    tablaLibra.put("Euro", 0.89);
    tablaLibra.put("Dolar",0.76);
    tablaLibra.put("Yen Japones",0.0055);
    tablaLibra.put("Won Sur-Coreano", 0.00060);
    tablaLibra.put("Libra Esterlina", 1.0);
    
    
    }
    @Override
    public double GetValue(String moneda){
        double valor = 0.0;
        if (tablaLibra.containsKey(moneda)) {
            valor = tablaLibra.get(moneda);
        }
        return valor;
    }
    
    
    
   


}
    
  
    




