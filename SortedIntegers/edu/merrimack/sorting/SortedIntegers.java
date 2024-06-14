package edu.merrimack.sorting;

import java.util.*;

/**
 * The SortedIntegers program implements an application that reads a list of
 * Integer numbers
 * from the scanned input and saves them into a LinkedList sorted from the
 * smallest to the largest.
 * It uses the Collections Framework of Java.
 * 
 * The program follows these steps:
 * 1. Prompts the user to enter numbers one at a time.
 * 2. Reads the user's input.
 * 3. If the input is an integer, adds it to a LinkedList.
 * 4. If the input is an empty line, stops reading input.
 * 5. Sorts the LinkedList.
 * 6. Prints the sorted list.
 * 
 * @author Muhammad Ali
 * @version 1.0
 */
public class SortedIntegers {
    /**
     * Default constructor.
     */
    public SortedIntegers() {
        // Default constructor
    }

    /**
     * The main method that drives the program. It does the following:
     * <ul>
     * <li>Creates a Scanner object for reading input</li>
     * <li>Creates a LinkedList for storing the integers</li>
     * <li>Prompts the user to enter numbers one at a time</li>
     * <li>Reads integers until an empty line is entered</li>
     * <li>Tries to parse the input as an integer and add it to the list</li>
     * <li>If the input is not a valid integer, prints an error message and
     * continues to the next iteration</li>
     * <li>Sorts the list</li>
     * <li>Outputs the sorted list</li>
     * <li>Closes the scanner</li>
     * </ul>
     *
     * @param args Command-line arguments passed to the program. This program does
     *             not use command-line arguments.
     */
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        // Create a LinkedList for storing the integers
        List<Integer> list = new LinkedList<>();

        // Prompt the user to enter numbers
        System.out.println("Please enter numbers one at a time. When done, just hit enter without a number:");

        // Read integers until an empty line is entered
        while (true) {
            // Read the next line of input
            String input = scanner.nextLine();
            // If the input is an empty line, stop reading input
            if (input.isEmpty()) {
                break;
            }

            // Try to parse the input as an integer and add it to the list
            try {
                int number = Integer.parseInt(input);
                list.add(number);
            } catch (NumberFormatException e) {
                // If the input is not a valid integer, print an error message and continue to
                // the next iteration
                System.out.println("Invalid input entered. Please enter an integer.");
                continue;
            }
        }

        // Sort the list
        Collections.sort(list);

        // Output the sorted list
        System.out.println("Sorted list: " + list);

        // Close the scanner
        scanner.close();
    }
}