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
public class SwitchStatement {
    public static void main (String args[]) {
        // char grade =args[0].charAt(0);
        char grade = 'C';
        switch(grade) {
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
                break;
            case 'E' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is "+grade);
    }
    
}
