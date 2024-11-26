package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{

    @Test
    public void TestAdd(){
        //Arrange
        Calculator clc = new Calculator();
        int a=3;
        int b=5;

        //Act
        int sonuc = clc.add(a,b);

        //Assert
        assertEquals(8,sonuc);
    }


}