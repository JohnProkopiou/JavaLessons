/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author johnp
 */
public class MySimpleMath {

    /**
     * @param args the command line arguments
     */
   // A simple method that takes input and returns "positive" or "negative" depending on the input number
    
    public String checkSign(int number) {
        if (number >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }
    
    public static void main(String args []) {
        MySimpleMath sm = new MySimpleMath();
        // Check a positive
        System.out.println("Input 10: " + sm.checkSign(10));
        // Check a negative
        System.out.println("Input -2: " + sm.checkSign(-2));
        // Check a positive
        System.out.println("Input 0: " + sm.checkSign(0));
    }
    
}
