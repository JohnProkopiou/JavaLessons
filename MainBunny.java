/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author johnp
 */
public class MainBunny {

    public static void main(String args[]) {
        ArrayList<Bunny> bunnyArray = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            bunnyArray.add(new Bunny(i));
           
        }
        Iterator<Bunny> itr = bunnyArray.iterator();
        while (itr.hasNext()) {
            Bunny gerbilnumber=itr.next();
            gerbilnumber.hop();}
       
    }
}
