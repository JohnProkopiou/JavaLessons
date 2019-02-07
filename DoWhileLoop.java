package loops;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author johnp
 */
public class DoWhileLoop {
    public static void main (String [] args) {
        int x = 10;
        
        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.println("");
        }while(x < 20);
    }
    
}
