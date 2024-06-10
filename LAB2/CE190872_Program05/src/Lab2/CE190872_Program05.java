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
public class CE190872_Program05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input String
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = sc.nextLine();
        System.out.print("Please enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();
        
        //Ouput
        String check = word.toLowerCase();
        if (sentence.contains(check)) {
            System.out.println("The word '" + word + "' is in the sentence.");
        } 
        else {
            System.out.println("The word '" + word + "' is not in the sentence.");
        }
    }
    
}
