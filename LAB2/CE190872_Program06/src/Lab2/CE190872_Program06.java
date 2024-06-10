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
public class CE190872_Program06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input String
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Please enter a color: ");
        String word = sc.nextLine();
        
        //Output
        if (sentence.contains("red")) {
            System.out.println(sentence.replace("red", word));
        }
        else {
            System.out.println("There is no 'red' word in the sentence");
        }
    }
}
