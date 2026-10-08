// Write a function that takes in the radius as input and returns the circumference of a circle. 
import java.util.Scanner;

public class radius{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();

        System.out.println("The circumference of the circle is: " + circumference(r));
    }
    public static double circumference(double r){
        return 2 * Math.PI * r;
    }
}
