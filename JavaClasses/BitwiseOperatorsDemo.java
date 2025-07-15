/*
 * Bitwise Operators Explained Simply
 * ----------------------------------
 * Bitwise operators work with the individual bits (0s and 1s) of numbers.
 * Let's see each operator with a simple explanation and example:
 *
 * 1. & (Bitwise AND):
 *    Compares each bit of two numbers. If both bits are 1, the result is 1; otherwise, it's 0.
 *    Example: 5 & 3
 *      5: 0101 (2^2 + 2^0 = 4 + 1 = 5)
 *      3: 0011 (2^1 + 2^0 = 2 + 1 = 3)
 *      Result: 0001 (2^0 = 1)
 *
 * 2. | (Bitwise OR):
 *    Compares each bit of two numbers. If at least one bit is 1, the result is 1.
 *    Example: 5 | 3
 *      5: 0101 (2^2 + 2^0 = 4 + 1 = 5)
 *      3: 0011 (2^1 + 2^0 = 2 + 1 = 3)
 *      Result: 0111 (2^2 + 2^1 + 2^0 = 4 + 2 + 1 = 7)
 *
 * 3. ^ (Bitwise XOR):
 *    Compares each bit of two numbers. If the bits are different, 
      the result is 1; if the same, it's 0.
 *    Example: 5 ^ 3
 *      5: 0101 (2^2 + 2^0 = 4 + 1 = 5)
 *      3: 0011 (2^1 + 2^0 = 2 + 1 = 3)
 *      Result: 0110 (2^2 + 2^1 = 4 + 2 = 6)
 *
 * 4. ~ (Bitwise NOT):
 *    Flips every bit of the number. 1 becomes 0, 0 becomes 1.
 *    Example: ~5
 *      5:  0000 0101 (2^2 + 2^0 = 4 + 1 = 5)
 *      ~5: 1111 1010 (which is -6 in Java)
 *
 * 5. << (Left Shift):
 *    Moves all bits to the left by a certain number of places. Each left shift multiplies the number by 2.
 *    Example: 5 << 1
 *      5: 0101.0 (2^2 + 2^0 = 4 + 1 = 5)
 *      Result: 1010 (2^3 + 2^1 = 8 + 2 = 10)
 *
 * 6. >> (Right Shift):
 *    Moves all bits to the right. Each right shift divides the number by 2 (and keeps the sign for negatives).
 *    Example: 5 >> 1
 *      5: 010 (2^2 + 2^0 = 4 + 1 = 5)
 *      Result: 0010 (2^1 = 2)
 */
 /*
 * Bitwise Operators in Java
 * ------------------------
 * Bitwise operators perform operations on individual bits of integer types.
 *
 * Types of Bitwise Operators:
 * &  (AND)
 * |  (OR)
 * ^  (XOR)
 * ~  (NOT)
 * << (Left Shift)
 * >> (Right Shift)
 

// Java class demonstrating bitwise operators
public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;   // 0101 in binary
        int b = 3;   // 0011 in binary

        // Bitwise AND
        System.out.println("a & b = " + (a & b)); // 0101 & 0011 = 0001 (1)

        // Bitwise OR
        System.out.println("a | b = " + (a | b)); // 0101 | 0011 = 0111 (7)

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b)); // 0101 ^ 0011 = 0110 (6)

        // Bitwise NOT
        System.out.println("~a = " + (~a)); // ~0101 = 1010 (in 32-bit: -6)

        // Left Shift
        System.out.println("a << 1 = " + (a << 1)); // 0101 << 1 = 1010 (10)

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 >> 1 = 0010 (2)

    }
}
