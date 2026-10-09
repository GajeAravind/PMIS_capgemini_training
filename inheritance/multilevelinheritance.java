package inheritance;

class Device {
    void device() {
        System.out.println("This is a device");
    }

}
class dabbaphone extends Device {
    void phone() {
        System.out.println("This is a phone");
    }
}
class smartphone extends dabbaphone {
    void smartphone() {
        System.out.println("This is a smartphone");
    }
}

public class multilevelinheritance {
    public static void main(String args[]) {
        smartphone s = new smartphone();
        s.smartphone();
        s.phone();
        s.device();
    }

    
}
