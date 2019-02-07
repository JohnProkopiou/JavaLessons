/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author johnp
 */
import java.util.Scanner;

public class EqualVsToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String aName = "Carmen";
        String anotherName;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name > ");
        anotherName = input.nextLine();
        if (aName.equals(anotherName))
            System.out.println(aName+" equals "+anotherName);
        else 
            System.out.println(aName+" does not equal "+anotherName);
        }
    
}
