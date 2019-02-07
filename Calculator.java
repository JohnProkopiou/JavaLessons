/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author johnp
 */
public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }
    public double add(double a, double b) {
        return a+b;
    }
    public int add(int a, int b, int c) {
        return a+b+c;
    }
    
}
