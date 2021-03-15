
package chapter6;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
    
    public BankAccountTest() {
    }

    @Test
    public void testDeposit_double() {
        // AAA convention
        
        // Arrange - setup required variables for testing
        double initalBalance = 100;
        double expectedBalance = 200;
        
        // Act - actually call the code we're testing
        BankAccount testAccount = new BankAccount("testName", initalBalance);
        testAccount.deposit(initalBalance);
        double actualBalance = testAccount.getBalance();
        
        // Assert - did we get what we expected?
         // when comparing doubles, give a delta value ( how close is close enough )
        assertEquals(expectedBalance, actualBalance, .0000001);
        
    }
    
    @Test
    public void testDepositNegativeDoesntDoAnything() {
        // AAA convention
        
        // Arrange - setup required variables for testing
        double initalBalance = 100;
        double expectedBalance = 100;
        double badDeposit = -100;
        
        // Act - actually call the code we're testing
        BankAccount testAccount = new BankAccount("testName", initalBalance);
        testAccount.deposit(badDeposit);
        double actualBalance = testAccount.getBalance();
        
        // Assert - did we get what we expected?
         // when comparing doubles, give a delta value ( how close is close enough )
        assertEquals(expectedBalance, actualBalance, .0000001);
        
    }

    @Test
    public void testDeposit_String() {
        // AAA convention
        
        // Arrange - setup required variables for testing
        String deposit = "100";
        double expectedBalance = 100;
        
        // Act - actually call the code we're testing
        BankAccount testAccount = new BankAccount("testName");
        testAccount.deposit(deposit);
        double actualBalance = testAccount.getBalance();
        
        // Assert - did we get what we expected?
         // when comparing doubles, give a delta value ( how close is close enough )
        assertEquals(expectedBalance, actualBalance, .0000001);
    }

    @Test
    public void testWithdraw_double() {
        // AAA convention
        
        // Arrange - setup required variables for testing
        double initalBalance = 200;
        double expectedBalance = 100;
        double withdrawAmount = 100;
        
        // Act - actually call the code we're testing
        BankAccount testAccount = new BankAccount("testName", initalBalance);
        testAccount.withdraw(withdrawAmount);
        double actualBalance = testAccount.getBalance();
        
        // Assert - did we get what we expected?
         // when comparing doubles, give a delta value ( how close is close enough )
        assertEquals(expectedBalance, actualBalance, .0000001);
        
    }
    
    @Test
    public void testWithdrawNegativeNothingHappens_double() {
        // AAA convention
        
        // Arrange - setup required variables for testing
        double initalBalance = 200;
        double expectedBalance = 200;
        double withdrawAmount = -100;
        
        // Act - actually call the code we're testing
        BankAccount testAccount = new BankAccount("testName", initalBalance);
        testAccount.withdraw(withdrawAmount);
        double actualBalance = testAccount.getBalance();
        
        // Assert - did we get what we expected?
         // when comparing doubles, give a delta value ( how close is close enough )
        assertEquals(expectedBalance, actualBalance, .0000001);
        
    }

    @Test
    public void testWithdraw_String() {
        // AAA convention
        
        // Arrange - setup required variables for testing
        double initalBalance = 200;
        double expectedBalance = 100;
        String withdrawAmount = "100";
        
        // Act - actually call the code we're testing
        BankAccount testAccount = new BankAccount("testName", initalBalance);
        testAccount.withdraw(withdrawAmount);
        double actualBalance = testAccount.getBalance();
        
        // Assert - did we get what we expected?
         // when comparing doubles, give a delta value ( how close is close enough )
        assertEquals(expectedBalance, actualBalance, .0000001);
    }

    @Test
    public void testGetName() {
        // AAA convention
        
        // Arrange - setup required variables for testing
        String expectedName = "test account name";
        
        // Act - actually call the code we're testing
        BankAccount testAccount = new BankAccount(expectedName);
        String actualName = testAccount.getName();
        
        // Assert - did we get what we expected?
         // when comparing doubles, give a delta value ( how close is close enough )
        assertEquals(expectedName, actualName);
    }
    
}
