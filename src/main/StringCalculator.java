public class StringCalculator {

    // Method to add numbers in the string
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0; // Return 0 for an empty string
        } else if (numbers.length() == 1) {
            int sum = numbers.charAt(0) - '0';
            return sum;
        }
        // If there is more than 1 number like (1, 2, 3, 4)
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) - '0' >= 0 && numbers.charAt(i) - '0' <= 9) {
                sum += numbers.charAt(i) - '0';
            }
        }
        return sum;
    }

    // Main method for testing
    public static void main(String[] args) {

    }
}
