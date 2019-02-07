/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author johnp
 */
public class Exercise2 {

    public static void main(String[] args) {
        Map<String, Bunny> mappedBunnies = new TreeMap<>();
        mappedBunnies.put("Bugs ", new Bunny(1));
        mappedBunnies.put("maskedTeemo ", new Bunny(2));
        mappedBunnies.put("easterBunny ", new Bunny(3));
        Iterator<String> itr = mappedBunnies.keySet().iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            Bunny bunnyNumber = mappedBunnies.get(name);
            System.out.print(name);
            bunnyNumber.hop();
        }
    }

}
