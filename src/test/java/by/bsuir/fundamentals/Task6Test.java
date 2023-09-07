package by.bsuir.fundamentals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test extends Task6 {

    @Test
    public void testCycleShiftArray() {
        Double[] array = new Double[] {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
        Double[] shiftedArray = new Double[] {2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,1.0};
        Double[] actualArray = Task6.cycleShiftArray(array);
        for (int i = 0;i < array.length;i++) {
            Assert.assertEquals(shiftedArray[i], actualArray[i]);
        }
    }

    @Test
    public void testSolve() {
        Double[] array = new Double[] {1.0,2.0,3.0};
        Double[][] table = new Double[][] {{1.0,2.0,3.0},
                                           {2.0,3.0,1.0},
                                           {3.0,1.0,2.0}};
        Double[][] actualTable = Task6.solve(array);
        for(int i = 0;i < array.length;i++) {
            for(int j = 0;j < array.length;j++) {
                Assert.assertEquals(table[i][j], actualTable[i][j]);
            }
        }
    }
}