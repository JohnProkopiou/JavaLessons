/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johnp
 */
public class ReadFromKeyboard {
    public static void main(String [] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = in.readLine();
            System.out.println("Your input is: "+name);
        } catch (IOException ex) {
            Logger.getLogger(ReadFromKeyboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Your input is : "+x);
        
    }
    
}
