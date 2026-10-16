package oops;

public class generic1<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class Main {
    public static void main(String[] args) {
        generic1<String> mobile = new generic1<>();
        mobile.setItem("Samsung");

        generic1<Integer> price = new generic1<>();
        price.setItem(25000);

        System.out.println("Mobile: " + mobile.getItem());
        System.out.println("Price: " + price.getItem());
    }
}