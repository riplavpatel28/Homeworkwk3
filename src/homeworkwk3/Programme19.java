package homeworkwk3;

public class Programme19 {

    public static void main(String[] args) {
        Programme19 avgArrayProg19 = new Programme19();
        avgArrayProg19.avg();
    }

    private void avg() {

        int[] numericArray = {1, 2, 3, 4, 5};
        int result = 0;
        for (int temp : numericArray) {
            result = result + temp;
        }

        double avg = result/5;

        System.out.println("Avg =" + avg);

    }
}
