package by.bsuir.fundamentals;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task5Test extends Task5 {
    @Test
    public void testGetSequenceArray() {
        Integer[] array = new Integer[] {1,2,3,4,5,6,5,4,5};
        Integer[] sequenceArray = new Integer[] {1,2,3,4,5,6,5,4,5};
        Integer[] actualSequence = Task5.getSequenceArray(array);
        assertEquals(sequenceArray.length, actualSequence.length);
        for(int i = 0;i < actualSequence.length;i++) {
            assertEquals(sequenceArray[i], actualSequence[i]);
        }
    }

    @Test
    public void testGetMaxElement() {
        Integer[] array = new Integer[] {1,2,3,4,5,68,7,1,23,54,68,8};
        assertEquals((Integer)68, Task5.getMaxElement(array));
    }

    @Test
    public void testSolve() {
        Integer[] array = new Integer[] {8,1,2,3,4,5,3,2,10,6,7,8};
        Integer K = 4;
        assertEquals(K, Task5.solve(array));
    }
}