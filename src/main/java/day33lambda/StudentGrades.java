package day33lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentGrades {

    /*
    Task: Prepare a report on students' grades, including calculating their average scores and identifying
    those who passed.

    We have a list of students, each with their scores. We want to:

    1. Calculate the average score for each student.
    2. Identify students who passed (e.g., those with an average score above 60).
    3. Produce a report listing each student's name, average score, and whether they passed.
     */

    public static void main(String[] args) {

        // Structured Programming: In the structured programming style, we’ll use a more procedural approach with mutable variables and loops to calculate averages and determine passing status.

        List<Student> students = List.of(  // List.of(...) is a factory method introduced in Java 9, which allows you to quickly create an immutable list. Once created, this list cannot be modified (i.e., no adding or removing elements). This method provides a concise way to initialize a list with a fixed set of elements.
                new Student("Alice", List.of(70, 80, 90)),  // Here, each Student object has a list of scores, and List.of(...) is used again to create an immutable list of integers representing scores.
                new Student("Bob", List.of(50, 60, 55)),
                new Student("Charlie", List.of(95, 85, 75))
        );

        Map<String, Double> averageScores = new HashMap<>();
        List<String> passedStudents = new ArrayList<>();

        // Calculate average scores and identify passing students
        for (Student student : students) {
            double sum = 0;
            for (int score : student.getScores()) {
                sum += score;
            }
            double average = sum / student.getScores().size();
            averageScores.put(student.getName(), average);

            // Check if the student passed
            if (average >= 60) {
                passedStudents.add(student.getName());
            }
        }

        // Output results
        System.out.println("Average Scores: " + averageScores);
        System.out.println("Students who passed: " + passedStudents);


        // FunctionalProgramming = Lambda



        // Step 1: Calculate average score using map function
        Map<String, Double> averageScoresLambda = students.stream()
                .collect(Collectors.toMap(
                        Student::getName,
                        student -> student.getScores().stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0)
                ));

        // Step 2: Identify those who passed
        List<String> passedStudentsLambda = averageScoresLambda.entrySet().stream()
                .filter(entry -> entry.getValue() >= 60)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // Output results
        System.out.println("Average Scores Lambda: " + averageScoresLambda);
        System.out.println("Students who passed: " + passedStudentsLambda);
    }


}
