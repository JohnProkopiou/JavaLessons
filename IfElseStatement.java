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
public class IfElseStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 30;
        
        if (x == 10) {
            System.out.println("Value of x is 10");
        } else if (x == 20) {
            System.out.println("Value of x is 20");
        } else if (x == 30) {
            System.out.println("Value of x is 30");
        } else {
            System.out.println("This is else statement");
        }
    }
    
}
