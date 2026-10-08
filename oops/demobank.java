class bank{
    String name;
    int accountNumber;
    int balance;
    int withdraw;
    bank(String name, int accountNumber, int balance){
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.withdraw=withdraw;
    }
   if (balance==0){
        System.out.println(" balance is  available");
    }
    else{
        System.out.println(" balance is  not available");
    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("Amount deposited: "+amount);
    }
    void withdraw(int amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Amount withdrawn: "+amount);
        }
        void display(){
            System.out.println("Name: "+name);
            System.out.println("Account Number: "+accountNumber);
            System.out.println("Balance: "+balance);
            System.out.println("Withdraw: "+withdraw);
        }
    }
public class demobank{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        string name = sc.nextLine();
        System.out.println("Enter your account number");
        int accountNumber = sc.nextInt();
        System.out.println("Enter your balance");
        int balance = sc.nextInt();
        bank b = new bank(name, accountNumber, balance);
        b.display();
        System.out.print("Enter amount to withdraw: ");
        int withdraw = sc.nextInt();
        b.withdraw(withdraw);
        b.display();
        sc.close();
       


    }

}













