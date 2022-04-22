package lesson5;

import java.util.Scanner;

public class Act5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width & height: ");
        Rectangle rectangle = new Rectangle(input.nextDouble(), input.nextDouble());
        rectangle.printWidth();
        rectangle.printHeight();
        System.out.println("Area is: " + rectangle.getArea());
        System.out.println("Perimeter is: " + rectangle.getPerimeter());
        System.out.println("Is square? " + rectangle.isSquare());
    }
}

class Rectangle {
    private double width;
    private double height;

    Rectangle() {}
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }
    public double getWidth() {
        return width;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }
    public double getHeight() {
        return height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }
    public double getArea() {
        return width * height;
    }

    public void printHeight() {
        System.out.println("Height is: " + height);
    }
    public void printWidth() {
        System.out.println("Width is: " + width);
    }

    public boolean isSquare() {
        return width == height;
    }
}
