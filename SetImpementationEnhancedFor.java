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
public class SetImpementationEnhancedFor {

    public static void main(String[] args) {
        Set<Integer> scores = new HashSet<Integer>();
        scores.add(1);
        scores.add(2);
        scores.add(99);
        for (int score : scores) {
            System.out.println("The score is " + score);
        }
        for (int score:scores) {
            if (score<60) {
                //throws a CuncurrentModifierEception
                scores.remove(score);
            }}
    }

}
