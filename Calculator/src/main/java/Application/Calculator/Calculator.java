package Application.Calculator;

/**
 * Klasa Calculator z prostymi operacjami
 */
public class Calculator {
    /**
     * Dodaje dwie liczby
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return suma dwóch liczb
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Odejmuje drugą liczbę od pierwszej liczby
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return różnica dwóch liczb
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Mnożenie dwóch liczb
     *
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return iloczyn dwóch liczb
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Dzieli pierwszą liczbę przez drugą liczbę
     *
     * @param a dzielna
     * @param b dzielnik
     * @return wynik dzielenia dwóch liczb
     * @throws IllegalArgumentException jeśli dzielnik wynosi zero
     */
    public double divide(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Nie można dzielić przez zero!");
        }
        return a / b;
    }
}
