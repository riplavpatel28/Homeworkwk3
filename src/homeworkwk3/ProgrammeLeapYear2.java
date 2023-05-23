package homeworkwk3;

import java.util.Scanner;

/**Write a java program to input any year like (ex.2007) and find out if it is leap year or
 not?
  */

public class ProgrammeLeapYear2 {
    public static void main(String[] args) {
        ProgrammeLeapYear2 obj = new ProgrammeLeapYear2();
        obj.leapYearOrNot();
    }

    public void leapYearOrNot() {//instance method
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Year to test=");
        int leapYear = scan.nextInt();
        boolean isLeapYear = ((leapYear % 4 == 0) && (leapYear % 100 != 0 ))|| (leapYear % 400 ==0);

        if(isLeapYear){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
        //String result = isLeapYear ? "Leap Year" : "Not Leap Year";
        //System.out.println(leapYear + " is " + result);

    }
        }







