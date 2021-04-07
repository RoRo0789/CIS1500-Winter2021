
package project4;

import org.junit.Test;
import static org.junit.Assert.*;


public class BigIntTest {
    
    public BigIntTest() {
    }

    @Test
    public void testAddTwoPositives() {
        BigInt first = new BigInt("123");
        BigInt second = new BigInt("234");
        
        BigInt result = first.add(second);
        String actualValue = result.toString();
        
        assertEquals("357", actualValue);
    }
    
    @Test
    public void testAddTwoNegatives() {
        BigInt first = new BigInt("-123");
        BigInt second = new BigInt("-234");
        
        BigInt result = first.add(second);
        String actualValue = result.toString();
        
        assertEquals("-357", actualValue);
    }
    
    @Test
    public void testAddPositiveAndNegative() {
        BigInt first = new BigInt("-123");
        BigInt second = new BigInt("234");
        
        BigInt result = first.add(second);
        String actualValue = result.toString();
        
        assertEquals("111", actualValue);
    }
    
    @Test
    public void testAddPositiveAndNegativeAgain() {
        BigInt first = new BigInt("-123");
        BigInt second = new BigInt("234");
        
        BigInt result = second.add(first);
        String actualValue = result.toString();
        
        assertEquals("111", actualValue);
    }
    
    @Test
    public void testAddPositiveAndNegativeWithNegativeResult() {
        BigInt first = new BigInt("123");
        BigInt second = new BigInt("-234");
        
        BigInt result = first.add(second);
        String actualValue = result.toString();
        
        assertEquals("-111", actualValue);
    }
    
    @Test
    public void testAddPositiveAndNegativeAgainWithNegativeResult() {
        BigInt first = new BigInt("123");
        BigInt second = new BigInt("-234");
        
        BigInt result = second.add(first);
        String actualValue = result.toString();
        
        assertEquals("-111", actualValue);
    }
    
    @Test
    public void testAddIntsOfDifferentSizes() {
        BigInt first = new BigInt("999999");
        BigInt second = new BigInt("1");
        
        BigInt result = second.add(first);
        String actualValue = result.toString();
        
        assertEquals("1,000,000", actualValue);
        assertEquals("999,999", first.toString());
        assertEquals("1", second.toString());
        
    }
    
    @Test
    public void testToStringNegative()
    {
        // Arrange
        String expectedOutput = "-12,345,678";
        
        // Act
        BigInt bigInt = new BigInt(expectedOutput);
        String actualOutput = bigInt.toString();
        
        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testToStringPositiveWithoutCommas()
    {
        // Arrange
        String expectedOutput = "678";
        
        // Act
        BigInt bigInt = new BigInt(expectedOutput);
        String actualOutput = bigInt.toString();
        
        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
    
    
    @Test
    public void testSubtractionBothPositive()
    {
        BigInt first = new BigInt("999999");
        BigInt second = new BigInt("1");
        
        BigInt result = first.subtract(second);
        String actualValue = result.toString();
        
        assertEquals("999,998", actualValue);
    }
    
    @Test
    public void testSubtractionBothNegative()
    {
        BigInt first = new BigInt("-999999");
        BigInt second = new BigInt("-1");
        
        BigInt result = first.subtract(second);
        String actualValue = result.toString();
        
        assertEquals("-999,998", actualValue);
    }
    
    @Test
    public void testSubtractionNegativeMinusPositive()
    {
        BigInt first = new BigInt("-999999");
        BigInt second = new BigInt("1");
        
        BigInt result = first.subtract(second);
        String actualValue = result.toString();
        
        assertEquals("-1,000,000", actualValue);
        assertEquals("-999,999", first.toString());
        assertEquals("1", second.toString());
    }
    
    @Test
    public void testSubtractionPosiitveMinusNegative()
    {
        BigInt first = new BigInt("999999");
        BigInt second = new BigInt("-1");
        
        BigInt result = first.subtract(second);
        String actualValue = result.toString();
        
        assertEquals("1,000,000", actualValue);
    }
    
}
