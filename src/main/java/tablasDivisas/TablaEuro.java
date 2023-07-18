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
public class TablaEuro  extends TablaDivisa {
    HashMap<String,Double> tablaEuro = new HashMap<>();
    
    public TablaEuro() {
    tablaEuro.put("Sol",0.25);
    tablaEuro.put("Dolar", 0.89);
    tablaEuro.put("Euro", 1.0);
    tablaEuro.put("Libra Esterlina",1.16);
    tablaEuro.put("Yen Japones",0.0064);
    tablaEuro.put("Won Sur-Coreano", 0.00070);
    
    
    }
    public double GetValue(String moneda){
        double valor = 0.0;
        if (tablaEuro.containsKey(moneda)) {
            valor = tablaEuro.get(moneda);
        }
        return valor;
    }
    
    
    
   


}
    
  
    




