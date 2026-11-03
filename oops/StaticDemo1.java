package oops;


class UserAccount {

    // Private instance variable
    private String username;

    // Private static variable
    private static int totalUsers = 0;

    // Parameterized constructor
    UserAccount(String username) {
        this.username = username;
        totalUsers++;
    }

    // Getter method
    public String getUsername() {
        return username;
    }

    // Static method
    public static int getTotalUsers() {
        return totalUsers;
    }
}

public class StaticDemo1 {

    public static void main(String[] args) {

        // Display initial user count
        System.out.println("Initial User Count: "
                + UserAccount.getTotalUsers());

        // Create three user objects
        UserAccount user1 = new UserAccount("Aarav");
        UserAccount user2 = new UserAccount("Priya");
        UserAccount user3 = new UserAccount("Rohan");

        // Display usernames
        System.out.println("Username: " + user1.getUsername());
        System.out.println("Username: " + user2.getUsername());
        System.out.println("Username: " + user3.getUsername());

        // Display total registered users
        System.out.println("Total Registered Users: "
                + UserAccount.getTotalUsers());
    }
}

