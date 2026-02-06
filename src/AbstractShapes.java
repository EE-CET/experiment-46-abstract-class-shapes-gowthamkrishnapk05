abstract class Shape {
    // TODO: Abstract method numberOfSides()
    abstract void nosides();
   
}

// TODO: Create class Rectangle extends Shape
// Implement numberOfSides() to print "Rectangle has 4 sides"
class rectangle extends Shape
{
    void nosides()
    {
        System.out.println("Rectangle has 4 sides");
    }
}

// TODO: Create class Triangle extends Shape
// Implement numberOfSides() to print "Triangle has 3 sides"
class triangle extends Shape
{
    void nosides()
    {
        System.out.println("Triangle has 3 sides");
    }
}
// TODO: Create class Hexagon extends Shape
// Implement numberOfSides() to print "Hexagon has 6 sides"
class hexagon extends Shape
{
    void nosides()
    {
        System.out.println("Hexagon has 6 sides");
    }
}
public class AbstractShapes {
    
    // TODO: Create objects for Rectangle, Triangle, and Hexagon
    // TODO: Call numberOfSides() for each object in the order: Rectangle, Triangle, Hexagon
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        triangle  t1 = new triangle();
        hexagon h1 = new hexagon();
        r1.nosides();
        t1.nosides();
        h1.nosides();
    }
}
