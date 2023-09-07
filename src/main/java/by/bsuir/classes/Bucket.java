package by.bsuir.classes;

import java.util.ArrayList;

public class Bucket {
    private ArrayList<Ball> balls;

    public Bucket() {
        balls = new ArrayList<>();
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }
    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }
    public void addBall(Ball ball) {
        this.balls.add(ball);
    }
    public void show() {
        for(Ball ball : balls) {
            ball.show();
        }
    }
    public void clear() {
        balls.clear();
    }
    public Double getAllBallsWeight() {
        Double weight = 0.0;
        for(Ball ball : this.balls) {
            weight += ball.getWeight();
        }
        return weight;
    }
    public Integer getNumberOfBallsByColor(Ball.Color color) {
        Integer counter = 0;
        for(Ball ball : this.balls) {
            if(ball.getColor().equals(color)) {
                counter++;
            }
        }
        return counter;
    }
}
