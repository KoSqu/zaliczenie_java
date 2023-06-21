package CalculatorTest;

import Application.Calculator.AdvancedCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private AdvancedCalculator calculator;

    @Before
    public void setUp() {
        calculator = new AdvancedCalculator();
    }

    @Test
    public void testAddition() {
        int result = calculator.add(5, 5);
        assertEquals(10, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        int result = calculator.divide(8, 2);
        assertEquals(4, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }

    @Test
    public void testFactorial() {
        int result = calculator.factorial(5);
        assertEquals(120, result);
    }
}
