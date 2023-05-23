package homeworkwk3;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme12 {
    public static void main(String[] args) {
        Programme12 inputNumAlphaSymbol_pro12 = new Programme12();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter input value is number");
        int number = scan.nextInt();

        System.out.println("Enter input Any Alphabet:");
        String alphabets = scan.next();

        System.out.println("Enter input Any Symbol:");
        String symbol = scan.next();
        //inputNumAlphaSymbol_pro12.printAlphaSymbol(number + alphabets + symbol);

    }
}
