/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//To do understand how this code works
package exercises.exercise5;

/**
 *
 * @author johnp
 */
public class SuperClass {

    protected int x = 5;

    public SuperClass() {
        this(4);
        System.out.println("inside public SuperClass() constructor");
        System.out.println("-" + method(7, 3, 2));
    }

    public SuperClass(int i) {
        System.out.println("inside public SuperClass(int i) constructor");
        System.out.println("-" + method(i, 2));
        x += 3;
    }

    public  int method(int i, int i2) {
        System.out.println("inside SuperClass.method(int i, int i2)");
        return i - i2 + x;
    }

    public  int method(int i, int i2, int i3) {
        System.out.println("inside SuperClass.method(int i, int i2, int i3)");
        return (i + i2 - i3 + x);
    }

    

    
}
