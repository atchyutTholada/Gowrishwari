/*
 * FunctionsDemo
 * -------------
 * Shows how to use functions (methods) in Java with simple examples.
 *
 * Definition:
 * A function (called a "method" in Java) is a block of code that does 
 * a specific job.
 * You can call a function whenever you want to use that job.
 * Functions help you organize your code and avoid repeating yourself.
 */

public class FunctionsDemo {
    // This is a function (method) that prints a greeting to the screen.
    // It does not take any input and does not return anything.
    public static void sayHello() {
        System.out.println("Hello!");
    }

    // This function takes two numbers as input and returns their sum.
    // The 'int' before the name means it returns an integer value.
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static float addfloat(float a, float b)
    {
        return a+b;
    }

    // This function checks if a number is even.
    // It returns true if the number is even, false otherwise.
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Calling a function that prints a greeting
        sayHello();

        float floatSum = addfloat(2.5f, 3.5f);
        System.out.println("Sum of 2.5 and 3.5 is: " + floatSum);

        // Calling a function with arguments and using the result
        int sum = addNumbers(5, 3); // Adds 5 and 3
        System.out.println("Sum of 5 and 3 is: " + sum);

        // Using a function that returns true or false
        int num = 6;
        // Checks if num is even and prints the result
        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

}
