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
public class TablaDolar extends TablaDivisa {
    HashMap<String,Double> tablaDolar = new HashMap<>();
    
    public TablaDolar() {
    tablaDolar.put("Sol",0.28);
    tablaDolar.put("Euro", 1.12);
    tablaDolar.put("Dolar", 1.0);
    tablaDolar.put("Libra Esterlina",1.31);
    tablaDolar.put("Yen Japones",0.0072);
    tablaDolar.put("Won Sur-Coreano", 0.00079);
    
    
    }
    @Override
    public double GetValue(String moneda){
        double valor = 0.0;
        if (tablaDolar.containsKey(moneda)) {
            valor = tablaDolar.get(moneda);
        }
        return valor;
    }
    
    
    
    
    
   


}
    
  
    




