//asks the user to input a temperature in degrees Celsius, and converts it to Fahrenheit.

import java.util.Scanner;

class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        // prints out what the program does
        System.out.println("\nThis program converts a temperature in degrees Celsius into a");
        System.out.println("temperature in degrees Fahrenheit.  Enter a temperature in");
        System.out.println("degrees Celsius: ");

        // get input from user
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        input.close();

        // convert the temperature from celsius to fahrenheit
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        // 43.00 degrees Celsius is equal to 110.3 degrees Fahrenheit.
        System.out.format("\n %5.2f degrees Celsius is equal to %5.2f degrees Fahrenheit.\n", celsius, fahrenheit);

        System.out.println("\n Goodbye");
    }
}