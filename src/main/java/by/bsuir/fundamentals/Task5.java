package by.bsuir.fundamentals;

import java.util.Arrays;

public class Task5 {
    protected static Integer[] getSequenceArray(Integer[] array) {
        Integer[] sequenceArray = new Integer[array.length];
        Arrays.fill(sequenceArray, 1);
        for(int i = 1;i < sequenceArray.length;i++) {
            for(int j = 0;j < i;j++) {
                if(array[i] > array[j]) {
                    sequenceArray[i] = Math.max(sequenceArray[i], sequenceArray[j] + 1);
                }
            }
        }
        return sequenceArray;
    }
    protected static Integer getMaxElement(Integer[] array) {
        Integer maxElement = array[0];
        for(Integer element : array) {
            maxElement = Math.max(maxElement, element);
        }
        return maxElement;
    }
    public static Integer solve(Integer[] array) {
        return array.length - getMaxElement(getSequenceArray(array));
    }
}
