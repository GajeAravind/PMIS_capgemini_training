// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥 𝑛 . 
import java.util.Scanner;
public class twonumber {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base number");
    int x = sc.nextInt();
    System.out.println("Enter the power number");
    int n = sc.nextInt();
    int result = power(x, n);
    System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
    public static int power(int x, int n){
        int result = 1;
        for(int i=0; i<n; i++){
            result *= x;
        }
        return result;
    }


}
