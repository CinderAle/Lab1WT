package by.bsuir.fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {
    @Test
    public void testCorrect() {
        Double x = 2.0;
        Double y = 3.0;
        assertTrue(Task2.solve(x, y));
    }

    @Test
    public void testIncorrect() {
        Double x = 15.0;
        Double y = 4.0;
        assertFalse(Task2.solve(x, y));
    }
}