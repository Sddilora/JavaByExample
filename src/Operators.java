public class Operators {
    public static void main(String[] arguments) {
        int num1 = 5; // 0101 (In Binary)
        int num2 = 7; // 0111 (In Binary)

        // Arithmetic Operators
        // +, -, *, /, %, ++, --

        // Assignment Operators
        // =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=

        // Comparison Operators
        // <, >, <=, >=, ==, !=

        // Logical Operators
        // &&, ||, !

        // Bitwise Operators
        // &, |, ^, ~, <<, >>, >>>

        // Note: For negative bits, the signed and unsigned right shift operators
        // provide different results.

        // Unlike unsigned Right Shift, there is no “<<<” operator in Java because the
        // logical (<<) and arithmetic left-shift (<<<) operations are identical.

        // "&" if both the bits are 1, it gives 1, else it shows 0.
        System.out.println("Bitwise AND: " + (num1 & num2)); // 0101 & 0111 = 0101

        // "|" if either of the bits is 1, it gives 1, else it shows 0.
        System.out.println("Bitwise OR: " + (num1 | num2)); // 0101 | 0111 = 0111

        // "^" if both the bits are different, it gives 1, else it shows 0.
        System.out.println("Bitwise XOR: " + (num1 ^ num2)); // 0101 ^ 0111 = 0010

        // "~" It is a unary operator and operates by reversing the bits. ( 0->1, 1->0)
        System.out.println("Bitwise NOT: " + (~num1)); // ~0101 = 1010

        // "<<" It moves the bits to the left, discards the far left bit, and assigns
        // the rightmost bit a value of 0.
        System.out.println("Bitwise Left Shift: " + (num1 << 2)); // 0101 << 2 = 010100

        // ">>" It moves the bits to the right, discards the far right bit, and assigns
        // the leftmost bit a value of 0.
        System.out.println("Bitwise Right Shift: " + (num1 >> 2)); // 0101 >> 2 = 0001

        // ">>>" It is the same as the signed right shift, but the vacant leftmost
        // position is filled with 0 instead of the sign bit.
        System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 2)); // 0101 >>> 2 = 0001

    }
}
