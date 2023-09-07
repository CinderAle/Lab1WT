package by.bsuir.fundamentals;

public class Task7 {
    protected static Double[] shellSort(Double[] array) {
        int i = 0;
        while(i < array.length - 1) {
            if(array[i] <= array[i + 1]){
                i++;
            }
            else {
                Double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if(i > 0) {
                    i--;
                }
            }
        }
        return array;
    }
}
