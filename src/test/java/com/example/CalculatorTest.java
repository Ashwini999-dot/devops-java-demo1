package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        int result = Calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }
}
