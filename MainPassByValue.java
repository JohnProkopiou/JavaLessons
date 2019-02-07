/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author johnp
 */
class Apple{
    public String colour = "red";
}
public class MainPassByValue {
    public static void main(String [] args) {
        Apple apple = new Apple();
        System.out.println(apple.colour);
    
        changeApple(apple);
        System.out.println(apple.colour);
    }
    
    public static void changeApple(Apple apple) {
        apple.colour = "green";
    }
}
