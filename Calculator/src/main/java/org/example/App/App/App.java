package org.example.App.App;

import org.example.App.Calculator.Calculator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int num1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator();

        System.out.println("Wybierz operację:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.print("Twój wybór: ");
        int operation = scanner.nextInt();

        int result = 0;

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
            default:
                System.out.println("Nieprawidłowy wybór operacji.");
                break;
        }
    }
}
