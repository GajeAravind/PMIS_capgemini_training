// Write a function which takes in 2 numbers and returns the greater of those two. 
 import java.util.Scanner;   
class greater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int result = greater(a, b);
        System.out.println("The greater number is: " + result); 

    }
    public static int greater(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
