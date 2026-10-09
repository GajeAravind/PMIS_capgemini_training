package inheritance;
interface father {
    void message(); 
           
}
interface mother {
    void message(); 
           
}
class child implements father, mother {
    public void message() {
        System.out.println("loving both mam and dad");
    }
}
public class MultipleInheritance {
    public static void main(String args[]) {
        child c = new child();
        c.message();
    }
    
}
