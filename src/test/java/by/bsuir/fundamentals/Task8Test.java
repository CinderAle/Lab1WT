package by.bsuir.fundamentals;

import org.junit.Assert;
import org.junit.Test;

public class Task8Test extends Task8 {

    @Test
    public void testGetSpots() {
        Double[] a = new Double[] {3.0,6.0,9.0,12.0,15.0};
        Double[] b = new Double[] {2.0,4.0,11.0,14.0,33.0};
        Integer[] spots = new Integer[] {0,1,3,4,-1};
        Integer[] actualSpots = Task8.getSpots(a, b);
        for(int i = 0;i < spots.length;i++) {
            Assert.assertEquals(spots[i], actualSpots[i]);
        }
    }
}