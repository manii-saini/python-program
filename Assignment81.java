import java.util.*;

class Student {
    String name;
    int rollNo;
    double percentage;

    // Constructor
    public Student(String name, int rollNo, double percentage) {
        this.name = name;
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Percentage: " + percentage;
    }
}

public class Assignment81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Taking student details as input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();
            System.out.print("Enter Percentage: ");
            double percentage = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            students.add(new Student(name, rollNo, percentage));
        }

        // Sorting students by percentage in descending order
        students.sort((s1, s2) -> Double.compare(s2.percentage, s1.percentage));

        // Displaying sorted student details
        System.out.println("\nStudents sorted by percentage (Descending Order):");
        for (Student s : students) {
            System.out.println(s);
        }

        scanner.close();
    }
}