import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeTracker {

   
    private static double calculateAverage(ArrayList<Double> grades) {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

   
    private static double findHighestGrade(ArrayList<Double> grades) {
        if (grades.isEmpty()) return 0;
        return Collections.max(grades);
    }

    
    private static double findLowestGrade(ArrayList<Double> grades) {
        if (grades.isEmpty()) return 0;
        return Collections.min(grades);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Student Grade Tracker");
        System.out.println("----------------------");

        while (true) {
            System.out.print("Enter a grade (or type 'done' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                double grade = Double.parseDouble(input);
                if (grade < 0 || grade > 100) {
                    System.out.println("Please enter a grade between 0 and 100.");
                } else {
                    grades.add(grade);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric grade.");
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            double average = calculateAverage(grades);
            double highest = findHighestGrade(grades);
            double lowest = findLowestGrade(grades);

            System.out.println("Grades Summary:");
            System.out.println("Average Grade: " + String.format("%.2f", average));
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        }

        scanner.close();
    }
}
