package Application.Calculator;
/**
 * Klasa AdvancedCalculator rozszerza klase Calculator i dodaje nowe funkcje
 */
public class AdvancedCalculator extends Calculator {

    /**
     * Potęga liczby podniesionej do określonego wykładnika
     *
     * @param base     podstawa potęgi
     * @param exponent wykładnik potęgi
     * @return wynik potęgowania
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    /**
     * Silnia danej liczby.
     *
     * @param number liczba, dla której obliczana jest silnia
     * @return wynik silni
     * @throws IllegalArgumentException jeśli liczba jest ujemna
     */
    public int factorial(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Liczba musi być nieujemna");
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
    /**
     * Pierwiastek kwadratowy z danej liczby
     *
     * @param number liczba, dla której obliczany jest pierwiastek kwadratowy
     * @return wynik pierwiastkowania
     * @throws IllegalArgumentException jeśli liczba jest ujemna
     */
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Liczba musi być nieujemna");
        }

        return Math.sqrt(number);
    }
}
