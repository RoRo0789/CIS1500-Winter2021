package chapter6;

public class Rectangle {

    // list of attributes - almost always private
    private int length;
    private int width;
    private int area; // if this is an attribute, instead of calcuting it every time
                        // it  might get 'stale'

    // constructor - no return type - it's job is to 'construct the object'
    public Rectangle() {
        length = 0;
        width = 0;
        area = 0;
    }
    
    // constructor with parameters - parametized
    public Rectangle(int length, int width)
    {
        setLength(length);
        setWidth(width);
    }

    // methods - include public methods for people to interact with our class
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
        calculateArea();
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
        calculateArea();
    }

    public int getArea() {
        return area;
        // return length * width;
    }

    // private methods are typically considerd helper methods
    private void calculateArea() {
        area = length * width;
    }

}
