import java.util.Scanner;

class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("What is the Tempature in Cecials?: ");
                double celsius = Double.parseDouble(scanner.nextLine());
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf("Temperature %.2f°C is %.2f°F.%n", celsius, fahrenheit);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for temperature.");
            }
        }

        scanner.close();
    }
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }


}
