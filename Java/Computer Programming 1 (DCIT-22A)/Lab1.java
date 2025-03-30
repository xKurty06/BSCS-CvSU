import java.util.Scanner;

public class Balboa_lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // This is the part where the user will input 2 numbers
        System.out.println("Enter the first number: ");
        Double num1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        Double num2 = input.nextDouble();

        // This is where the calculations of the variables (2 numbers) happen
        Double sum = num1 + num2;
        Double diff = num1 - num2;
        Double prod = num1 * num2;
        Double quo = num1 / num2;

        // This will be the output of the calculations
        System.out.println("You entered " + num1 + " and " + num2);
        System.out.println("The summation is: " + sum);
        System.out.println("The difference is: " + diff);
        System.out.println("The product is: " + prod);
        System.out.println("The quotient is: " + quo);
    }
}