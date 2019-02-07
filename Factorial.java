/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author johnp
 */
public class Factorial {
    public static void main (String [] args) {
        long x = factorial(3);
        System.out.println(x);
    }
    public static long factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
    
}
