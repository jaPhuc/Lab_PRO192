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
public class CE190872_Program04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Banner
        System.out.println("SOLVING LINEAR EQUATION A*X + B = 0 PROGRAM:");
        System.out.println("------------------------------------------  ");
        
        //Input variables
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the coefficients A: ");
        a = sc.nextInt();
        System.out.print("Please enter the coefficients B: ");
        b = sc.nextInt();
        
        //Output & Handling exceptions
        if (a == 0 && b == 0) {
            System.out.print("Every value for X is a solution to the linear equation 0*X + 0 = 0");
        } 
        else if (a == 0) {
            System.out.printf("There is no solution for the linear equation %d*X + %d = 0", a, b);
        } 
        else {
            System.out.printf("The linear equation %d*X + %d = 0 has an unique root is X = %.2f", a, b, (float) -b / a);
        }
    }
}
