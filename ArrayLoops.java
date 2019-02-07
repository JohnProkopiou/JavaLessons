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
public class ArrayLoops {
    public static void main(String [] args) {
        int [] primes = {2,3,5,7,11,13,17};  
        firstMethodToShowPrimes(primes);
        secondMethodToShowPrimes(primes);
        thirdMethodToShowPrimes(primes);
    }
    public static void firstMethodToShowPrimes(int [] primes){
     for (int i=0;i<primes.length;i++){
            System.out.println("current element is: "+primes[i]);
        }}
    public static void secondMethodToShowPrimes(int [] primes) {
         for (int number:primes){
            System.out.println(number);
        }
    }
    public static void thirdMethodToShowPrimes(int [] primes) {
        int i = 0;
        while (i<primes.length){
            System.out.println(primes[i]);
            i++;
        }}
    
}
