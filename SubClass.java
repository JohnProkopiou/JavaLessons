/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.exercise5;

/**
 *
 * @author johnp
 */
public class SubClass extends SuperClass {

    int x = 3;

    public SubClass() {
        super();
        System.out.println("inside public SubClass() constructor");
        System.out.println("-" + method(4, 2));
        x += 3;
    }

    @Override
    public int method(int x, int x2) {
        System.out.println("inside SubClass.method(int x, int x2)");
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(x2);
        System.out.println(super.x);
        return ((this.x * 2) + (x + x2 + super.x));
    }

}
