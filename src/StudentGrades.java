import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[] grades = new int[numberOfStudents];

        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
            total += grades[i];

            if (grades[i] > highest) {
                highest = grades[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        scanner.close();

        double average = (double) total / numberOfStudents;

        System.out.println("The average grade is: " + average);
        System.out.println("The highest grade is: " + highest);
        System.out.println("The lowest grade is: " + lowest);
    }
}