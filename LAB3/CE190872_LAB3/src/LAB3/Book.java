/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

/**
 *
 * @author giaph
 */
public class Book {
    
    //Book attributes
    protected String ID, name, author;
    protected int year, size;

    //Book constructors
    public Book(String ID, String name, String author, int year, int size) {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.year = year;
        this.size = size;
    }
    
    public Book() {
        this.ID = "";
        this.name = "";
        this.author = "";
        this.year = 1900;
        this.size = 0;
    }
    
    //Getters & Setters attributes
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    protected String repeat(int times, String hyp) {
        String str = "";
        for (int i = 0; i < times; i++) {
            str = str + hyp;
        }
        return str;
    }

    
    //Show books infomation
    public void showInfo(int index) {
       System.out.printf("| %3d | %5s | %-20s | %d | %-13s | %5dKB |\n", index, ID, name, year, author, size);
        System.out.println("+" + repeat(5, "-") + "+" + repeat(7, "-") + "+" + repeat(22, "-") + "+" + repeat(6, "-") + "+" + repeat(15, "-") + "+" + repeat(9, "-") + "+");
    }
}