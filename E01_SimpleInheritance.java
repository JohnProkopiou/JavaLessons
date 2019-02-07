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
class A{
    public A() {
        System.out.println("A()");
    }
}

class B{
    public B() {
        System.out.println("B()");
    }
}

class C extends A{
    B b = new B();
}

public class E01_SimpleInheritance {
    public static void main(String [] args) {
        new C();
    }
}
