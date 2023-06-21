package Application.App;

import Application.Calculator.AdvancedCalculator;
import java.util.Scanner;
/**
 * Klasa kalkulatora
 */
public class App {
    /**
     * Metoda główna uruchamiająca kalkulator
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int num1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int num2 = scanner.nextInt();

        AdvancedCalculator calculator = new AdvancedCalculator();

        System.out.println("Wybierz operację:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Potęgowanie");
        System.out.println("6. Pierwiastek kwadratowy pierwszej liczby");
        System.out.println("7. Silnia pierwszej liczby");
        System.out.print("Twój wybór: ");
        int operation = scanner.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = calculator.add(num1, num2);
                System.out.println("Wynik dodawania: " + result);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                System.out.println("Wynik odejmowania: " + result);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                System.out.println("Wynik mnożenia: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = calculator.divide(num1, num2);
                    System.out.println("Wynik dzielenia: " + result);
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                }
                break;
            case 5:
                result = calculator.power(num1, num2);
                System.out.println("Wynik potęgowania: " + result);
                break;
            case 6:
                result = calculator.squareRoot(num1);
                    System.out.println("Wynik obliczania pierwiastka kwadratowego z pierwszej liczby: " + result);
                break;
            case 7:
                try {
                    result = calculator.factorial(num1);
                    System.out.println("Wynik obliczenia silni pierwszej liczby: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Zły wybór operacji");
                break;
        }
    }
}
