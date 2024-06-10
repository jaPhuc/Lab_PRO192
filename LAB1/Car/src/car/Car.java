/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author giaph
 */
import java.util.Scanner;


public class Car extends BanhXe {
    // Biến instance
    private String brand;
    private String model;
    private int year;

    // Constructor không tham số (default constructor)

    public Car(String brand, String model, int year) {
        super(5, 5);
        this.brand = brand;
        this.model = model;
        this.year = year;
    }



    // Getter cho biến brand
    public String getBrand() {
        return brand;
    }

    // Setter cho biến brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter cho biến model
    public String getModel() {
        return model;
    }

    // Setter cho biến model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter cho biến year
    public int getYear() {
        return year;
    }

    // Setter cho biến year
    public void setYear(int year) {
        if (year > 1885 && year <= 2024) { // Kiểm tra năm sản xuất hợp lệ
            this.year = year;
        } else {
            System.out.println("Invalid year. Please enter a year between 1886 and 2024.");
        }
    }

    // Phương thức để hiển thị thông tin của xe
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo đối tượng Car sử dụng constructor không tham số
        Car car1 = new Car("Toyota", "Celina", 2024);    
        BanhXe bx1 = new BanhXe(38, 99);
        bx1.BomHoi1(1);
        System.out.print("Truy cap " + bx1.Hoi);
        // Nhập thông tin xe từ người dùng
//        System.out.print("Enter car brand: ");
//        car.setBrand(scanner.nextLine());
//
//        System.out.print("Enter car model: ");
//        car.setModel(scanner.nextLine());
//
//        System.out.print("Enter car year: ");
//        while (true) {
//            try {
//                int year = Integer.parseInt(scanner.nextLine());
//                car.setYear(year);
//                break;
//            } catch (NumberFormatException e) {
//                System.out.print("Invalid input. Please enter a valid year: ");
//            }
//        }

        // Hiển thị thông tin xe
        car1.displayInfo();


        scanner.close();
    }
}
   
