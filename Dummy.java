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
public class Dummy {
    public void dummy(){}
    public void dummy(String message) {}
    public void dummy(String message, int number){}
    public void dummy(int number) {}
    public void dummy(int number, String message) {}
    public void dummy(float number) {}
    public void dummy(String message, double d) {}
    private void dummy(int[] array) {}
    public static void dummy(double real) {}
    public final void dummy(float f1, float f2) {}
    
}
