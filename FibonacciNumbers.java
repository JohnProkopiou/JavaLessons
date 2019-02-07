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
public class FibonacciNumbers {
    public static void main(String [] args) {
        System.out.println("Answer = "+fibonacci(5));
    }
    public static int fibonacci(int n){
        if (n == 0|| n == 1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    
}
