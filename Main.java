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
public class Main {
    public static void main(String[] args) {
        System.out.println("first line of main()");
        SuperClass superClass = new SubClass();
        System.out.println("After creating superClass");
        SuperClass superClass1 = new SuperClass();
        System.out.println("After creating superClass1");
        SubClass subClass2 = new SubClass();
        System.out.println("After creating subClass2");
    }
    
}
