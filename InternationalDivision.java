/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author johnp
 */
public class InternationalDivision extends Division {

    private String country;
    private String language;

    public InternationalDivision(String country, String language, String name, int accountNumber) {
        super(name, accountNumber);
        this.country = country;
        this.language = language;
    }

    public void display() {
        System.out.println("Hi ! I am International Division named " + super.getName() + " at country " + this.country);
    }

}
