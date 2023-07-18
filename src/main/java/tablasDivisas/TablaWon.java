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
public class TablaWon  extends TablaDivisa {
    HashMap<String,Double> tablaWon = new HashMap<>();
    
    public TablaWon() {
    tablaWon.put("Sol",355.75);
    tablaWon.put("Euro", 1421.56);
    tablaWon.put("Libra Esterlina",1653.42);
    tablaWon.put("Yen Japones",9.11);
    tablaWon.put("Dolar", 1264.65);
    tablaWon.put("Won Sur-Coreano", 1.0);
    
    
    }
    @Override
    public double GetValue(String moneda){
        double valor = 0.0;
        if (tablaWon.containsKey(moneda)) {
            valor = tablaWon.get(moneda);
        }
        return valor;
    }
    
    
    
   


}
    
  
    




