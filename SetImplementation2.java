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
public class SetImplementation2 {
    public static void main (String [] args) {
        Set <Double> grades = new HashSet<Double>();
        grades.add( 2.0);
        grades.add(10.0);
        grades.add(9.0);
        for (double grade:grades) {
            System.out.println("Student's grade: " +grade);
        }
    } 
}
