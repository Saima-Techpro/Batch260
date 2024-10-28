package day33lambda;

import java.util.List;

public class Student {
    String name;
    List<Integer> scores;

    Student(String name, List<Integer> scores) {
        this.name = name;
        this.scores = scores;
    }

    // Getter for name and scores
    public String getName() { return name; }
    public List<Integer> getScores() { return scores; }
}
