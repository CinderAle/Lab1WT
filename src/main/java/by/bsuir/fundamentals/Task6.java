package by.bsuir.fundamentals;

public class Task6 {
    protected static Double[] cycleShiftArray(Double[] array) {
        Double[] shiftedArray = new Double[array.length];
        if (array.length - 1 >= 0) {
            System.arraycopy(array, 1, shiftedArray, 0, array.length - 1);
        }
        shiftedArray[array.length - 1] = array[0];
        return shiftedArray;
    }
    public static Double[][] solve(Double[] array){
        Double[][] table = new Double[array.length][array.length];
        table[0] = array;
        for(int i = 1;i < array.length;i++) {
            table[i] = cycleShiftArray(table[i - 1]);
        }
        return table;
    }
}
