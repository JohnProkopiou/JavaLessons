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
public class StringBuilderTest {
    public static void main(String [] args) {
        String s = "This is an example";
        StringBuilder sb = new StringBuilder();
    
        for (int i=s.length()-1;i>=0;i--) {
            sb.append(s.charAt(i));
        }
        String out = sb.toString();
        System.out.println(out); //elpmaxe na si sihT
       
        
    }
    
}
