package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CourseRunner {
    public static void main(String[] args) {

        // Create Course objects

        Course courseEngDay = new Course("Summer", "Eng_DayTime",110, 96 );
        Course courseEngNT = new Course("Winter", "Eng_NightTime",75, 97 );
        Course courseTrDay = new Course("Spring", "TR_DayTime",130, 98 );
        Course courseTrNT = new Course("Summer", "TR_NightTime",120, 95 );
//        System.out.println(courseEngDay);

        // What's the pre-requisite to use Lambda expressions?

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseEngDay);
        courseList.add(courseEngNT);
        courseList.add(courseTrDay);
        courseList.add(courseTrNT);

        System.out.println(courseList);

        /*
        [{season='Summer', courseName='Eng_DayTime', numOfStudents=110, avgScore=96},
        {season='Winter', courseName='Eng_NightTime', numOfStudents=75, avgScore=97},
        {season='Spring', courseName='TR_DayTime', numOfStudents=130, avgScore=88},
        {season='Summer', courseName='TR_NightTime', numOfStudents=120, avgScore=95}]

         */

        // Check if all avgScore is greater than 90
        // allMatch() works like AND operator
        boolean result1 = courseList.stream().allMatch(t -> t.getAvgScore() > 90);
        System.out.println("result1 = " + result1);  // true


        // Checks if all courses have more than 100 students
        boolean result2 = courseList.stream().allMatch(t-> t.getNumOfStudents() > 100);
        System.out.println("result2 = " + result2); // false

        // Check if any course name contains 'Eng'
        //anyMatch() works like OR operator
        boolean result3 = courseList.stream().anyMatch(t -> t.getCourseName().contains("Eng"));
        System.out.println("result3 = " + result3);  // true

        // Check that no course should have 'Fall' in it
        boolean result4 = courseList.stream().noneMatch(t -> t.getSeason().contains("Fall"));
        System.out.println("result4 = " + result4); // true

        // Print the name of the course which has highest avgScore
        // System.out.println(courseList.stream().max(Comparator.comparing(Course::getAvgScore)).get()); // {season='Spring', courseName='TR_DayTime', numOfStudents=130, avgScore=98}
        System.out.println(courseList.stream().max(Comparator.comparing(Course::getAvgScore)).get().getCourseName()); // TR_DayTime

        // Sort all the objects by avgScore and then put them in ascending order
        // print the 3rd object on the console
        List<Course> result5 = courseList.stream().
                                                sorted(Comparator.comparing(Course::getAvgScore)). // ascending order
                                                 skip(2).
                                                 limit(1).
                                                collect(Collectors.toList());
        System.out.println("thirdObject = " + result5);


        // Sort all the objects by avgScore and then put them in descending order
        // print the 2nd object on the console
        List<Course> result6 = courseList.stream().
                sorted(Comparator.comparing(Course::getAvgScore).reversed()). // descending order
                skip(1).
                limit(1).
                collect(Collectors.toList());
        System.out.println("second Object = " + result6);

         /*
        [{season='Summer', courseName='Eng_DayTime', numOfStudents=110, avgScore=96},
        {season='Winter', courseName='Eng_NightTime', numOfStudents=75, avgScore=97},
        {season='Spring', courseName='TR_DayTime', numOfStudents=130, avgScore=98},
        {season='Summer', courseName='TR_NightTime', numOfStudents=120, avgScore=95}]

         */

        // Count number of courses that are in English
        long result7 = courseList.stream().filter(t -> t.getCourseName().contains("Eng")).count();
        // Java asks to change the data type from int to long as a precaution what if the result exceeds the maximum limit

        System.out.println("num Of Eng Courses = " + result7); // 2

        // allMatch(), anyMatch() etc. are terminal functions which means we can use them at the end of expressions.
        // filter(), sorted() etc. are intermediate functions. They must be followed by terminal functions e.e. get() , count(). collect() etc.
    }
}
