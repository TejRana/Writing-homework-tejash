package homework_week_1;
/**
 * Write java program that takes two numbers as input
 and display the
 * Product of two numbers.
 * Test data :
 * Input first number :25
 * Input second number :5
 * Expected output :25 * 5 =125
 */
public class Programme_10_ProductOfTwoNumbers {
    public static void main (String[]args){
        // First number declaration
        int firstNumber = 25;
        // Second number declaration
        int secondNumber = 5;
        int produced = firstNumber * secondNumber;
        // Expected Output
        System.out.println(firstNumber + " x " + secondNumber + " = " + produced);
    }
}
