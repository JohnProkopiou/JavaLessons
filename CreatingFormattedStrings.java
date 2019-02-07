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
public class CreatingFormattedStrings {
    public static void main(String [] args) {
        System.out.printf("The value of the float variable is " +"%f, while the value of the integer "+"variable is %d, and the string "+"is %s", 2.2, 2, "2");
        String fs;
        fs = String.format("The value of the float variable is " + "%f, while the value of the integer " +"varialbe is %d, and the string "+"is %s", 2.3,3,"4");
        System.out.println(fs);
    }
}
