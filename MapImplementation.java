/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author johnp
 */
public class MapImplementation {
    public static void main (String [] args) {
        Map <String,Integer> ages = new TreeMap<String,Integer>();
        ages.put("Mary",19);
        ages.put("Geneva", 2);
        ages.put("Vicki",57);
        for (String name : ages.keySet()) {
            int age = ages.get(name);
            System.out.println(name + " -> " + age);
        }
    }
    
}
