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
import java.util.Random;
public class Exercise4b {
    public static void main(String [] args) {
        
        int array[]= new int[11];
        Random rand = new Random();
        for (int i=0;i<11;i++){
            array[i]= rand.nextInt(100);
            System.out.println(array[i]);
        }
    }
}
