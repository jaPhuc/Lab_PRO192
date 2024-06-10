/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

import java.util.Scanner;

/**
 *
 * @author giaph
 */
public class CE190872_LAB3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BookManagement manager = new BookManagement();
        int operations;
        boolean is_running = true;
        
        //Add scanner
        Scanner sc = new Scanner(System.in);

        //Show menu
        System.out.println("----- BOOK MANAGEMENT -----");
        System.out.println("1. Adds new book.");
        System.out.println("2. Shows all books.");
        System.out.println("3. The biggest size book.");
        System.out.println("4. Search the book by ID.");
        System.out.println("5. Sort the list of books descending by size.");
        System.out.println("6. Delete a book by ID.");
        System.out.println("7. Quit");
        System.out.print("Please choose a function: ");
        
        //Choose operations
        operations = sc.nextInt();
        while (is_running) {
            switch (operations) {
                case 1: {
                    manager.entryData();
                    System.out.print("Please choose another function: ");
                    operations = sc.nextInt();
                    break;
                }
                case 2: {
                    manager.printData();
                    System.out.print("Please choose another function: ");
                    operations = sc.nextInt();
                    break;
                }
                case 3: {
                    manager.showBiggestBook();
                    System.out.print("Please choose another function: ");
                    operations = sc.nextInt();
                    break;
                }
                case 4: {
                    manager.searchBookByID();
                    System.out.print("Please choose another function: ");
                    operations = sc.nextInt();
                    break;
                }
                case 5: {
                    manager.sort();
                    System.out.print("Please choose another function: ");
                    operations = sc.nextInt();
                    break;
                }
                case 6: {
                    manager.deleteBookByID();
                    System.out.print("Please choose another function: ");
                    operations = sc.nextInt();
                    break;
                }
                case 7: {
                    System.out.println("THANK FOR USING OUR APPLICATION!");
                    System.out.println("SEE YOU AGAIN!");
                    is_running = false;
                    break;
                }
                default: {
                    System.out.println("The function of application must be from 1 to 7!");
                    System.out.print("Please try again: ");
                    operations = sc.nextInt();
                    break;
                }
            }
        }
    }

}
