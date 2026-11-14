class callvalue {

    // Instance variables
    int a;
    float b;
    char c;
    String d;
    boolean e;

    // Method with parameters
    public void show(int a1, float b1, char c1, String d1, boolean e1) {

        a = a1;
        b = b1;
        c = c1;
        d = d1;
        e = e1;

        System.out.println("Value of int: " + a);
        System.out.println("Value of float: " + b);
        System.out.println("Value of char: " + c);
        System.out.println("Value of String: " + d);
        System.out.println("Value of boolean: " + e);
    }

    public static void main(String[] args) {

        callvalue obj = new callvalue();

        obj.show(50, 50.2f, 'A', "Aravind", true);
    }
}
