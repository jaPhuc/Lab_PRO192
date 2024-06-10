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
public class CE190872_Program02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input String
        System.out.print("Please type a color: ");
        Scanner sc = new Scanner(System.in);
        String color = sc.next();
        
        //Print letters
        System.out.println("The first letter is " + color.charAt(0));
        System.out.println("The third letter is " + color.charAt(2));
    }
    
}
