/*
 * ArrayExamplesDemo
 * -----------------
 * Shows how to use 1D and 2D arrays in Java with simple examples.
 */

public class ArrayExamplesDemo {
    public static void main(String[] args) {
        // 1. One Dimensional Array (1D Array)
        // Definition: A 1D array is like a row of boxes, where each box can store a value.
        // You can use it to keep a list of numbers, like your test scores or ages of friends.
        // Imagine a row of boxes, each box can hold a number.
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("1D Array: " + numbers[0] + ", " + numbers);
        System.out.println("1D Array Example:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Box " + i + " has: " + numbers[i]);
        }

        // 2. Two Dimensional Array (2D Array)
        // Definition: A 2D array is like a table or a grid, with rows and columns.
        // You can use it to keep things like a tic-tac-toe board or a classroom seating chart.
        // Imagine a grid or table, like a tic-tac-toe board.
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("\n2D Array Example:");
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        // Fun: Accessing a specific element
        System.out.println("\nThe number in row 2, column 3 is: " + grid[1][2]);
    }
}
