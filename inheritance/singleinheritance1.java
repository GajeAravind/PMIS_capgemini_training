package inheritance;
class animal{
    void bark(){
        System.out.println("eating");
    }
}
class dog extends animal{
    void bark(){
        super.bark();
        System.out.println("barking");
    }
}


public class singleinheritance1 {
    public static void main(String args[]){
        dog d = new dog();
        d.bark();
    }
    
}
