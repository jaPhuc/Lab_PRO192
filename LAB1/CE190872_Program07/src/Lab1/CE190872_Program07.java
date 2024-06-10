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
public class CE190872_Program07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input variables 
        int N;
        long sum = 1;
        String str = ""; //String is used for storing numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter positive integer N: ");
        N = sc.nextInt();
        
        //Calculating & Handling exceptions
        if (N < 0) { // N is negative
            System.out.println("N must be greater than or equal 0!");
        }
        //Case N = 0
        else if (N == 0 || N == 1) {
            System.out.printf("%d! = 1\n", N);
        }
        //Other cases
        else {
            for (int i = 1; i <= N; i++) {
                sum *= i;
                str = str + i + "*";
            }
            System.out.printf("Result: %d! = ", N);
            System.out.println(str.substring(0, str.length() - 1) + " = " + sum);
        }
    }
    
}
