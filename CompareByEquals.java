/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author johnp
 */
public class CompareByEquals {
    public static void main (String [] args) {
        String Str1 = new String("This is really not immutable");
        String Str2 = Str1;
        String Str3 = new String("This is really not immutable");
        boolean retVal;
    
        retVal = Str1.equals(Str2);
        System.out.println("Returned value = " +retVal);
    
        retVal = Str1.equals(Str3);
        System.out.println("Returned value = " +retVal);
    }
    
}
