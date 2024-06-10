/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author giaph
 */
public class CE190872_Program08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input String 
        Scanner sc = new Scanner(System.in);
        ArrayList<String> contestantList = new ArrayList<>();
        
        //Loop until quit
        while (true) {
            System.out.print("Please enter a name (quit to exit!): ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("quit")) {
                break;
            }
            contestantList.add(name);
        }
        
        //Show list
        if (contestantList.isEmpty()) {
            System.out.println("The player list is empty!");
        }
        else {
            System.out.println("List of players:");
            for (int i = 0; i < contestantList.size(); i++) {
                System.out.println((i + 1) + ". " + contestantList.get(i));
            }
        
            //List "Nguyen"
            int j = 0;
            System.out.println("#. List of players with the last name 'Nguyen':");
             for (int i = 0; i < contestantList.size(); i++) {
                if (contestantList.get(i).contains("Nguyen")) {
                    System.out.println((j + 1) + ". " + contestantList.get(i));
                    j++;
                }
            }
        
            //List "Dung"
            j = 0;
            System.out.println("#. List of players named 'Dung':");
            for (int i = 0; i < contestantList.size(); i++) {
                if (contestantList.get(i).contains("Dung")) {
                    System.out.println((j + 1) + ". " + contestantList.get(i));
                    j++;
                }
            }
        
            //Lucky winner
            Random lucky = new Random();
            int winner = lucky.nextInt(contestantList.size());
            System.out.println("#. The name of the lucky winner:");
            System.out.println(contestantList.get(winner));
        }
        sc.close();
    }
}
