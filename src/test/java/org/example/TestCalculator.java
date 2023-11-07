package org.example;

import org.junit.Test;
import org.example.Calculator;


import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test
    public void testAdd() throws Exception{
        Calculator calculator  = new Calculator();
        int add = calculator.add(3,4);
        assertEquals(7, add);

    }
}