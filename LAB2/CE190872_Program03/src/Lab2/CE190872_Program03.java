/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
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
        
        //Input String
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String first_name = sc.next();
        System.out.print("Please enter your last name: ");
        String last_name = sc.next();
        
        //Output
        System.out.println("Result: " + first_name.substring(0, 1).toUpperCase() + "." + last_name.substring(0, 1).toUpperCase() + ".");
    }
    
}
