/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johnp
 */
public class Exercise3 {

    static String line = null;

    public static void main(String[] args) {
        String line = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Earth.txt"));
            printFile(bufferedReader);
            closeBufferedReader(bufferedReader);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exercise3.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public static void closeBufferedReader(BufferedReader bufferedReader) {
        try {
            bufferedReader.close();
        } catch (IOException ex) {
            Logger.getLogger(Exercise3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void printFile(BufferedReader bufferedReader) {
        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(Exercise3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
