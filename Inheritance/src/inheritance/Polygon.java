package inheritance;

import java.util.ArrayList;

// automatically extends Object
public class Polygon {

    private int numberOfSides;
    private ArrayList<Integer> sideLengths;
    private String name;

    public Polygon(String name, int numberofSides) {
        this.name = name;
        if (numberofSides > 0) {
            this.numberOfSides = numberofSides;
            sideLengths = new ArrayList<>(numberofSides);
            for (int side = 0; side < numberofSides; side++) {
                sideLengths.add(0);
            }
        } else {
            this.numberOfSides = 0;
            sideLengths = new ArrayList<>(0);
        }
    }

    public void setSideLength(int sideIndex, int sideLength) {
        if (sideLength > 0) {
            sideLengths.set(sideIndex, sideLength);
        }
    }

    public int getSideLength(int sideIndex) {
        return sideLengths.get(sideIndex);
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int getPerimeter() {
        int perimeter = 0;

        for (int sideLength : sideLengths) {
            perimeter += sideLength;
        }

        // essentially same as above
//        for ( int index = 0; index < sideLengths.size(); indx++ ){
//            perimeter += sideLengths.get(index);
//        }
        return perimeter;
    }

    @Override
    public String toString(){
        return name + " has " + numberOfSides + " sides and a perimeter of " + getPerimeter();
    }
}
