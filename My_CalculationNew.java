/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author johnp
 */
class CalculationNew {
    int z;

    public void addition (int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers: "+z);
    }

    public void Substraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between thw given numbers:"+z);
    }
}
public class My_CalculationNew extends CalculationNew {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers :"+z);
    }
   
    public static void main(String[] args) {
        int a = 20, b = 10;
        CalculationNew demo = new CalculationNew();
        demo.addition(a, b);
        demo.Substraction(a, b);
//        demo.multiplication(a, b);
    }
    
}

