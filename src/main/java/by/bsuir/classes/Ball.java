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
    private void enterWeight(Scanner scan) {
        double weight = 0.0;
        boolean isCorrect;
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
        setWeight(weight);
    }
    private void enterColor(Scanner scan) {
        Color color = Color.WHITE;
        boolean isCorrect;
        do{
            isCorrect = true;
            System.out.print("Enter the color: ");
            try {
                color = Color.valueOf(scan.nextLine().toUpperCase());
            }
            catch(Exception e){
                isCorrect = false;
                System.err.println("Wrong value!");
            }
        } while(!isCorrect);
        setColor(color);
    }
    public Ball(Scanner scanner) {
        enterWeight(scanner);
        enterColor(scanner);
    }
    public void show() {
        System.out.println("Weight: " + getWeight() + " Color: " + getColor());
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
