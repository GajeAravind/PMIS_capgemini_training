package oops;
class car {
    String brand;
    String speed;
    String color;
    car(String brand,String speed,String color){
        this.brand=brand;
        this.speed=speed;
        this.color=color;
    }   
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
        System.out.println("Color: "+color);
    }
}

public class constructor {
    public static void main(String args[]){
        car c1=new car("BMW","200km/h","Black");
        car c2=new car("Audi","250km/h","White");
        c1.display();
        c2.display();
    }
    
}
