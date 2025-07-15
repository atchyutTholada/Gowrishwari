/*
 * MathMethodsDemo
 * ---------------
 * Shows how to use some common Math methods in Java with simple examples.
 */

public class MathMethodsDemo {
    public static void main(String[] args) {
        // Math.abs: Absolute value (always positive)
        int negative = -10;
        System.out.println("Absolute value of -10: " + Math.abs(negative));

        // Math.max and Math.min: Find the biggest or smallest number
        int a = 5, b = 8;
        System.out.println("Max of 5 and 8: " + Math.max(a, b));
        System.out.println("Min of 5 and 8: " + Math.min(a, b));

        // Math.sqrt: Square root
        System.out.println("Square root of 16: " + Math.sqrt(16));

        // Math.pow: Power (x to the power y)
        System.out.println("2 to the power 3: " + Math.pow(2, 3));

        // Math.round, Math.ceil, Math.floor: Rounding numbers
        double num = 5.3;
        System.out.println("Round 5.7: " + Math.round(num));
        System.out.println("Ceil of 5.2: " + Math.ceil(5.2));   // next whole number up
        System.out.println("Floor of 5.8: " + Math.floor(5.8)); // next whole number down

        // Math.random: Random number between 0.0 and 1.0
        System.out.println("Random number (0.0 to 1.0): " + Math.random());

        // Math.PI and Math.E: Special numbers
        System.out.println("Value of PI: " + Math.PI);
        System.out.println("Value of E: " + Math.E);
    }
}
