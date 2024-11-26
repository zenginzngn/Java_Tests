package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    @Test
    public void depositTest() {
        // Arrange
        String accountHolder = "John Doe";
        double initialBalance = 3000;
        BankAccount ba = new BankAccount(accountHolder, initialBalance);

        // Act
        double newBalance = ba.deposit(3000);

        // Assert
        assertEquals(6000, newBalance, 0);
    }

    @Test
    public void withdrawTest() {
        // Arrange
        String accountHolder = "John Doe";
        double initialBalance = 3000;
        BankAccount ba = new BankAccount(accountHolder, initialBalance);

        // Act
        double newBalance = ba.withdraw(1000);

        // Assert
        assertEquals(2000, newBalance, 0);
    }
}
