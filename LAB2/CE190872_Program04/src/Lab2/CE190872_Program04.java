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
public class CE190872_Program04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input String
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a name: ");
        String name = sc.next();
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        
        //Output 
        if (name.length() < num) {
            System.out.println("Sorry, that number is to big.");
        }
        else {
            System.out.println("The letter at position " + num + " is " + name.charAt(num));
        }
    }
    
}
