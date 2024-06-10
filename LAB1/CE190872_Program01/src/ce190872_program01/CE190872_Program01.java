/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce190872_program01;
import java.util.Scanner;
/**
 *
 * @author giaph
 */
public class CE190872_Program01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variables declaration
        int a, b, c;
        double  P, D;
        
        // Input variables
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter the first edge of triangle: ");
            a = sc.nextInt();
	System.out.print("Please enter the second edge of triangle: ");
            b = sc.nextInt();
        System.out.print("Please enter the second edge of triangle: ");
            c = sc.nextInt();
        
        // Calculating
        P = a+b+c;
        D = Math.sqrt(P/2*(P/2-a)*(P/2-b)*(P/2-c));
        
        // Handling errors
        if (a < 0 || b < 0 || c < 0) {
            System.out.print("These three numbers must be a positive number!");
        } else if ( a + b < c || b + c < a || a + c < b) {
               System.out.print("These numbers do not make a triangle!");
        } else {
               System.out.println("The perimeter of the triangle is " + P);
               System.out.println("The area of the triangle is " + D);
        }
    }
    
}
