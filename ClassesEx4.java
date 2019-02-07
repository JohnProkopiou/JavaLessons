/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author johnp
 */
public class ClassesEx4 {
    
    int i;
    char c;
    private static ClassesEx4 instance = null;
    
    //Why protected constructor and not private? Remember what protected means
    // private constructor means that class cannot be subclassed
    protected ClassesEx4(){
        //We choose to print the variables in the constructor. This is'nt necessary
    }
    
    public static ClassesEx4 getInstance() {
        if (instance == null) {
            instance = new ClassesEx4();
        }
        return instance;
    }
    
    public static void main (String [] args) {
        //We call the constructor but we dont assign the new object to a reference variable
        ClassesEx4 cex4 = ClassesEx4.getInstance();
        
     
    }
    
}
