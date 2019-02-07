/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author johnp
 */
public class TestAnimals {
    public static void main(String [] args) {
        Animal [] animals = new Animal[4];
        Dog dog1 = new Dog("Labrador");
        Cat cat1= new Cat("Siamese");
        Cat cat2 = new Cat("Persian");
        Dog dog2 = new Dog("Beagle");
        animals[0]=dog1;
        animals[1]=cat1;
        animals[2]= cat2;
        animals[3] = dog2;
        for (Animal animal : animals) {
            System.out.println(animal.voice());
        }
    }
    
}
