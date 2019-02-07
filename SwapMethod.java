/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author johnp
 */
public class SwapMethod {
    public static void main(String [] args) {
        int a = 30;
        int b = 45;
        System.out.println("Before entering swapFunction, a = "+a+" and b = "+b);
    
        //Invoke the swap method
        swapFunction(a,b);
        System.out.println("\n");
        System.out.println("After swapping, a = "+a+" and b = "+b);
    }
    
    public static void swapFunction(int a , int b) {
        System.out.println("Before swapping(Inside swapFunction), a = "+a+" b = "+b);
    
        //Swap n1 with n2
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping(Inside swapFunction), a = "+a+" b = "+b);
    }
}
