package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShoppingCartTest {

    @Test
    public void addItemTest(){
        //Arrange
        ShoppingCart sc =new ShoppingCart();
        String item = "Table";
        String item2 = "Chair";
        //Act
        sc.addItem(item);
        sc.addItem(item2);
        //Assert
        assertEquals(2,sc.getItemCount());
        assertTrue(sc.containsItem(item));
        assertTrue(sc.containsItem(item2));
    }

    @Test
    public void removeItemTest(){
        //Arrange
        ShoppingCart sc =new ShoppingCart();
        String item = "Table";
        String item2 = "Chair";
        //Act
        sc.addItem(item);
        sc.addItem(item2);
        sc.removeItem(item);
        //Assert
        assertEquals(1,sc.getItemCount());
        assertTrue(sc.containsItem(item2));
        assertFalse(sc.containsItem(item));
    }



}
