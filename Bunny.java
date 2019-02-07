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
public class Bunny {
    private int bunnyNumber;

    public void setBunnyNumber(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public int getBunnyNumber() {
        return bunnyNumber;
    }
    public Bunny() {
      
    }
    public Bunny(int bunnyNumber){
        this.bunnyNumber=bunnyNumber;
    }
    public void hop(){
       int gerbilNumber=getBunnyNumber();
        System.out.println("bunny "+gerbilNumber+" is hoping");
    }
   
}
