/*
 * BooleansDemo
 * ------------
 * Shows how to use booleans in Java with simple examples.
 */

public class BooleansDemo {
    public static void main(String[] args) {
        // Definition: A boolean is a type that can only be true or false.
        boolean isSunny = true;
        boolean isRaining = false;

        System.out.println("Is it sunny? " + isSunny);
        System.out.println("Is it raining? " + isRaining);

        // Booleans are often used in conditions
        int age = 12;
        boolean isChild = age < 18;
        System.out.println("Is age less than 18? " + isChild);

        // You can change the value
        isSunny = false;
        isRaining = true;
        System.out.println("Now, is it sunny? " + isSunny);
        System.out.println("Now, is it raining? " + isRaining);
    }
}
