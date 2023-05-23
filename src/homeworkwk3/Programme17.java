package homeworkwk3;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Programme17 {
    public static void main(String[] args) {
        Programme17 sortProg17 = new Programme17();
        sortProg17.sortNumberic();
        sortProg17.sortString();
    }

    private void sortString() {
        String[] stringsArray = {"C", "D", "A", "E", "B"};
        Arrays.sort(stringsArray);

        System.out.println("Sorted String Array ");
        for (String temp : stringsArray) {
            System.out.println(temp);
        }
    }

    private void sortNumberic() {

        int[] numericArray = {5, 4, 1, 2, 3};
        Arrays.sort(numericArray);

        System.out.println("Sorted Numeric Array ");
        for (int temp : numericArray) {
            System.out.println(temp);
        }
    }


}
