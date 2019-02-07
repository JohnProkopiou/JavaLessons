/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writers;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johnp
 */
public class BinaryFile {
    public static void main(String [] args) throws IOException {
        try {
            FileOutputStream fstream = new FileOutputStream("MyInfo.dat");
            DataOutputStream outputFile = new DataOutputStream(fstream);
            outputFile.writeInt(10);
            outputFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
