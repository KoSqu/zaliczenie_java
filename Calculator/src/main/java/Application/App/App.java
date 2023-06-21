package Application.App;

import Application.Calculator.AdvancedCalculator;
import java.util.Scanner;
/**
 * Klasa kalkulatora
 */
public class App {

    /**
     * Metoda główna uruchamiająca kalkulator
    /**
    
     * Podanie dwóch liczb przez użytkownika i wybranie działani
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double num1 = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double num2 = scanner.nextDouble();

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

        double result;

        switch (operation) {
            case 1 -> {
                result = calculator.add(num1, num2);
                System.out.println("Wynik dodawania: " + result);
            }
            case 2 -> {
                result = calculator.subtract(num1, num2);
                System.out.println("Wynik odejmowania: " + result);
            }
            case 3 -> {
                result = calculator.multiply(num1, num2);
                System.out.println("Wynik mnożenia: " + result);
            }
            case 4 -> {
                if (num2 != 0) {
                    result = calculator.divide(num1, num2);
                    System.out.println("Wynik dzielenia: " + result);
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                }
            }
            case 5 -> {
                result = calculator.power(num1, num2);
                System.out.println("Wynik potęgowania: " + result);
            }
            case 6 -> {
                result = calculator.squareRoot(num1);
                System.out.println("Wynik obliczania pierwiastka kwadratowego z pierwszej liczby: " + result);
            }
            case 7 -> {
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
            default -> System.out.println("Nieprawidłowy wybór operacji.");

        }
    }
}
