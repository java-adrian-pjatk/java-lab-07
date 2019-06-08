/*
 * Zadanie 2: Circle
 * Wykonali:
 * Adrian Witkowski
 */

public class Circle implements GeometricObject
{
    protected double radius = 1.0;
    public Circle()
    {

    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}