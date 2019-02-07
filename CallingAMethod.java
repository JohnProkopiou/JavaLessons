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
public class CallingAMethod {
    public static void main(String [] args) {
        int a = 11;
        int b = 6;
        int c = minFunction(a,b);
        System.out.println("Minimum value = "+c);
        maxFunction(a,b);
    }
    
    /** returns the minimum of two numbers
     * @param n1
     * @param n2
     * @return  */
    public static int minFunction(int n1, int n2){
        int min;
        if (n1>n2) {
            min = n2;
        }else 
            min = n1;
        return min;
    }
    /** prints the maximum of two numbers */
    public static void maxFunction(int n1, int n2) {
        int max;
        if (n1<n2)
            max=n2;
        else
            max=n1;
    
        System.out.println("Maximum Value = "+max);
    }
}
