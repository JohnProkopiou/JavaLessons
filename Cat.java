/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author johnp
 */
public class Cat extends Animal {
    String breed;
    public Cat(String breed) {
        super("Cat",0);
        this.breed=breed;
    }
    @Override
    public String voice() {
        return "meow, I'm "+this.breed;
    }
}
