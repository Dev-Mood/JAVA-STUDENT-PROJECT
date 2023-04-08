import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark;
        String grade;

        do {
            System.out.print("Enter your mark out of 100: ");
            mark = scanner.nextInt();
            if (mark < 0 || mark > 100) {
                System.out.print("Re-enter a mark between 0 and 100: ");
                mark = scanner.nextInt();
            }
        } while (mark < 0 || mark > 100);

        if (mark >= 90) {
            grade = "A";
        } else if (mark >= 80) {
            grade = "B";
        } else if (mark >= 70) {
            grade = "C";
        } else if (mark >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("You have scored an " + grade + " grade.");
    }
}
