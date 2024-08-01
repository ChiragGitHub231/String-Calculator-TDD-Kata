public class StringCalculator {

    // Method to add numbers in the string
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0; // Return 0 for an empty string
        }
        int sum = numbers.charAt(0) - '0';
        return sum;
    }

    // Main method for testing
    public static void main(String[] args) {

    }
}
