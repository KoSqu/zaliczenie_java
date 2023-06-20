package Application.Calculator;

public class AdvancedCalculator extends Calculator {

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Liczba musi być nieujemna.");
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Liczba musi być nieujemna.");
        }

        return Math.sqrt(number);
    }
}
