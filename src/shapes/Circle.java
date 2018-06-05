package shapes;

public  class Circle extends Shape{
    private final double radius;
    private double pi = Math.PI;

    public Circle(double radius){
        this.pi = pi;
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return 2*pi * radius;
    }

    @Override
    public double computePerimeter() {
        return 0;
    }

    @Override
    public void enlarge(double factor) {

    }
}
