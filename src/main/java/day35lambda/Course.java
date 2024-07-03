package day35lambda;

public class Course {

    // Let's learn to use Lambda with the objects
    // POJO -> Plain Old Java Object

    /*
            A class that contains
        1) private variables (encapsulation)
        2) parameterized and non-parameterized constructors
        3) getters -To access private variables-
        4) setters -To modify private variables-
        5) toString() method -To return the content of the object in a readable format-

        is called a POJO class.

     */

    private String season;
    private String courseName;
    private int numOfStudents;
    private int avgScore;

    // Create parameterised and non-parameterised constructors
    public Course() {
    }

    public Course(String season, String courseName, int numOfStudents, int avgScore) {
        this.season = season;
        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.avgScore = avgScore;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", avgScore=" + avgScore +
                '}';
    }
}
