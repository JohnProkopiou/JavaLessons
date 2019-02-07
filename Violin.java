/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author johnp
 */
public class Violin implements MusicalInstrument {
    
    @Override
    public void playNote() {
        System.out.println("Violin plays a note");
    }
    
    @Override
    public void outputSound() {
        System.out.println("Violin says xxxxx");
    }
    
}
