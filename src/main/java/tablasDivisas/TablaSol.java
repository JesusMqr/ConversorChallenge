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
public class TablaSol  extends TablaDivisa {
    HashMap<String,Double> tablaSol = new HashMap<>();
    
    public TablaSol() {
    tablaSol.put("Dolar",3.57);
    tablaSol.put("Euro", 4.01);
    tablaSol.put("Libra Esterlina",4.67);
    tablaSol.put("Yen Japones",0.026);
    tablaSol.put("Won Sur-Coreano", 0.0028);
    tablaSol.put("Sol", 1.0);
    
    
    }
    @Override
    public double GetValue(String moneda){
        double valor = 0.0;
        if (tablaSol.containsKey(moneda)) {
            valor = tablaSol.get(moneda);
        }
        return valor;
    }
    /*
    public static void main(String[] args) {
        TablaSol table = new TablaSol();
        
        System.out.println(table.GetValue("Dolar"));
    }
*/
    
    
    
   


}
    
  
    




