package by.bsuir.fundamentals;

public class Task2 {
    static Double upperBorder = 5.0;
    static Double lowerBorder = -3.0;
    static Double upperSide = 4.0;
    static Double lowerSide = 6.0;
    private static boolean isInUpper(Double y) {
        return  y.equals(0.0) || y.equals(upperBorder) || (y.compareTo(0.0) > 0 && y.compareTo(upperBorder) < 0) ;
    }
    private static boolean isInLower(Double y) {
        return y.equals(lowerBorder) || (y.compareTo(0.0) < 0 && y.compareTo(lowerBorder) > 0);
    }
    private static boolean isInSide(Double x, Double side) {
        Double absX = Math.abs(x);
        return side.equals(absX) || side.compareTo(absX) > 0;
    }
    public static boolean solve(Double x, Double y) {
        try {
            if (isInUpper(y)) {
                return isInSide(x, upperSide);
            } else if (isInLower(y)) {
                return isInSide(x, lowerSide);
            } else
                return false;
        }
        catch(Exception e){
            return false;
        }
    }

}
