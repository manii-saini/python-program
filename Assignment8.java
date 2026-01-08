import java.util.Arrays;
import java.util.Scanner;

class Student
 {
    private String name;
    private int rollNo;
    private double percentage;

    public Student(String name, int rollNo, double percentage) {
        this.name = name;
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void display(int rank) {
        System.out.println("Rank: " + rank + ", Name: " + name + ", Roll No: " + rollNo + ", Percentage: " + percentage);
    }
}
public class Assignment8
{

    public static void main(String[] args)
	 {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) 
	{
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            System.out.print("Percentage: ");
            double percentage = scanner.nextDouble();
            students[i] = new Student(name, rollNo, percentage);
        }
        scanner.close();

        Arrays.sort(students, (s1, s2) -> Double.compare(s2.getPercentage(), s1.getPercentage()));

        System.out.println("\nStudents ranked by percentage:");
        for (int i = 0; i < students.length; i++) {
            students[i].display(i + 1);
        }
    }
}
