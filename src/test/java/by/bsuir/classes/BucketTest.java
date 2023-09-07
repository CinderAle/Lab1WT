package by.bsuir.classes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BucketTest {
    Bucket bucket;

    @Before
    public void setUp() throws Exception {
        bucket = new Bucket();
        Ball[] balls = new Ball[] {new Ball(60.0, Ball.Color.BLUE),
                new Ball(23.0, Ball.Color.BLACK),
                new Ball(45.0, Ball.Color.ORANGE),
                new Ball(45.2, Ball.Color.BLUE)};
        for (Ball ball : balls) {
            bucket.addBall(ball);
        }
    }

    @Test
    public void getAllBallsWeight() {
        Assert.assertEquals((Double)173.2, bucket.getAllBallsWeight());
    }

    @Test
    public void getNumberOfBallsByColor() {
        Assert.assertEquals((Double)173.2, bucket.getAllBallsWeight());
    }
}