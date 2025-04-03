import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform addition
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Perform multiplication
        int product = num1 * num2;

       // Display the multiplication result
       System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);


        // Close the scanner
        scanner.close();
    }
}

