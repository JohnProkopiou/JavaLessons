/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author johnp
 */
public class SetImplementation {
    public static void main (String [] args) {
        Set <String> names = new HashSet<String>();
        names.add("Jake");
        names.add("Robert");
        names.add("Marisa");
        names.add("Kasey");
        System.out.println(names);
    }
}
