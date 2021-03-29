package inheritance;

public class Rectangle extends Polygon {
    
    public Rectangle(String name) {
        // calls the superclass constructor
        super(name, 4);
    }

    @Override
    public void setSideLength(int sideIndex, int sideLength) {
        if (sideIndex == 0 || sideIndex == 2) {
            super.setSideLength(0, sideLength);
            super.setSideLength(2, sideLength);
        } else if (sideIndex == 1 || sideIndex == 3) {
            super.setSideLength(1, sideLength);
            super.setSideLength(3, sideLength);
        }
    }

    public int getArea() {
        return getSideLength(0) * getSideLength(1);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " with an area of " + getArea();
    }
}
