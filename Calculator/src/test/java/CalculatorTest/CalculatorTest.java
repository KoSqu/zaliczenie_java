package CalculatorTest;

import Application.Calculator.AdvancedCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Klasa CalculatorTest zawiera testy
 */
public class CalculatorTest {

    private AdvancedCalculator calculator;

    /**
     * Inicjalizuje AdvancedCalculator
     */
    @Before
    public void setUp() {
        calculator = new AdvancedCalculator();
    }

    /**
     * Testuje dodawanie dwóch liczb
     */
    @Test
    public void testAddition() {
        double result = calculator.add(5, 5);
        assertEquals(10, result, 0);
    }

    /**
     * Testuje odejmowanie dwóch liczb
     */
    @Test
    public void testSubtraction() {
        double result = calculator.subtract(5, 3);
        assertEquals(2, result, 0);
    }

    /**
     * Testuje mnożenie dwóch liczb
     */
    @Test
    public void testMultiplication() {
        double result = calculator.multiply(3, 4);
        assertEquals(12, result, 0);
    }

    /**
     * Testuje dzielenie dwóch liczb
     */
    @Test
    public void testDivision() {
        double result = calculator.divide(8, 2);
        assertEquals(4, result, 0);
    }

    /**
     * Testuje dzielenie przez zero
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }

    /**
     * Testuje obliczanie silni liczby
     */
    @Test
    public void testFactorial() {
        int result = calculator.factorial(5);
        assertEquals(120, result);
    }
}
