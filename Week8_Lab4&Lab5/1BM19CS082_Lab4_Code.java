import java.util.Scanner;
import java.lang.Math;

abstract class Shape {
    int a, b;

    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Shape(int a) {
        this.a = a;

    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of rectangle is: " + a * b);
    }
}

class Triangle extends Shape {
    Triangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of triangle is: " + a * b / 2);
    }
}

class Circle extends Shape {
    Circle(int a) {
        super(a);
    }

    void printArea() {
        System.out.println("Area of circle is: " + Math.PI * Math.pow(a, 2));
    }
}

public class Lab4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Shape s;
        Rectangle r = new Rectangle(4, 10);
        Triangle t = new Triangle(6, 3);
        Circle c = new Circle(3);
        s = r;
        s.printArea();
         s = t;
        s.printArea();
         s = c;
        s.printArea();
    }
}
