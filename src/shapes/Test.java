package shapes;

public class Test {
    public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.computeArea()
                + "\nResulting perimeter: " + rectangle.computePerimeter() + "\n");

        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
                + "\nResulting Area: " + circle.computeArea()
                + "\nResulting Perimeter: " + circle.computePerimeter() + "\n");

        // Triangle test
        double a = 5, b = 3, c = 4;
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.computeArea()
                + "\nResulting Perimeter: " + triangle.computePerimeter() + "\n");
    }
}