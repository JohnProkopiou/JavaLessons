/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johnp
 */
public class ScanFile {
    public static void main(String [] args) {
        File file = new File("filename.txt");
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            System.out.println(line);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScanFile.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
