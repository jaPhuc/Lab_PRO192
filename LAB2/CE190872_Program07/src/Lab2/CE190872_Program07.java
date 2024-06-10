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
public class CE190872_Program07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input String
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a password: ");
        String pass = sc.nextLine();
        
        //Check validity
        int inValid = 0;
        if (pass.length() < 8) {
            System.out.println("Your password is too short.");
            inValid++;
        }
        if (pass.contains(" ")) {
            System.out.println("Your password contains spaces.");
            inValid++;
        }
        if (!pass.contains("G")) {
            System.out.println("Your password does not start with a 'G'.");
            inValid++;
        }
        
        //Result
        if (inValid == 0) {
            System.out.println("Well done. You entered a valid password.");
        }
    }
    
}
