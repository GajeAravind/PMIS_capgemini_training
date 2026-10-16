package oops;
import 


public class Pair {
    private Object key;
    private Object value;

    public Pair(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair p = new Pair("Name", 22);

        String k = (String) p.getKey();
        Integer v = (Integer) p.getValue();

        System.out.println(k + " " + v);
    }
}