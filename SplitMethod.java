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
public class SplitMethod {
    public static void main(String [] args) {
        String listOfAnimals = "Dog,Cat,Donkey";
        String [] animals = listOfAnimals.split(",");
        System.out.println("Available animals are: ");
        for (String animal: animals) {
            System.out.println(animal);
        }
    }
    
}
