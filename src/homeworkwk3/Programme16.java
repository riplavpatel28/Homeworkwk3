package homeworkwk3;
/**Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 “ZERO”
 */

import java.util.Scanner;

public class Programme16 {

        public static void positiveNegative() {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Input a number : ");
            int num = sc.nextInt();
            if (num > 0)
            {
                System.out.println(" Number is positive ");
            }
            else if (num < 0)
            {
                System.out.println(" Number is negative ");
            }
            else {
                System.out.println(" Number is zero");
            }
        }

        public static void main(String[] args) {
            positiveNegative();
        }

    }


