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
public class CE190872_Program03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Input variables
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter dividend: ");
        a = sc.nextInt();
        System.out.print("Please enter divisor : ");
        b = sc.nextInt();
        
        //Output & Handling exceptions
        if ( b == 0 ) {
            System.out.print("The divisor can't be zero!");
        } 
        else if (a == 0) {
            System.out.printf("%d is not a multiple of %d", a, b);
        }
        else if ( a % b == 0 ) {
            System.out.printf("%d is a multiple of %d", a, b);
        }
        else {
            System.out.printf("%d is not a multiple of %d", a, b);
        }
    }
}
