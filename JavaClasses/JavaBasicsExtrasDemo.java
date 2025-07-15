/*
 * JavaBasicsExtrasDemo
 * --------------------
 * Demonstrates:
 * 1. Types of comments in Java
 * 2. Typecasting (implicit and explicit)
 * 3. Java Strings (creation, concatenation, basic methods)
 */

public class JavaBasicsExtrasDemo {
    public static void main(String[] args) {
        // 1. Types of comments in Java
        // Introduction: Comments are used to explain code and make it more readable.
        // They are ignored by the compiler and do not affect program execution.
        // Java supports three types of comments:
        // - Single-line comments: Start with // and continue to the end of the line.
        // - Multi-line comments: Start with /* and end with */. Can span multiple lines.
        // - Documentation comments: Start with /** and end with */. Used by Javadoc to generate documentation.

        // Single-line comment: This is a single-line comment
        // Useful for brief explanations or notes.

        /*
         * Multi-line comment:
         * This is a multi-line comment.
         * It can span multiple lines.
         * Useful for longer explanations or temporarily disabling code blocks.
         */

        /**
         * Documentation comment:
         * Used to generate documentation for classes, methods, etc.
         * Placed before class, method, or field declarations.
         * Tools like Javadoc use these comments to create HTML documentation.
         */

        // 2. Typecasting
        // Introduction: Typecasting is the process of converting a variable from one data type to another.
        // There are two types of typecasting in Java:
        // - Implicit casting (widening): Automatically done by Java when converting a smaller type to a larger type.
        //   Example: int to double, float to double, etc.
        // - Explicit casting (narrowing): Must be done manually when converting a larger type to a smaller type.
        //   Example: double to int, long to short, etc.
        // Typecasting is important when you need to perform operations between different data types.

        // Implicit casting (widening)
        
        int intVal = 100;
        double doubleVal = intVal; // int to double (automatic)
        System.out.println("Implicit casting (int to double): " + doubleVal);

        // Explicit casting (narrowing)
        double d = 99.99;
        int i = (int) d; // double to int (manual)
        // The fractional part is lost during explicit casting.
        System.out.println("Explicit casting (double to int): " + i);

        // 3. Java Strings
        // Introduction: Strings in Java are objects that represent sequences of characters.
        // Strings are immutable, meaning their values cannot be changed after creation.
        // Java provides the String class with many useful methods for manipulating text.
        // Common operations include creation, concatenation, comparison, and various utility methods.

        // String creation
        String str1 = "Hello"; // String literal (preferred way)
        String str2 = new String("World"); // Using the String constructor (less common)

        // Concatenation
        // You can join strings using the + operator or the concat() method.
        String combined = str1 + " " + str2 + "!";
        System.out.println("Concatenated String: " + combined);

        // String methods
        // length(): Returns the number of characters in the string.
        System.out.println("Length: " + combined.length());
        // toUpperCase(): Converts all characters to uppercase.
        System.out.println("Uppercase: " + combined.toUpperCase());
        // substring(): Extracts a portion of the string.
        System.out.println("Substring: " + combined.substring(0, 5));
        // contains(): Checks if the string contains a specified sequence.
        System.out.println("Contains 'World': " + combined.contains("World"));
    }
}
