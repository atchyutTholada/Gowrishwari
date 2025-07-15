/*
 * SwitchDemo
 * ----------
 * Shows how to use the switch statement in Java with simple examples.
 */

public class SwitchDemo {
    public static void main(String[] args) {
        // Switch statement lets you choose between many options
        int day = 2;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Unknown day";
        }

        System.out.println("Day " + day + " is " + dayName);

        // Switch with characters
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("You can do better.");
                break;
            default:
                System.out.println("Grade not recognized.");
        }
    }
}
