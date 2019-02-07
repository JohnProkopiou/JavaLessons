/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author johnp
 */
class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}
class Dog extends Animal {
    @Override
    public void move(){
        super.move(); // invokes the super class method
        System.out.println("Dog can walk and run");
    }
}

public class TestDog {
    public static void main(String [] args) {
        Animal b = new Dog(); //Animal reference but Dog object
        b.move(); //runs the method in Dog class
    }
}
