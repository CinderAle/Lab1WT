package by.bsuir.fundamentals;

public class Task1 {
    private static Double x, y;
    private static Double numerator() {
        return (1 + Math.pow(Math.sin(x + y), 2)) * (1 + Math.pow(x, 2) * Math.pow(y, 2));
    }

    private static Double absolute() {
        return Math.abs(Math.pow(x, 3) * Math.pow(y, 2) - x);
    }

    private static Double denominator() {
        return 2 + 2 * Math.pow(x, 2) * Math.pow(y, 2) + absolute();
    }

    public static Double solve(Double xVal, Double yVal) {
        x = xVal;
        y = yVal;
        return numerator() / denominator() + x;
    }
}