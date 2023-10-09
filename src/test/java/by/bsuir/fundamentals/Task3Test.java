package by.bsuir.fundamentals;

import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.*;

public class Task3Test extends Task3 {

    @Test
    public void testGetInterval() {
        Double a = 3.0;
        Double b = 5.0;
        Task3.getInterval(a, b);
        assertEquals(Task3.a, a);
        assertEquals(Task3.b, b);
    }

    @Test
    public void testGetTable() {
        Double a = 0.0;
        Double b = 3.0;
        Double h = 1.5;
        Task3.getInterval(a, b);
        HashMap<Double, Double> table = new HashMap<>();
        table.put(0.0, 0.0);
        table.put(1.5, 14.101419947171719);
        table.put(3.0, -0.1425465430742778);
        assertEquals(Task3.getTable(h), table);
    }
}