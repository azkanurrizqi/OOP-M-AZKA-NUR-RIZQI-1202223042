import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input student information
            System.out.println("Enter student name: ");
            String studentName = scanner.nextLine();
            System.out.println("Enter student ID: ");
            int studentId = scanner.nextInt();

            Student student = new Student(studentName, studentId);

            // Input teacher information
            System.out.println("Enter teacher name: ");
            scanner.nextLine(); // consume the leftover newline
            String teacherName = scanner.nextLine();
            System.out.println("Enter teacher ID: ");
            int teacherId = scanner.nextInt();

            Teacher teacher = new Teacher(teacherName, teacherId);

            // Input admin information
            System.out.println("Enter admin name: ");
            scanner.nextLine(); // consume the leftover newline
            String adminName = scanner.nextLine();
            System.out.println("Enter admin ID: ");
            int adminId = scanner.nextInt();

            Admin admin = new Admin(adminName, adminId);

            // Display details
            System.out.println("\nStudent Details: " + student.getUserDetails());
            System.out.println("Teacher Details: " + teacher.getUserDetails());
            System.out.println("Admin Details: " + admin.getUserDetails());

            // Enroll student in a course
            System.out.print("\nEnter a course for the student to enroll: ");
            scanner.nextLine(); // consume the leftover newline
            String courseForStudent = scanner.nextLine();
            student.enrollInCourse(courseForStudent);
            System.out.println("Student Details after enrolling in a course: " + student.getUserDetails());

            // Teach a class for the teacher
            System.out.print("\nEnter a course for the teacher to teach: ");
            String courseForTeacher = scanner.nextLine();
            teacher.teachClass(courseForTeacher);

            // Manage the system for the admin
            System.out.print("\nEnter a course for the admin to manage: ");
            String courseForAdmin = scanner.nextLine();
            admin.manageSystem(courseForAdmin);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}