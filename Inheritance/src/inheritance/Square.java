package inheritance;

public class Square extends Rectangle {

    public Square(String name) {
        super(name);
    }

    @Override
    public void setSideLength(int sideIndex, int sideLength) {
        super.setSideLength(0, sideLength);
        super.setSideLength(1, sideLength);
    }
}
