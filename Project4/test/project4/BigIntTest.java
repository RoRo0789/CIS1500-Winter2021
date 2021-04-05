/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EricC
 */
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
    public void testAddPositiveAndNegative() {
    }
    
    @Test
    public void testAddIntsOfDifferentSizes() {
    }
    
}
