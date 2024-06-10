/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author giaph
 */
public class CE190872_Program05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input variables
        int N, sum, sum1 = 0, sum2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter positive integer N: ");
        N = sc.nextInt();
        
        //Calculating 
        if (N < 0) {
            System.out.println("Accept positive number only!");
        } 
        else if (N == 0) {
            System.out.println("The sum is S = 0");
        }
        else if (N == 1) {
            System.out.println("The sum is S = 1");
        }
        else {
            for (int i = 1; i <= N; i+=2) {
                sum1 += i;
            }
            for (int j = 2; j <= N; j += 2) {
                sum2 += j;
            }
            sum = sum1 - sum2;
        //Output
            System.out.print("The sum is S = 1");
            for (int i = 2; i <= N; i++) {
                 if(i % 2 != 0){
                    System.out.print(" + " + i);
                } else {
                    System.out.print(" - " + i);
                }
            }
            System.out.println(" = " + sum);
        }
    }
}
