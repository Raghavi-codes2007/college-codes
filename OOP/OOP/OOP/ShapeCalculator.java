class Shape {

    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Square extends Shape {

    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

public class ShapeCalculator {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("      SHAPE AREA CALCULATOR");
        System.out.println("================================");

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 6);
        Shape triangle = new Triangle(8, 5);
        Shape square = new Square(4);

        System.out.printf("Area of Circle    : %.2f%n",
                circle.calculateArea());

        System.out.printf("Area of Rectangle : %.2f%n",
                rectangle.calculateArea());

        System.out.printf("Area of Triangle  : %.2f%n",
                triangle.calculateArea());

        System.out.printf("Area of Square    : %.2f%n",
                square.calculateArea());
    }
}
