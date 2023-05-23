package homeworkwk3;

import java.util.Scanner;

public class ProgrammeWap5 {


    public void read() {
        double hra;
        double ta;
        double da;
        double pf;
        double grosssalary;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the employed ID");
        int empid = scanner.nextInt();
        System.out.println(" Enter employee name ");
        String empname = scanner.next();
        System.out.println("Enter the basic salary ");
        double basicsalary = scanner.nextDouble();
        hra = (basicsalary * 10 / 100);
        ta = (basicsalary * 8 / 100);
        da = (basicsalary * 9 / 100);
        pf = (basicsalary * 20 / 100);
        grosssalary = (basicsalary + hra + ta + da - pf);
        scanner.close();

        System.out.println("_______________");
        System.out.println("|             Salary Slip               |");
        System.out.println("|_____________|");
        System.out.println("|Employee Id          :" + empid + "               |");
        System.out.println("|Employee Name        :" + empname + "            |");
        System.out.println("|_____________|");
        System.out.println("| Basic Salary        :" + basicsalary + "          |");
        System.out.println("| HRA 10%             :" + hra + "           | ");
        System.out.println("| TA 8%               :" + ta + "           | ");
        System.out.println("| DA 9%               :" + da + "           | ");
        System.out.println("| PF-20&              :" + pf + "           | ");
        System.out.println("| ______________| ");
        System.out.println("| Gross Salary        :" + grosssalary + "          | ");
        System.out.println("|=======================================|");


    }

    public static void main(String[] args) {
        ProgrammeWap5 obj = new ProgrammeWap5();
        obj.read();


    }
}
