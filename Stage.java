/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.exercise4;

/**
 *
 * @author johnp
 */
public class Stage {
    
    //What really is actor ref?
    private Actor actor = new HappyActor();
    
    public void change(){
        actor = new SadActor();
    }
    
    public void performPlay(){
        actor.act();
    }
    
}
