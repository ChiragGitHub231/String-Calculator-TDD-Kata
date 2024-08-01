import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.regex.*;

public class StringCalculator {

    // Method to add numbers in the string
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0; // Return 0 for an empty string
        } else if (numbers.length() == 1) {
            int sum = numbers.charAt(0) - '0';
            return sum;
        }

        String delimiter = ",|\n"; // Default delimiters: comma or newline

        // If there is more than 1 number like (1, 2, 3, 4)
        if (numbers.startsWith("//")) {
            Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(numbers);
            if (matcher.matches()) {
                delimiter = Pattern.quote(matcher.group(1)); // Custom delimiter
                numbers = matcher.group(2); // Numbers part
            }
        }

        // Split the numbers using the delimiter
        String[] numberArray = numbers.split(delimiter);
        int sum = 0;
        List<Integer> negativeNumbers = new ArrayList<>();

        for (String number : numberArray) {
            int num = Integer.parseInt(number.trim()); // Convert to integer
            if (num < 0) {
                negativeNumbers.add(num); // Collect negative numbers
            }
            sum += num; // Add the number to the sum
        }

        if (numbers.startsWith("//")) {
            Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(numbers);
            if (matcher.matches()) {
                delimiter = Pattern.quote(matcher.group(1)); // Custom delimiter
                numbers = matcher.group(2); // Numbers part
            }
        }

        // If negative numbers exist, throw an exception
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " +
                    negativeNumbers.toString().replaceAll("[\\[\\]]", ""));
        }

        return sum; // Return the sum of numbers
    }

    // Main method for testing
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();

        // Test cases
        System.out.println(calculator.add("")); // Output: 0
        System.out.println(calculator.add("1")); // Output: 1
        System.out.println(calculator.add("1,5")); // Output: 6
        System.out.println(calculator.add("1,2,3,4,5")); // Output: 15
        System.out.println(calculator.add("1\n2,3")); // Output: 6
        System.out.println(calculator.add("//;\n1;2")); // Output: 3

        // Test case for negative numbers
        try {
            calculator.add("1,-2,3,-4");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Output: Negative numbers not allowed: -2, -4
        }
    }
}
