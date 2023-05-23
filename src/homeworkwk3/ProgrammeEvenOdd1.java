package homeworkwk3;

import java.util.Scanner;

/**Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)
 */

public class ProgrammeEvenOdd1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
          int number= sc.nextInt();
          // ternary operator to check number
        String Result = number % 2 == 0 ? "Even" : "odd";
        System.out.println(number + "is"+Result);

    }
}
