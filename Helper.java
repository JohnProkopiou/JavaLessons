/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

/**
 *
 * @author johnp
 */
public class Helper {

    static int[] swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        int []myArray={a,b};
        return myArray;
    }
    
    
}
