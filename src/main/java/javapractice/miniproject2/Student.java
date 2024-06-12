package javapractice.miniproject2;

import java.util.ArrayList;

public class Student extends Person {
    private int studentId;
    private ArrayList<Course> courses;

    public Student(String name, String email, int studentId) {
        super(name, email);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    public void listCourses() {
        for (Course course : courses) {
            System.out.println("Course: " + course.getName() + ", Instructor: " + course.getInstructor());
        }
    }
}
