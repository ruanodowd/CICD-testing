package org.ruan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testCalc(){
        assertEquals(4,Calculator.add(2,2));
    }
}