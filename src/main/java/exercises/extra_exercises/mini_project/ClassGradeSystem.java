package exercises.extra_exercises.mini_project;

import java.util.Scanner;

public class ClassGradeSystem {

    /**
     * Mini-Project — Class Grade System
     * 1. Store student names in an array.
     * 2. Store grades in a 5×3 matrix.
     * 3. Create methods to:
     *    - read grades from the user
     *    - print the grade matrix
     *    - calculate the average of a specific student
     *    - calculate the average of a specific subject
     *    - determine which student has the highest average
     */
    public static void main(String[] args) {

        String[] students = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};
        double[][] grades = new double[5][3];

        readGrades(students, grades);
        printGrades(students, grades);

        System.out.printf("%nAverage grade of student %.2f%n", studentAverage(grades, 0));
        System.out.printf("Best student: %s%n", bestStudent(grades, students));
        System.out.printf("Average subject %d é %s%n", 1, subjectAverage(grades, 0));
    }

    public static void readGrades(String[] students, double[][] grades) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter " + students[i] + " grades:");

            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("Subject " + (j + 1) + " grade: ");
                grades[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
    }

    public static void printGrades(String[] students, double[][] grades) {
        System.out.println("Grades Table: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + ": ");

            for (int j = 0; j < grades[i].length; j++) {
                System.out.printf("%.2f ", grades[i][j]);
            }
            System.out.println();
        }
    }

    public static double studentAverage(double[][] grades, int index) {
        double sum = 0;
        for (int j = 0; j < grades[index].length; j++) {
            sum += grades[index][j];
        }
        return sum / grades[index].length;
    }

    public static String bestStudent(double[][] grades, String[] students) {
        int bestIndex = 0;
        double bestAverage = studentAverage(grades, 0);

        for (int i = 1; i < students.length; i++) {
            double average = studentAverage(grades, i);
            if (average > bestAverage) {
                bestAverage = average;
                bestIndex = i;
            }
        }
        return students[bestIndex];
    }

    public static double subjectAverage(double[][] grades, int index) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i][index];
        }
        return sum / grades.length;
    }
}
