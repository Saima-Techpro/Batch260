package javapractice.miniproject2;

public class StudentManagementSystem {
    public static void main(String[] args) {
        ManagementSystem system = new ManagementSystem();

        Student student1 = new Student("Alice", "alice@example.com", 1);
        Student student2 = new Student("Bob", "bob@example.com", 2);

        Course course1 = new Course("Mathematics", "Dr. Smith");
        Course course2 = new Course("Physics", "Dr. Johnson");

        system.addStudent(student1);
        system.addStudent(student2);

        system.addCourse(course1);
        system.addCourse(course2);

        system.listStudents();
        system.listCourses();

        System.out.println("\nEnrolling students in courses:");
        system.enrollStudent(student1, course1);
        system.enrollStudent(student2, course2);

        system.listEnrollments();

        System.out.println("\nListing courses for student1:");
        student1.listCourses();
    }

    /*
    Explanation of OOP Concepts
Classes and Objects:

Classes: Person, Student, Course, Enrollment, ManagementSystem
Objects: Instances of these classes created in the main method.
Inheritance:

Student inherits from Person, thus it gets all the properties and methods of Person.
Encapsulation:

Use of private fields and public methods to access and modify them in Person, Student, and Course classes.
Polymorphism:

Method overriding can be added if we have more specific behaviors for certain methods in subclasses.

     */
}
