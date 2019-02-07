/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifSwitch;

/**
 *
 * @author johnp
 */
public class NestedIfStatement {
    public static void main (String args[]) {
        int x = 30;
        int y = 10;
        if (x == 30) {
            if (y == 10) {
                System.out.println("X = 30 and Y = 10");
            }
            else 
                System.out.println("y!=10");
        }
    }
    
}
