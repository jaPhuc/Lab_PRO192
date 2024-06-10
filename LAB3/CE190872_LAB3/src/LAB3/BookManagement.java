/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author giaph
 */
public class BookManagement {

    
    private final Scanner sc = new Scanner(System.in);
    private final ArrayList<EBook> listEBook = new ArrayList<>();
    
    //Create repeat funtion for further uses
    private String repeat(int times, String hyp) {
        String str = "";
        for (int i = 0; i < times; i++) {
            str = str + hyp;
        }
        return str;
    }
    
    /*
     *   Function 1
     */
    
    //Add new book
    public void entryData() {

        System.out.println("----- Add new ebook -----");
        String ID;
        EBook ebook = new EBook();
        System.out.print("Input ID: ");
        ID = sc.next();
        while (ID.length() != 5) {
            System.out.println("ID must be exactly 5 characters! Please try again.");
            System.out.print("Input ID: ");
            ID = sc.next();
        }
        ebook.setID(ID);

        String name;
        System.out.print("Input name: ");
        sc.nextLine();
        name = sc.nextLine();
        while (name.trim().isEmpty()) {
            System.out.println("Name mustn't be emty! Please try again.");
            System.out.print("Input name: ");
            name = sc.nextLine();
        }
        ebook.setName(name);

        int year;
        System.out.print("Input year: ");
        year = sc.nextInt();
        while (year < 1900 || year > 2024) {
            System.out.println("Year must be in range 1900 to 2024 and not empty! Please try again.");
            System.out.print("Input year: ");
            year = sc.nextInt();
        }
        ebook.setYear(year);

        String author;
        System.out.print("Input authors: ");
        sc.nextLine();
        author = sc.nextLine();
        while (author.trim().isEmpty()) {
            System.out.println("Author mustn't be emty! Please try again.");
            System.out.print("Input authors: ");
            author = sc.nextLine();
        }
        ebook.setAuthor(author);

        int size;
        System.out.print("Input size (kilobyte): ");
        size = sc.nextInt();
        while (size < 0) {
            System.out.println("Size must be greater than 0 and not empty! Please try again.");
            System.out.print("Input size: ");
            size = sc.nextInt();
        }
        ebook.setSize(size);

        String url;
        System.out.print("Input url: ");
        sc.nextLine();
        url = sc.nextLine();
        while (url.trim().isEmpty()) {
            System.out.println("url mustn't be emty! Please try again.");
            System.out.print("Input url: ");
            url = sc.nextLine();
        }
        ebook.setURL(url);
        
        listEBook.add(ebook);
        System.out.println("Ebook created and added to list of ebooks successful!");
    }

    //Header
    private void header() {
        System.out.printf("| %3s | %5s | %-20s | %s | %-13s | %7s | %-15s |\n", "No.", "ID", "Name", "Year", "Author", "Size", "URL");
        System.out.println("+" + repeat(5, "-") + "+" + repeat(7, "-") + "+" + repeat(22, "-") + "+" + repeat(6, "-") + "+" + repeat(15, "-") + "+" + repeat(9, "-") + "+" + repeat(17, "-") + "+");
    }

    /*
     *  Function 2
     */
    
    //Show all books
    public void printData() {
        System.out.println("-------------------------------------Book Management-------------------------------------");
        header();
        int index = 1;
        for (EBook ebook : listEBook) {
            ebook.showInfo(index);
            index++;
        }
    }

    /*
     *  Function 3
     */
    
    //Find the biggest size book
    private ArrayList<EBook> biggestSize() {

        int max = listEBook.get(0).getSize();
        for (EBook ebook : listEBook) {
            if (ebook.getSize() > max)
                max = ebook.getSize();
        }

        ArrayList<EBook> biggest = new ArrayList<>();
        for (EBook ebook : listEBook) {
            if (ebook.getSize() == max)
                biggest.add(ebook);
        }
        return biggest;
    }

    //Show the biggest book
    public void showBiggestBook() {
        header();
        int index = 1;
        for (EBook ebook : biggestSize()) {
            ebook.showInfo(index);
            index++;
        }
    }

    /*
     *   Function 4
     */

    //Find book by its ID
    private int searchBookByID(String ID) {
        for (int i = 0; i < listEBook.size(); i++) {
            if (listEBook.get(i).getID().equals(ID))
                return i;
        }
        return -1;
    }
    
    //Take book with its ID
    private EBook searchBookObjectByID(String ID) {
        for (EBook ebook : listEBook) {
            if (ebook.getID().equals(ID))
                return ebook;
        }
        return null;
    }

    //Print book by its ID
    public void searchBookByID() {
        
        String id;
        System.out.print(">>> Please enter book's ID to search: ");
        id = sc.next();
        EBook foundBook = searchBookObjectByID(id);
        if (foundBook == null) {
            System.out.println("Search result: Not Found");
        }
        else {
            System.out.println("Search result:");
            System.out.println("-------------------------------------Book Management-------------------------------------");
            header();
            foundBook.showInfo(1);
        }
    }
    
    /*
     *  Function 5
     */
    
    //Sorting in descending order by size
    public void sort() {
        ArrayList<EBook> bookSort = new ArrayList<>(listEBook);
        Collections.sort(bookSort, new Comparator<EBook>() {
            @Override
            public int compare(EBook eb1, EBook eb2) {
                return Integer.compare(eb2.getSize(), eb1.getSize());
            }
        });
        
         //Print sorted list
         System.out.println("-------------------------------------Book Management-------------------------------------");
         header();
         int index = 1;
         for (EBook ebook : bookSort) {
             ebook.showInfo(index);
             index++;
         }
         
    }
    
    /*
     *  Function 6
     */
    
    public void deleteBookByID() {
        
        //Find the book needed to be removed
        System.out.print(">>> Please enter book's ID to delete: ");
        String id = sc.next();
        int check = searchBookByID(id);
        
        //Remove the book by ID
        if (check == -1) {
            System.out.println("Not Found");
        }
        else {
            listEBook.remove(check);
            System.out.println("Delete successfully");
        }
    }
    
}
