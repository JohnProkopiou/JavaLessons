package loops;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author johnp
 */
public class ForLoop {
    public static void main (String args []) {
        for (int x = 10; x < 20; x = x + 1) {
            System.out.print("value of x : " + x);
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("\n");
        for (double x = 10; x < 20; x = x + 1.5) {
            System.out.print("value of x : " + x);
            System.out.print("\n");
        }
    }
    
}
