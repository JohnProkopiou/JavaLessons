/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisGettersSetters;

/**
 *
 * @author johnp
 */
public class Book {
    private String name;
    private Person author;
    
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setAuthor(Person author) {
        this.author = author;
    }
    
}
