package by.bsuir.fundamentals;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Task7Test extends Task7 {

    @Test
    public void testShellSort() {
        Double[] array = new Double[] {8.4,5.7,1.2,3.5,9.6,7.2,6.3,6.3};
        Double[] sortedArray = Task7.shellSort(array);
        Arrays.sort(array);
        for(int i = 0;i < array.length;i++) {
            Assert.assertEquals(array[i], sortedArray[i]);
        }
    }
}