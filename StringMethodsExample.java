/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author johnp
 */
public class StringMethodsExample {

    public static String connectStrings(String s) {
        s = "Strings are immutable";
        s = s.concat(" all the time");// equal to s = s +"all the time"}
        System.out.println(s);
        return s;
    }

    public static void spellString(String s) {
        for (String retval : s.split(" ")) {
            System.out.println(retval);
        }
    }

    public static void splitToTwo(String s) {
        String str2 = new String("Welcome-to-java-tutorial");
        System.out.println("\nSplit to two pieces :");
        for (String retval : str2.split("-", 2)) {
            System.out.print(retval + "     ");
        }
    }

    public static void splitToThree(String s) {
        System.out.println("\n\nSplit to three pieces :");
        for (String retval : s.split("-", 3)) {
            System.out.print(retval + "     ");
        }
    }

    public static void main(String[] args) {
        String s = connectStrings("Strings are immutable");
        System.out.println("Length:" + s.length());
        spellString(s);
        String str2 = new String("Welcome-to-java-tutorial");
        splitToTwo(str2);
        splitToThree(str2);
        System.out.println("\n\nSplit:");
        for (String retval : str2.split("-", 0)) {
            System.out.print(retval + "        ");
        }
        System.out.println(str2.substring(1, 10));
    }

}
