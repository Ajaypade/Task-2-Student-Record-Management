import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Add Student
    public void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(id, name, marks));
        System.out.println("Student Added Successfully......!\n");
    }

    // View Students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.......\n");
            return;
        }
        System.out.println("Student Records:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    // Update Student
    public void updateStudent() {
        System.out.print("Enter Student ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter New Name: ");
                String name = sc.nextLine();
                System.out.print("Enter New Marks: ");
                double marks = sc.nextDouble();

                s.setName(name);
                s.setMarks(marks);
                System.out.println("Student Updated Successfully......\n");
                return;
            }
        }
        System.out.println("Student not found!\n");
    }

    // Delete Student
    public void deleteStudent() {
        System.out.print("Enter Student ID to Delete: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student Deleted Successfully......!\n");
                return;
            }
        }
        System.out.println("Student not found.......!\n");
    }
}
