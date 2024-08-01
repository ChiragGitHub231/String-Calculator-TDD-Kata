# String-Calcutor-TDD-Kata

## Program Description

### Create a simple String calculator with a method signature like this:

int add(string numbers)

Input: a string of comma-separated numbers

Output: an integer, sum of the numbers

### Examples:

Input: “”, Output: 0

Input: “1”, Output: 1

Input: “1,5”, Output: 6

-> Allow the add method to handle any amount of numbers.

-> Allow the add method to handle new lines between numbers (instead of commas). ("1\n2,3" should return 6)

### Support different delimiters:

To change the delimiter, the beginning of the string will contain a separate line that looks like this: "//[delimiter]\n[numbers…]". For example, "//;\n1;2" where the delimiter is ";" should return 3.
Calling add with a negative number will throw an exception: "negative numbers not allowed <negative_number>".

If there are multiple negative numbers, show all of them in the exception message, separated by commas.

## How to Run the Program?

-> Fork the repository

-> In src/main folder, there is one java file named StringCalculator.java, Compile it using javac StringCalculator.java command.

-> After compiling then the run the java file by java StringCalculator

-> Now to test the testcases go inside src/test folder, you will see StringCalculatorTest.java file which contains some testcases written for the code.

-> To compile the file move to the root folder of project and write the below command

-> For Compilation:- javac -d bin -cp "lib/*" src/main/StringCalculator.java src/test/StringCalculatorTest.java

-> For Execution:- java -cp "lib/*;bin" org.junit.runner.JUnitCore StringCalculatorTest

-> Once you compile and run the java file it will execute the test file.
