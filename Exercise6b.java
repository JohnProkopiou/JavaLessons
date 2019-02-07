/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;


/**
 *
 * @author johnp
 */
public class Exercise6b {
    public static void main(String [] args) {
        switch (Integer.parseInt(args[0])) {
            case 7:
                System.out.println("Hello");
                break;
            case 10:
                System.out.println("Hi");
                break;
            case 444:  
                System.out.println("Good");
                break;
            default:
                System.out.println("No Match Found");
                break;
        }
        }
    }
    

