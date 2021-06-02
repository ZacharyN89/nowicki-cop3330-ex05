import java.util.Scanner;

/*
Exercise 5 - Simple Math

You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:
Example Output

What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints

    Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
    Keep the inputs and outputs separate from the numerical conversions and other processing.
    Generate a single output statement with line breaks in the appropriate spots.

Challenges

    Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
    Don’t allow the user to enter a negative number.
    Break the program into functions that do the computations.
    Implement this program as a GUI program that automatically updates the values when any value changes.

*/
public class ex05 {
    public static void main(String[] args){
        Scanner cursor = new Scanner(System.in);


        System.out.print("What is the first number? ");
        String str1 = cursor.nextLine();
        int num1 = Integer.parseInt(str1);

        System.out.print("What is the second number? ");
        String str2 = cursor.nextLine();
        int num2 = Integer.parseInt(str2);

        int plus = num1 + num2;
        int minus = num1 - num2;
        int times = num1 * num2;
        int divide = num1 / num2;

        System.out.print(
                str1 + " + " + str2 + " = " + plus + "\n" +
                str1 + " - " + str2 + " = " + minus + "\n" +
                str1 + " * " + str2 + " = " + times + "\n" +
                str1 + " / " + str2 + " = " + divide + "\n"
        );
    }
}
