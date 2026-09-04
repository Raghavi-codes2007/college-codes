import java.util.Scanner;

public class CGPACalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== CGPA CALCULATOR =====");

        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        double totalGradePoints = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double gradePoint = scanner.nextDouble();

            totalGradePoints += gradePoint;
        }

        double cgpa = totalGradePoints / subjects;

        System.out.printf("Your CGPA is: %.2f%n", cgpa);

        if (cgpa >= 9.0) {
            System.out.println("Performance: Excellent");
        } else if (cgpa >= 8.0) {
            System.out.println("Performance: Very Good");
        } else if (cgpa >= 7.0) {
            System.out.println("Performance: Good");
        } else if (cgpa >= 6.0) {
            System.out.println("Performance: Average");
        } else {
            System.out.println("Performance: Needs Improvement");
        }

        scanner.close();
    }
}
