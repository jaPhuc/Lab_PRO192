/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.util.Scanner;
/**
 *
 * @author giaph
 */
public class CE190872_Program08 {
    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static boolean primeCheck(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Input variables
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many element of numeric array? ");
        N = sc.nextInt();

        if (N <= 0) {
            System.out.println("The number of element of numeric array must be greater than 0!");
        } else {
            int[] arr = new int[N];

            // Input array
            System.out.printf("Please enter value for %d elements:\n", N);
            for (int i = 0; i < N; i++) {
                switch (i) {
                    case 0:
                        System.out.print("Value of the 1st element is: ");
                        break;
                    case 1:
                        System.out.print("Value of the 2nd element is: ");
                        break;
                    case 2:
                        System.out.print("Value of the 3rd element is: ");
                        break;
                    default:
                        System.out.printf("Value of the %dth element is: ", i + 1);
                        break;
                }
                arr[i] = sc.nextInt();
            }

            System.out.println("*********************************");

            // Output the entered array
            System.out.print("1. The entered array is: ");
            System.out.printf("%d", arr[0]);
            for (int i = 1; i < arr.length; i++) {
                System.out.printf(", %d", arr[i]);
            }
            System.out.println();

            // Output the reverse array
            System.out.print("2. The reverse array is: ");
            System.out.printf("%d", arr[arr.length - 1]);
            for (int j = arr.length - 2; j >= 0; j--) {
                System.out.printf(", %d", arr[j]);
            }
            System.out.println();

            // Output the minimum value
            int min = findMin(arr);
            System.out.println("3. The minimum value of the numeric array is " + min);

            // Output the maximum value
            int max = findMax(arr);
            System.out.println("4. The maximum value of the numeric array is " + max);

            // Output all prime numbers in the array
            System.out.print("5. All the prime numbers in the array is/are");
            boolean foundPrime = false;
            for (int i = 0; i < arr.length; i++) {
                if (primeCheck(arr[i])) {
                    System.out.print(" " + arr[i]);
                    foundPrime = true;
                }
            }
            if (!foundPrime) {
                System.out.print(" None");
            }
            System.out.println();
        }
    } 
}
