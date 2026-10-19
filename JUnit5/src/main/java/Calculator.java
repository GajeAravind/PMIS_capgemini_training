public class Calculator {

    public int add(int first, int second) {
        return first + second;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return dividend / divisor;
    }
}
