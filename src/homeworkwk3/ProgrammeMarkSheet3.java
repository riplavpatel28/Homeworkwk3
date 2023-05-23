package homeworkwk3;

import java.util.Scanner;

/**Write a java program to input student Name, roll No, and three subjects Math, Science and
 English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 Input, Marks should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 _______________________________
 | |
 | Mark Sheet |
 |_______________________________|
 | Name : Jay |
 | Roll No: 08 |
 |_______________________________|
 | Subjects : Marks |
 |_______________________________|
 | Math : 98 |
 | Science : 90 |
 | English : 85 |
 |_______________________________|
 | Total : 273 |
 |_______________________________|
 | Percentage : 91.0 |
 | Result : Pass |
 | Grade : A+ |
 |_______________________________|
 *
 */

public class ProgrammeMarkSheet3 {

        public static void main(String[] args) {
            ProgrammeMarkSheet3 obj = new ProgrammeMarkSheet3();
            obj.studentmarksheet();

        }

        public void studentmarksheet() {//instance method
            Scanner scan = new Scanner(System.in);
            System.out.println (" _______________________________");
            System.out.println ("|                               |");
            System.out.println ("|          Mark Sheet           |");
            System.out.println ("|_______________________________|");
            System.out.println ("|    Name          :            |");
            String name = scan.nextLine();
            //System.out.print("           |");
            System.out.println   ("|    Roll Number   :            |");
            System.out.println ("|_______________________________|");
            int rollnumber = scan.nextInt();
            System.out.println ("|    Subject       :   Marks    |");
            System.out.println ("|    Math          :            |");
            int mathsMark = scan.nextInt();
            System.out.println ("|    Science       :            |");
            int scienceMark= scan.nextInt();
            System.out.println ("|    English       :            |");
            int englishMark = scan.nextInt();
            System.out.println ("|_______________________________|");
            int total = mathsMark +scienceMark + englishMark;
            System.out.println ("|Total            :"  + total+ "|");
            System.out.println("|_______________________________|");
            double percentage = total / 3;
            System.out.println("Percentage   :" + percentage);

            String result = passOrFail(percentage);
            System.out.println("Result       :" + result);

            String grade = resultGrade(percentage);
            System.out.println("Grade :" + grade);
        }

        public String passOrFail(double percentage) {
            boolean isPass = percentage >= 35;
            if (isPass) {
                return "Pass";
            } else {
                return "Fail";
            }
        }

        public String resultGrade(double percentage) {
            boolean isGrade80 = percentage >= 80;
            boolean isGrade60 = percentage >= 60;
            boolean isGrade50 = percentage >= 50;
            boolean isGrade35 = percentage >= 35;

            if (isGrade80) {
                return "A+";
            } else if (isGrade60) {
                return "A";
            } else if (isGrade50) {
                return "B";
            } else if (isGrade35) {
                return "C";
            }
            return "Fail";
        }

    }

