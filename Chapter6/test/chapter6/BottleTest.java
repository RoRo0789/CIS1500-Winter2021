
package chapter6;

import org.junit.Test;
import static org.junit.Assert.*;


public class BottleTest {
    
    public BottleTest() {
    }

    @Test
    public void testFill() {
        // Arrange
        int expectedCurrentVolumeInMililiters = 355;
        
        // Act
        Bottle cokeZeroMini = new Bottle("Coke Zero", "clear", expectedCurrentVolumeInMililiters);
        cokeZeroMini.fill(cokeZeroMini.getMaxVolumeInMililiters());
        int actualCurrentVolumeInMililiters = cokeZeroMini.getCurrentVolumeInMililiters();
        
        // Assert
        assertEquals(expectedCurrentVolumeInMililiters, actualCurrentVolumeInMililiters);
    }
    
    @Test
    public void testFillOverMax() {
        // Arrange
        int expectedCurrentVolumeInMililiters = 355;
        
        // Act
        Bottle cokeZeroMini = new Bottle("Coke Zero", "clear", expectedCurrentVolumeInMililiters);
        cokeZeroMini.fill(cokeZeroMini.getMaxVolumeInMililiters() * 2);
        int actualCurrentVolumeInMililiters = cokeZeroMini.getCurrentVolumeInMililiters();
        
        // Assert
        assertEquals(expectedCurrentVolumeInMililiters, actualCurrentVolumeInMililiters);
    }

    @Test
    public void testDrink() {
        // Arrange
        int maxVolumeInMililiters = 355;
        int mililitersToDrink = 100;
        int expectedCurrentVolumeInMililiters = 255;
        
        // Act
        Bottle cokeZeroMini = new Bottle("Coke Zero", "clear", maxVolumeInMililiters);
        cokeZeroMini.fill(cokeZeroMini.getMaxVolumeInMililiters());
        cokeZeroMini.drink(mililitersToDrink);
        int actualCurrentVolumeInMililiters = cokeZeroMini.getCurrentVolumeInMililiters();
        
        // Assert
        assertEquals(expectedCurrentVolumeInMililiters, actualCurrentVolumeInMililiters);
    }
    
    @Test
    public void testDrinkBelowZero() {
        // Arrange
        int maxVolumeInMililiters = 355;
        int mililitersToDrink = 1000;
        int expectedCurrentVolumeInMililiters = 0;
        
        // Act
        Bottle cokeZeroMini = new Bottle("Coke Zero", "clear", maxVolumeInMililiters);
        cokeZeroMini.fill(cokeZeroMini.getMaxVolumeInMililiters());
        cokeZeroMini.drink(mililitersToDrink);
        int actualCurrentVolumeInMililiters = cokeZeroMini.getCurrentVolumeInMililiters();
        
        // Assert
        assertEquals(expectedCurrentVolumeInMililiters, actualCurrentVolumeInMililiters);
    }

    @Test
    public void testGetName() {
    }

    @Test
    public void testColor() {
    }
    
}
