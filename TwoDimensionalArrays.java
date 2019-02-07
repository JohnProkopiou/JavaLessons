/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author johnp
 */
public class TwoDimensionalArrays {

    public static void main(String[] args) {
        int[][] twoDArrayCounts;
        twoDArrayCounts = createTwoDArray();
        applyMethods(twoDArrayCounts);

    }

    public static void firstMethodTwoShow2DArray(int[][] twoDArrayCounts) {
        for (int[] count : twoDArrayCounts) {
            for (int col = 0; col < twoDArrayCounts[0].length; col++) {
                System.out.printf(count[col] + "\t");
            }
            System.out.println();
        }

    }

    public static void secondMethodTwoShow2DArray(int[][] twoDArrayCounts) {
        for (int row = 0; row < twoDArrayCounts.length; row++) {
            for (int col = 0; col < twoDArrayCounts[0].length; col++) {
                System.out.printf(twoDArrayCounts[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public static void applyMethods(int[][] twoDArrayCounts) {
        firstMethodTwoShow2DArray(twoDArrayCounts);
        secondMethodTwoShow2DArray(twoDArrayCounts);
    }

    public static int[][] createTwoDArray() {
        int[][] twoDArray = {
            {1, 0, 1},
            {1, 1, 0},
            {0, 0, 1},
            {1, 0, 0},
            {0, 1, 1},
            {0, 1, 1},
            {1, 1, 0}
        };
        return twoDArray;
    }

}
