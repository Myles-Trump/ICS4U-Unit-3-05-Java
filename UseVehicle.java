/*
* The "UseVehicle" program lets the user use their vehicle
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-22
*/

import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class UseVehicle {

    /**
    * 3.
    */
    public static final int C3 = 3;

    /**
    * 4.
    */
    public static final int C4 = 4;

    /**
    * 5.
    */
    public static final int C5 = 5;

    /**
    * 6.
    */
    public static final int C6 = 6;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private UseVehicle() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        MrCoxallStack stackVariable = new MrCoxallStack();
        int userChoice = 0;

        while (userChoice != C6) {
            final Scanner userInput = new Scanner(System.in);
            try {
                System.out.print("Would you like to (input 1) add an integer ");
                System.out.print("to the stack, (input 2) remove an integer ");
                System.out.print("from the stack, (input 3) check the stack,");
                System.out.print(" (input 4) peek at the top integer, (input ");
                System.out.print("5) clear the stack, or (input 6) exit?: ");
                userChoice = userInput.nextInt();

                switch (userChoice) {
                    case 1:
                        final Scanner userInt = new Scanner(System.in);
                        System.out.print("\nEnter an integer to add: ");
                        int userAddition = userInt.nextInt();
                        stackVariable.push(userAddition);
                        break;

                    case 2:
                        stackVariable.pop();
                        break;

                    case C3:
                        System.out.print("\n");
                        stackVariable.showStack();
                        break;

                    case C4:
                        System.out.print("\n");
                        stackVariable.peek();
                        break;

                    case C5:
                        stackVariable.clear();
                        System.out.println("\nStack cleared!\n");
                        break;

                    case C6:
                        break;

                    default:
                        System.out.print("\nYou have entered an invalid ");
                        System.out.println("integer");
                        break;
                }

            } catch (java.util.InputMismatchException errorCode) {
                System.out.println("\nYou have not entered a valid input.");
            }
        }
        System.out.println("\nDone.");
    }
}
