import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getIntegerInput("Enter your choice: ");
            switch (choice) {
                case 1:
                    convertCurrency();
                    break;
                case 2:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nCurrency Converter");
        System.out.println("1. Convert Currency");
        System.out.println("2. Exit");
    }

    private static int getIntegerInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Clear invalid input
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    private static double getDoubleInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Clear invalid input
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private static void convertCurrency() {
        String fromCurrency = getCurrencyInput("Enter source currency (SEK, USD, EUR): ");
        String toCurrency = getCurrencyInput("Enter target currency (SEK, USD, EUR): ");
        double amount = getDoubleInput("Enter amount to convert: ");

        // Validate currencies (can be extended for more currencies)
        if (!isValidCurrency(fromCurrency) || !isValidCurrency(toCurrency)) {
            System.out.println("Invalid currency code. Please try again.");
            return;
        }

        // Predefined exchange rates (replace with actual rate fetching logic)
        double exchangeRate = getExchangeRate(fromCurrency, toCurrency);

        double convertedAmount = amount * exchangeRate;
        System.out.printf("\nSuccessfully converted on %s:\n", LocalDateTime.now());
        System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
    }

    private static boolean isValidCurrency(String currency) {
        return currency.equals("SEK") || currency.equals("USD") || currency.equals("EUR");
    }

    private static double getExchangeRate(String fromCurrency, String toCurrency) {
        // Replace with logic to fetch actual exchange rates from an API or database
        // Here's a sample structure for predefined rates
        double[][] rates = {
                {1.0, 0.95, 0.88}, // SEK rates
                {1.05, 1.0, 0.93}, // USD rates
                {1.14, 1.07, 1.0}  // EUR rates
        };

        int fromIndex = getCurrencyIndex(fromCurrency);
        int toIndex = getCurrencyIndex(toCurrency);
        return rates[fromIndex][toIndex];
    }

    private static int getCurrencyIndex(String currency) {
        switch (currency) {
            case "SEK":
                return 0;
            case "USD":
                return 1;
            case "EUR":
                return 2;
            default:
                return -1; // Should not happen if validation is done earlier
        }
    }
}
