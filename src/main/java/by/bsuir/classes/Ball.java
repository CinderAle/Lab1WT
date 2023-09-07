package by.bsuir.classes;

import java.util.Scanner;

public class Ball {
    public enum Color {WHITE, BLACK, BLUE, RED, GREEN, YELLOW, PINK, ORANGE}
    private Double weight;
    private Color color;

    public Ball(Double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }
    private void enterWeight() {
        double weight = 0.0;
        boolean isCorrect;
        Scanner scan = new Scanner(System.in);
        do {
            isCorrect = true;
            System.out.print("Enter the weight: ");
            try {
                weight = Double.parseDouble(scan.nextLine());
            }
            catch(Exception e){
                isCorrect = false;
                System.err.println("Wrong value!");
            }
        } while(!isCorrect);
        scan.close();
        setWeight(weight);
    }
    private void enterColor() {
        Color color = Color.WHITE;
        boolean isCorrect;
        Scanner scan = new Scanner(System.in);
        do{
            isCorrect = true;
            System.out.print("Enter the color: ");
            try {
                color = Color.valueOf(scan.nextLine());
            }
            catch(Exception e){
                isCorrect = false;
                System.err.println("Wrong value!");
            }
        } while(!isCorrect);
        scan.close();
        setColor(color);
    }
    public Ball() {
        enterWeight();
        enterColor();
    }
    public void show() {
        System.out.println("Weight: " + getWeight() + "Color:" + getColor());
    }
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
