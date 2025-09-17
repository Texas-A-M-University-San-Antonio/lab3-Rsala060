/**
 * * Name: Rey Salazar
 * Date: 16-September-2025
 * Purpose: Lab 3 -
 * // This Program will solve for compound interest
 */

 import java.util.Scanner; // Import Scanner class for users input

 public class Lab3_Rey_Salazar
 {
    public static void main(String[] args)
    {
        // 1. Create a Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        // 2. Declare variables 
        double initialValue; // initial value of the home
        int years; // number of elapsed years
        double interestRate; // interest rate (percentage from user)
        double finalValue; // final value of the home

        // 3. Prompt user for inputs
        System.out.println("Please enter the initial value of the home: ");
        initialValue = input.nextDouble();

        System.out.println("Please enter the number of elapsed years: ");
        years = input.nextInt();

        System.out.println("Please enter the interest rate: ");
        interestRate = input.nextDouble();

        // 4. Convert percentage to decimal 
        interestRate = interestRate / 100;

        // 5. Calculate final value using compound interest formula
        finalValue = initialValue * Math.pow((1 + interestRate), years);

        //6. Display the result to the user
        System.out.println("The final value of the home is; " + finalValue);
    }
 }