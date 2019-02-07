/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author johnp
 */
public class Exercise4 {

    public static void main(String[] args) {
        Map< Integer, String> ages = new TreeMap<>();
        ages.put(19, "Mary");
        ages.put(2, "Geneva");
        ages.put(57, "Vicki");
        for (int age :ages.keySet()) {
            if (age<50) {
                String name = ages.get(age);
                System.out.println(name + " -> " + age);

            }
        }
    }
}
