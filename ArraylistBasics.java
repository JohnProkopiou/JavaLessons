/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;

/**
 *
 * @author johnp
 */
public class ArraylistBasics {

    public static ArrayList arrayfiller() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ann");
        names.add("Cindy");
        System.out.println(names);
        names.add(1, "Bob");
        names.remove(0);
        names.set(0, "Bill");
        return names;
    }

    public static void main(String args[]) {

        ArrayList<String> names = arrayfiller();
        for (int i = 0; i <= 1; i++) {
            String name = names.get(i);
            System.out.println(name);
            String last = names.get(names.size() - 1);
            System.out.println(last);
        }
        squaring();
        befriending(names);
        ArrayList <String> newNames = new ArrayList<String>(names);
        

    }

    public static ArrayList squaring() {
        ArrayList<Integer> squares = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            squares.add(i * i);
        }
        return squares;
    }

    public static ArrayList befriending(ArrayList names) {
        ArrayList<String> friends = names;
        friends.add("Harry");
        return friends;
    }

}
