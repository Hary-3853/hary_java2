public class MainApp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt the user to enter the student's name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter the student's marks
        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();

        // Create a Student object using the name and marks entered by the user
        Student student = new Student(name, marks);

        // Display the student's details
        student.displayDetails();

        // Calculate the grade based on the marks and display it
        String grade = GradeCalculator.calculateGrade(student.getMarks());
        System.out.println("Grade: " + grade);

        // Close the scanner object to free up resources
        scanner.close();
    }

    // Nested Student class to manage student data
    static class Student {
        private String name;  // Student's name
        private double marks; // Student's marks

        // Constructor to initialize the Student object
        public Student(String name, double marks) {
            this.name = name;
            this.marks = marks;
        }

        // Method to display the student's details
        public void displayDetails() {
            System.out.println("Student Name: " + name);
            System.out.println("Marks: " + marks);
        }

        // Getter method to access the private marks field
        public double getMarks() {
            return marks;
        }
    }

    // Nested GradeCalculator class to determine grades based on marks
    static class GradeCalculator {
        // Method to calculate grade based on the student's marks
        public static String calculateGrade(double marks) {
            if (marks >= 90) {
                return "A";  // Grade A for marks 90 and above
            } else if (marks >= 75) {
                return "B";  // Grade B for marks 75 to 89
            } else if (marks >= 50) {
                return "C";  // Grade C for marks 50 to 74
            } else {
                return "D";  // Grade D for marks below 50
            }
        }
    }
}