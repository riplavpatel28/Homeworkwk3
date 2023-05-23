package homeworkwk3;

/**Write a Java program to test if an array contains a specific value.
 * */

public class Programme20ArrayContains {
    public static void main(String[] args) {
        Programme20ArrayContains arrayContains20 = new Programme20ArrayContains();
        arrayContains20.isContains();
    }

    private void isContains() {
        int[] numericArray = {1, 2, 3, 4, 5};
        for (int temp : numericArray) {
            if(temp == 3){
                System.out.println("3 is available in array");
            }
        }
    }
}
