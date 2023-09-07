package by.bsuir.fundamentals;

import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
    @Test
    public void testSolve() {
        Double x = 0.0;
        Double y = 0.0;
        Assert.assertEquals(Task1.solve(x, y), (Double) 0.5);
    }

}