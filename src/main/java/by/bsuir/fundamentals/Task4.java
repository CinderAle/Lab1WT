package by.bsuir.fundamentals;

import java.util.HashSet;

public class Task4 {
    protected static boolean isPrimary(Integer number) {
        for(int i = 2; i <= Math.sqrt(number);i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static HashSet<Integer> solve(Integer[] array) {
        HashSet<Integer> primaryNumbers = new HashSet<>();
        for(int i = 0;i < array.length;i++){
            if(isPrimary(array[i])){
                primaryNumbers.add(i);
            }
        }
        return primaryNumbers;
    }
}
