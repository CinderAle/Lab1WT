package by.bsuir.fundamentals;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class Task3 {
    protected static Double a, b;
    protected static void getInterval(Double aVal, Double bVal) {
        if(aVal < bVal) {
            a = aVal;
            b = bVal;
        }
        else {
            a = bVal;
            b = aVal;
        }
    }
    protected static HashMap<Double, Double> getTable(Double h){
        HashMap<Double, Double> table = new HashMap<>();
        for (Double x = a; x.compareTo(b) <= 0; x += h) {
            table.put(x, Math.tan(x));
        }
        return table;
    }
    private static void printTable(HashMap<Double, Double> table) {
        System.out.println("X | F(x)");
        System.out.println("--------");
        table.forEach((key, value)->{
            System.out.println(key + " | " + value);
        });
    }
    public static void solve(Double aVal, Double bVal, Double h) {
        getInterval(aVal, bVal);
        printTable(getTable(h));
    }
}
