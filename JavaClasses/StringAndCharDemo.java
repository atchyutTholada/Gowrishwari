/*
 * StringAndCharDemo
 * -----------------
 * Shows how to use Strings and Characters in Java with simple examples.
 */

public class StringAndCharDemo {
    public static void main(String[] args) {
        // 1. Characters in Java
        // Definition: A character (char) is a single letter, number, or symbol.
        // Example: 'A', 'b', '7', '$'
        char letter = 'A';
        char number = '7';
        char symbol = '$';
        System.out.println("Characters:");
        System.out.println("Letter: " + letter);
        System.out.println("Number: " + number);
        System.out.println("Symbol: " + symbol);

        // 2. Strings in Java
        // Definition: A String is a group of characters, like a word or a sentence.
        // Example: "Hello", "Java is fun!"
        String word = "Hello";
        String sentence = "Java is fun!";
        System.out.println("\nStrings:");
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);

        // 3. String operations
        // You can join (concatenate) strings using + 
        String name = "Sam";
        String greeting = "Hi, " + name + "!";
        System.out.println("\nGreeting: " + greeting);

        // You can find out how many letters are in a string
        System.out.println("The word '" + word + "' has " + word.length() + " letters.");

        // You can get a single character from a string
        System.out.println("The first letter of '" + word + "' is: " + word.charAt(0));

        // More String methods
        System.out.println("\n--- String Methods ---");
        String str = "Hello World";
        System.out.println("Original: " + str);
        System.out.println("Length: " + str.length()); // number of characters
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("First 5 letters: " + str.substring(0, 5));
        System.out.println("Does it contain 'World'? " + str.contains("World"));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println("Starts with 'Hello'? " + str.startsWith("Hello"));
        System.out.println("Ends with 'ld'? " + str.endsWith("ld"));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Is it empty? " + str.isEmpty());
        System.out.println("Trim spaces: '" + "   hi   ".trim() + "'");

        // More Character methods
        System.out.println("\n--- Character Methods ---");
        char ch = 'a';
        System.out.println("Character: " + ch);
        System.out.println("Is letter? " + Character.isLetter(ch));
        System.out.println("Is digit? " + Character.isDigit(ch));
        System.out.println("Is uppercase? " + Character.isUpperCase(ch));
        System.out.println("Is lowercase? " + Character.isLowerCase(ch));
        System.out.println("To uppercase: " + Character.toUpperCase(ch));
        System.out.println("To lowercase: " + Character.toLowerCase('B'));
        System.out.println("Is whitespace? " + Character.isWhitespace(' '));
    }
}
