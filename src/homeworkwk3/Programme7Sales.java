package homeworkwk3;

import java.util.Scanner;

public class Programme7Sales {

    public static void main(String[] args) {
        Programme7Sales salesProg7 = new Programme7Sales();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Sales Id");
        int salesId = scan.nextInt();


        System.out.println("Enter Sellers Name");
        String sellerName = scan.next();


        System.out.println("Enter Sales amount");
        double salesAmount = scan.nextDouble();

        System.out.println("Enter Salary basic");
        double basicSalary = scan.nextDouble();
        salesProg7.calculateSales(salesId,sellerName,salesAmount,basicSalary);
    }

    private void calculateSales(int salesId, String sellerName, double salesAmount, double basicSalary) {
        double commission = calculateCommission(salesAmount);
        double finalSales = basicSalary + commission;
        System.out.println("Final Sales --- " + finalSales);
    }

    private double calculateCommission(double salesAmount) {
        if(salesAmount >= 50000){
            return (salesAmount * 35)/100;
        }else if(salesAmount >= 30000){
            return (salesAmount * 20)/100;
        }else if(salesAmount >= 20000){
            return (salesAmount * 10)/100;
        }else if(salesAmount >= 10000){
            return (salesAmount * 5)/100;
        }else {
            return (salesAmount * 2)/100;
        }
    }
}
