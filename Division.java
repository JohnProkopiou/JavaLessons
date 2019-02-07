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
public abstract class Division {
    private String name;
    private int accountNumber;
    
    public Division(String name, int accountNumber) {
        this.name=name;
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public abstract void display();
    
}
