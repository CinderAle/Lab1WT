package by.bsuir.fundamentals;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class Task4Test extends Task4 {

    @Test
    public void testIsPrimary() {
        Integer number = 1063;
        assertTrue(Task4.isPrimary(number));
    }

    @Test
    public void testSolve() {
        Integer[] array = new Integer[] {1, 57, 43, 54, 89, 33};
        HashSet<Integer> primaryNumbers = new HashSet<>();
        primaryNumbers.add(0);
        primaryNumbers.add(2);
        primaryNumbers.add(4);
        Assert.assertEquals(primaryNumbers, Task4.solve(array));
    }
}