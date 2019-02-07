/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClasses;

/**
 *
 * @author johnp
 */
public abstract class Animal {

    private String name;

    public abstract void speak();

    public String getName() {
        return name;
    }

    public void setName(String animalName) {

        name = animalName;
    }
}
