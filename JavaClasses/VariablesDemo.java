/*
 * Variables in Java
 * -----------------
 * A variable is a container that holds data that can be changed during the execution of a program.
 * Variables have a name (identifier), a type, and a value.

 *
 * Types of variables in Java:
 * 1. Local Variables: Declared inside methods, constructors, or blocks. Only accessible within that scope.
 * 2. Instance Variables: Declared inside a class but outside any method. Each object has its own copy.
 * 3. Static Variables: Declared with the static keyword in a class. Shared among all objects of the class.
 *
 * Variable Declaration Syntax:
 *   type variableName = value;
 * Example: int age = 25;
 */

// Java class demonstrating variables
public class VariablesDemo {
    public static void main(String[] args) {
        
        // Declaration and initialization of variables
        int age = 25; // integer variable
        double salary = 50000.50; // double variable
        char grade = 'A'; // character variable
        boolean isEmployed = true; // boolean variable
        String name = "John"; // String (reference type) variable

        // Printing variable values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);

        // Variable reassignment
        age = 30;
        salary = 60000.75;
        name = "Alice";
        System.out.println("Updated Name: " + name);
        System.out.println("Updated Age: " + age);
        System.out.println("Updated Salary: " + salary);

       
    }
}
