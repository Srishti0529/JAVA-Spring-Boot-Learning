package com.srishti_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App calc = new App();

    @Test
    void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(4, 0));
    }
}