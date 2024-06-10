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
public class EBook extends Book {
    
    //EBook attributes
  
    private String URL;
    public EBook(String URL, String ID, String name, String author, int year, int size) {
        super(ID, name, author, year, size);
        this.URL = URL;
    }

    public EBook() {
        super();
        this.URL = "";
    }
    
    //Getter & Setter (URL)
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
    
    
    //Show EBook information
    @Override
    public void showInfo(int index) {
       System.out.printf("| %3d | %5s | %-20s | %d | %-13s | %5dKB | %-15s |\n", index, ID, name, year, author, size, URL);
       System.out.println("+" + repeat(5, "-") + "+" + repeat(7, "-") + "+" + repeat(22, "-") + "+" + repeat(6, "-") + "+" + repeat(15, "-") + "+" + repeat(9, "-") + "+" + repeat(17, "-") + "+");
    }
    
}
