package javapractice.miniproject2;

import java.util.ArrayList;

public class ManagementSystem {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Enrollment> enrollments;

    public ManagementSystem() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudent(Student student, Course course) {
        Enrollment enrollment = new Enrollment(student, course);
        enrollments.add(enrollment);
        student.enrollInCourse(course);
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Email: " + student.getEmail());
        }
    }

    public void listCourses() {
        for (Course course : courses) {
            System.out.println("Course: " + course.getName() + ", Instructor: " + course.getInstructor());
        }
    }

    public void listEnrollments() {
        for (Enrollment enrollment : enrollments) {
            enrollment.showEnrollmentDetails();
        }
    }
}
