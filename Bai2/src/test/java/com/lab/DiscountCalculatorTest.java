package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {
    @Test
    void testDiscount() {
        DiscountCalculator calc = new DiscountCalculator();
        assertEquals(10.0, calc.calculateDiscount(100));
    }
}
