
import java.util.Scanner;

public class TableOverloadingExample {

    // Method 1
    public void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Method 2 (Overloading)
    public void printTable(int num, int end) {
        for (int i = 1; i <= end; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TableOverloadingExample obj = new TableOverloadingExample();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num);


        obj.printTable(num);

        sc.close();
    }
}
