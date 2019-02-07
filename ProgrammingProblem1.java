/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

/**
 *
 * @author johnp
 */
public class ProgrammingProblem1 {
    public static void main (String[] args) {
       for (int i=2;i<2500;i++) {
            if ((isPrimeBruteForce(i)|(i%3==0|i%8==0))&(!(i%3==0&i%8==0))) {
            System.out.println(i);
            }
       }
    }
   public static boolean isPrimeBruteForce(int number) {
    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
} 
}
