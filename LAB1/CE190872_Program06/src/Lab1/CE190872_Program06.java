/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.util.Scanner;
/**
 *
 * @author giaph
 */
public class CE190872_Program06 {
    
    //Calculate factorial
    public static double giaithua(int n) {
        if (n ==0) {
            return 1;
        } else {
            return n * giaithua(n - 1);
        }
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input variables
        double sum = 0;
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter positive integer N: ");
        N = sc.nextInt();
        
        //Calculating & Output
        //Exceptions
        if (N <= 0) {
            System.out.print("Accept positive number only!");
        }
        //Case N = 1 
        else if (N == 1) {
            System.out.println("The sum is S = 1");
        }
        //Other cases
        else {
            System.out.print("The sum is S =");
            for (int i = 1; i <= N; i++) {
                sum += giaithua(i) / Math.pow(2, i - 1);
                System.out.printf(" %d!/2^%d", i, i - 1);
                if (i < N) {
                    System.out.printf(" +");
                }
            }
            System.out.printf(" = %.2f\n", sum);
        }
    }
}
