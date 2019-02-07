/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author johnp
 */
public class LinkedListMethods {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addLast("Harry");
        list.addFirst("Sally");
        list.getFirst();
        list.getLast();
        String removed = list.removeFirst();
        ListIterator<String> iter = list.listIterator();
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
