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
public class CE190872_Program01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input string
        System.out.print("Please enter a word: ");
        Scanner sc = new Scanner(System.in);
        String Word = sc.next();
        switch (Word.charAt(0)) {
            case 'a':
                System.out.println("Yes, it starts with a lower case 'a'.");
                break;
            case 'A':
                System.out.println("Yes, it starts with an upper case 'A'.");
                break;
            default:
                System.out.println("No, it does not start with upper or lower case 'a'.");
                break;
        }
    }
}
