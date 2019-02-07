/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author johnp
 */
public class ExampleClassExercise2 {
    public static void main (String [] args) {
        double[] a = {1.1,2.2,3.3};
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
        a[1]=a[2];
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
    }
    
}
