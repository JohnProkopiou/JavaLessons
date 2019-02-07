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
public class ReplaceMethod {
    public static void main(String[] args) {
        String animals = "Dog + Cat + Donkey";
        String replaced = animals.replace("+","and");
        System.out.println(animals);
        System.out.println(replaced);
        
   }
    
}
