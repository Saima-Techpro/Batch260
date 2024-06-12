package javapractice.miniproject2;

public class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public void showEnrollmentDetails() {
        System.out.println("Student: " + student.getName() + " is enrolled in Course: " + course.getName());
    }
}
