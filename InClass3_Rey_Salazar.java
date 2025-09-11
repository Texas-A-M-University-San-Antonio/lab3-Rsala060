/**
 * Name: Rey Salazar
 * Date: 10-September-2025
* Purpose: InClass 3 - 
* [Write a description about this InClass 3 program]
 */

import java.util.Scanner; // Don't forget to import and declar a Scanner 

public class InClass3_Rey_Salazar
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); 
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        double side, volume, surfaceArea; // declare these variables as double


        // Step 2: Read the user's input and store it in a variable.
        System.out.println("Please enter the length of the side of the cube: "); // prompt user to enter the lenghth of the side of the cube
        side = input.nextDouble();


        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side, 3);

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        surfaceArea =6 * Math.pow(side, 2);

        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method

        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume of the cube is " + volume);
        System.out.println("The surface area of the cube is" + surfaceArea);
    }
}