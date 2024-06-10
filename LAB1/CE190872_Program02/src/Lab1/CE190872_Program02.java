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
public class CE190872_Program02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Input variables
        int h, r;
        double pb, ab, tsa, v;
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter the base's radius of the cylinder: ");
	r = sc.nextInt();
	System.out.print("Please enter the height of the cylinder: ");
	h = sc.nextInt();
        
        //Calculating
        pb = 2*Math.PI * r;
        ab = Math.PI * r * r;
        tsa = h * pb + 2*ab;
        v = h * ab;
         
        //Ouput & Handling errors
        if( r > 0 && h > 0) {
            System.out.printf("The total surface area of the cylinder is %.10f\n",tsa);
            System.out.printf("The volume of the cylinder is %.10f",v );
            System.out.println();
        }
        else {
            System.out.println("The height and radius of cylinder must be a positive number! ");   
        }
    }
}
