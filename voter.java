// Write a function that takes in age as input and returns if that person is eligible 
// to vote or not. A person of age > 18 is eligible to vote.
import java.util.Scanner;
class voter{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        
        int age = sc.nextInt();
        System.out.println(voter(age));

    }
    public static String voter(int age){
        if(age>18){
            return "You are eligible to vote";
        }
        else{
            return "You are not eligible to vote";
        }
    }
}