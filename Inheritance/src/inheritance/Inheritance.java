
package inheritance;

import java.util.ArrayList;

public class Inheritance {

    public static void main(String[] args) {
        
        Polygon octogon = new Polygon("Octogon", 8);
        
        for ( int index = 0; index < 8; index++){
            octogon.setSideLength(index, 5);
        }
        
        System.out.println(octogon);
        
        Rectangle rectangle = new Rectangle("small rectangle");
        rectangle.setSideLength(0, 5);
        rectangle.setSideLength(1, 10);
        
        System.out.println(rectangle);
        
        
        Square bigSqaure = new Square("Big square");
        bigSqaure.setSideLength(0, 50);
        
        System.out.println(bigSqaure);
        
        ArrayList<Polygon> polygons = new ArrayList<Polygon>();
        polygons.add(octogon);
        polygons.add(rectangle);
        polygons.add(bigSqaure);
        
        for ( Polygon shape : polygons ){
            String result = shape.toString();
            
            System.out.println(result);
        }
        
    }
    
}
