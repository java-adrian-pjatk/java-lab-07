/*
 * Zadanie 2: Resizable Circle
 * Wykonali:
 * Adrian Witkowski
 */

public class ResizableCircle extends Circle implements Resizable
{
    public double resize(int percent)
    {
        radius = radius + (radius * percent);
        return radius;
    }
}