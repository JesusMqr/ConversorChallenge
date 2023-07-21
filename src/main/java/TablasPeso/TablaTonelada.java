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
public class TablaTonelada extends TablaPeso {

    HashMap<String, Double> tablaTonelada = new HashMap<>();

    public TablaTonelada() {
        tablaTonelada.put("mg", 10000000.0);
        tablaTonelada.put("cg", 1000000.0);
        tablaTonelada.put("dg", 100000.0);
        tablaTonelada.put("g",  10000.0);
        tablaTonelada.put("Dag",1000.0);
        tablaTonelada.put("Hg", 100.0);
        tablaTonelada.put("Kg", 10.0);
        tablaTonelada.put("T",  1.0);
    }

    @Override
    public double GetValue(String peso) {
        double value = 0.0;
        if (tablaTonelada.containsKey(peso)) {
            value = tablaTonelada.get(peso);
        }
        return value;
    }
}
