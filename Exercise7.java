/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Scanner;

/**
 *
 * @author johnp
 */
public class Exercise7 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("type a word that has a substring at the beginning which has an inverse analog in the end");
        System.out.println("the substring is:");
        String str = scan.nextLine();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==str.charAt(str.length()-i-1)){
                System.out.print(str.charAt(i));
            }
        }
       
    }
}
