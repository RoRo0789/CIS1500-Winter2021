
package chapter6;

import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {
    
    public RectangleTest() {
    }

    @Test
    public void testIsBiggerThan()
    {
        // Arrange
        Rectangle smallRectangle = new Rectangle(2, 4);
        Rectangle largeRectangle = new Rectangle(5, 5);
        
        // Act
        boolean actualIsBiggerThan = largeRectangle.isBiggerThan(smallRectangle);
        boolean actualIsSmallerThan = largeRectangle.isSmallerThan(smallRectangle);
        
        // Assert
        assertTrue(actualIsBiggerThan);
        assertFalse(actualIsSmallerThan);
    }
    
    @Test
    public void testIsSmallerThan()
    {
        // Arrange
        Rectangle smallRectangle = new Rectangle(2, 4);
        Rectangle largeRectangle = new Rectangle(5, 5);
        
        // Act
        boolean actualIsBiggerThan = smallRectangle.isBiggerThan(largeRectangle);
        boolean actualIsSmallerThan = smallRectangle.isSmallerThan(largeRectangle);
        
        // Assert
        assertFalse(actualIsBiggerThan);
        assertTrue(actualIsSmallerThan);
    }
    
    @Test
    public void testIsSameSize()
    {
        // Arrange
        Rectangle smallRectangle = new Rectangle(2, 4);
        Rectangle largeRectangle = new Rectangle(2, 4);
        
        // Act
        boolean isSameSize = smallRectangle.isSameSize(largeRectangle);
        
        // Assert
        assertTrue(isSameSize);
    }
    
    @Test
    public void testIsSameSizeLengthSameAsOtherWidth()
    {
        // Arrange
        Rectangle smallRectangle = new Rectangle(2, 4);
        Rectangle largeRectangle = new Rectangle(4, 2);
        
        // Act
        boolean isSameSize = smallRectangle.isSameSize(largeRectangle);
        
        // Assert
        assertTrue(isSameSize);
    }
    
}
