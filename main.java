/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

/**
 *
 * @author johnp
 */
public class main {

    public static void printFirstValues(int[] firstValues) {
        System.out.println(firstValues[0] + " a1");
        System.out.println(firstValues[1] + " b1");
        System.out.println(firstValues[2] + " a2");
        System.out.println(firstValues[3] + " b2");
    }

    public static void printLastValues(int[] lastValues) {
        System.out.println(lastValues[0] + " a1");
        System.out.println(lastValues[1] + " b1");
        System.out.println(lastValues[2] + " a2");
        System.out.println(lastValues[3] + " b2");
    }

    public static void main(String[] args) {
        int a1 = 2;
        int a2 = 4;
        myClass object = new myClass();
        object.setHeight(180);
        int b1 = object.getHeight();
        object.setWeight(80);
        int b2 = object.getWeight();
        int[] firstValues = {a1, b1, a2, b2};
        printFirstValues(firstValues);
        int myArray1[] = Helper.swap(a1, b1);
        int myArray2[] = Helper.swap(a2, b2);
        int [] lastValues = {myArray1[0],myArray1[1],myArray2[0],myArray2[1]};
        printLastValues(lastValues);
    }

}
