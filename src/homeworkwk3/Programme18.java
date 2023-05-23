package homeworkwk3;

public class Programme18 {



    public static void main(String[] args) {
        Programme18  sumArrayProg18= new Programme18 ();
        sumArrayProg18.sum();
    }

    private void sum() {
        int[] numericArray = {1,2,3,4,5};

        int result = 0;
        for(int temp:numericArray){
            System.out.println("temp --"  + temp);
            result = result + temp;
            System.out.println("result ---" + result);
        }

    }
}



