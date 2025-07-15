/*
 * Control Flow Statements in Java
 * ------------------------------
 * Control flow statements allow you to control the order in which statements are executed in a program.
 * They are essential for making decisions and repeating actions.
 *
 * Types of Control Flow Statements:
 * 1. Conditional Statements: if, if-else, else-if, switch
 * 2. Looping Statements: for, while, do-while
 * 3. Jump Statements: break, continue, return
 *
 * Example: if (a > b) { ... }
 */

// Java class demonstrating control flow statements
public class ControlFlowDemo {
    public static void main(String[] args) {
        int number = 7;

        // if-else statement
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // else-if ladder
        int marks = 55;
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or below");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day");
        }

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("for loop iteration: " + i);
        }

        // while loop
        int count = 2;
        while (count <= 3) {
            System.out.println("while loop count: " + count);
            count++;
        }

        // do-while loop
        int n = 1;
        do {
            System.out.println("do-while loop n: " + n);
            n++;
        } while (n <= 2);

        // break and continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // skip 3
            if (i == 5) break;    // stop at 5
            System.out.println("break/continue example: " + i);
        }
    }
}
