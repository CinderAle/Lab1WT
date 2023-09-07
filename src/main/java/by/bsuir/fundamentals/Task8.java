package by.bsuir.fundamentals;

public class Task8 {
    protected static Integer FrontSpot = -1;
    public static Integer[] getSpots(Double[] a, Double[] b) {
        Integer[] spots = new Integer[b.length];
        boolean isPlaced = false;
        int j = 0;
        for(int i = 0;i < a.length && !isPlaced;i++) {
            if(j < b.length && a[i].compareTo(b[j]) > 0) {
                spots[j++] = i;
            }
        }
        if(j < b.length) {
            for(int i = j;i < b.length;i++) {
                spots[i] = FrontSpot;
            }
        }
        return spots;
    }
}
