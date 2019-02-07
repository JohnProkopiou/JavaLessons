/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author johnp
 */
public class SetImplementationIterator2 {

    public static void main(String[] args) {
        Set <Integer> scores = new TreeSet<Integer>();
        scores.add(94);
        scores.add(38); //Kim
        scores.add(87);
        scores.add(43); //Marty
        scores.add(72);
        Iterator<Integer> itr = scores.iterator();
        while (itr.hasNext()) {
            int score = itr.next();
            System.out.println("The score is " +score);
        // eliminate any failing grades
        if (score<60) {
            itr.remove();
        }
        }
        System.out.println(scores); //[72,87,94]
        }
}
