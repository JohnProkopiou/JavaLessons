/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author johnp
 */
public class ListImplementation {
    public static void main(String [] args) {
    List <String> listStrings = new ArrayList<String>();
    listStrings.add("One");
    listStrings.add("Two");
    listStrings.add("Three");
    listStrings.add("Four");
    
    List <String> listStrings2 = new LinkedList<String>();
    listStrings2.add("One");
    listStrings2.add("Two");
    listStrings2.add("Three");
    listStrings2.add("Four");
    }
}
