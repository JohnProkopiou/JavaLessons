/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author johnp
 */
public class ClassPracticeExercise {
    public static void main (String [] args){
        String [] values = {"cat","dog","pig","bear","bird","parrot","rabbit"};
    
        // Loop over all Strings
        for (String value: values) {
            
            //Skip Strings starting with letter p
            if (value.startsWith("p")) {
                continue;
            }
        
            System.out.println(value);
        }
    }
    
}
