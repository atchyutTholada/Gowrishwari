/*
 * Operators in Java
 * ------------------
 * Operators are special symbols that perform operations on operands (variables and values).
 * Java provides many types of operators to perform different kinds of operations.
 *
 * Types of Operators in Java:
 * 1. Arithmetic Operators: +, -, *, /, %
 * 2. Assignment Operators: =, +=, -=, *=, /=, %=
 * 3. Comparison (Relational) Operators: ==, !=, >, <, >=, <=
 * 4. Logical Operators: &&, ||, !
 * 5. Increment/Decrement Operators: ++, --
 * 6. Conditional (Ternary) Operator:(a!=b) ? a : b
 * 7. Bitwise Operators: &, |, ^, ~, <<, >>, >>>
 *
 * Example: int sum = a + b;
 */

// Java class demonstrating operators
public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Assignment Operators
        int x = 7;
        x += 3; // x = x + 3
        System.out.println("x after += 3: " + x);
        x *= 2; // x = x * 2
        System.out.println("x after *= 2: " + x);

        // Comparison Operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        // Logical Operators
        a = 10;
        b = 5;
        boolean result = (a > 5) && (b < 10);
        System.out.println("(a > 5) && (b < 10): " + result);
        result = (a < 5) || (b < 10);
        System.out.println("(a < 5) || (b < 10): " + result);
        result = !(a == b);
        System.out.println("!(a == b): " + result);

        // Increment/Decrement Operators
        int y = 5;
        System.out.println("y before increment: " + y);
        y++;
        System.out.println("y after increment: " + y);
        y--;
        System.out.println("y after decrement: " + y);

        // Conditional (Ternary) Operator
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);
    }
}
