package oops;
// Exception Handling in Java
// Definition: Exception handling in Java is a mechanism used to handle runtime errors so that the normal flow of a program can continue without terminating unexpectedly.

// public class Main {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;

//         int result = a / b;

//         System.out.println(result);
//     }
// }
// class exceptionHandling {
//     public static void main(String[] args) {
//         int a = 10;
//         int b =  1;
//         try {
//             int result = a / b;
//             System.out.println(result);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Division by zero is not allowed.");
//         }
//     }
// }
// class exceptionHandling {
//     public static void main(String[] args) {
//       try{
//         int num =10/0;
//         System.out.println(num);
//       }
//         catch(ArithmeticException e){
//             System.out.println("Error:  do not Division by zero is not allowed.");
//         }
//         system.out.println("Program continues after exception handling.");
// }
// class exceptionHandling {
//     public static void main(String[] args) {
//         try {
//             int num = 10 / 0;
//             System.out.println(num);
//         } catch (ArithmeticException e) {
//             System.out.println("Error:  do not Division by zero is not allowed.");
//             System.out.println("Exception message: " + e.getMessage());
//         } 
// }

// class exceptionHandling {
//     public static void main(String[] args) {
//         try {
//             int[] number = {10, 20, 30};

//             System.out.println(number[5]);

//             int res = 10 / 0;
//             System.out.println(res);

//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Invalid array index.");
//         } catch (ArithmeticException e) {
//             System.out.println("Cannot divide by 0.");
//         }
//     }
// }
// class exceptionHandling {
//     public static void main(String[] args) {
//         try {
//             int res =10/0;

//         }catch(ArithmeticException e){
//             System.out.println("Cannot divide by 0.");
//         }finally{
//             System.out.println("Finall block excuted.");  
//         }
//     }
         
// }


// import java.util.Scanner;

// class exceptionHandling {
//     public static void main(String[] args) {

//         System.out.println("ENTER AGE.");

//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age < 0) {
//             throw new ArithmeticException("Age cannot be negative.");
//         }

//         System.out.println("Your age is: " + age);

        
//     }
//}
// import java.io.FileReader;
// import java.io.IOException;
// class exceptionHandling {
//     static void readfile()throws IOException{
//         FileReader file = new FileReader("test.txt");
//         System.out.println("File opened .");
//     }
//     public static void main(String[] args) {
//         try{
//             readfile();
//         }catch(IOException e){
//             System.out.println("File not found.");
//         }
//     }
// }
// import java.util.Scanner;
// class exceptionHandling {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the amount to withdraw: ");
//         int withdrawAmount =sc.nextInt();

//         int balance = 1000;
//         // int withdrawAmount = 1500;
//         try{
//            if (withdrawAmount > balance){
//                 throw new IllegalArgumentException("Insufficient balance for withdrawal.");
//             }
//             balance -= withdrawAmount;
//             System.out.println("Withdrawal successful.");
//             System.out.println("Remaining balance: " + balance);

//         }catch(IllegalArgumentException e){
//             System.out.println("Error: " + e.getMessage());
//         }
//         System.out.println("Program continues after exception handling.");
//     }
// }
// Problem Statement:

// Write a program that takes two integer inputs from the user and calculates their division. If the second number is zero, handle the resulting ArithmeticException gracefully and print an error message instead of crashing.
import java.util.Scanner;
class exceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second integer: ");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result "+ result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Program continues after exception handling.");
        }
    }
}