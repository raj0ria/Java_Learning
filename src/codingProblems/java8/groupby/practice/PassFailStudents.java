package codingProblems.java8.groupby.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PassFailStudents {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 40),
                new Student("Charlie", 90),
                new Student("David", 35),
                new Student("Eve", 75)
        );

        var map = studentList.stream().collect(Collectors.groupingBy(s -> s.score>=50 ? "Pass" : "Fail"));
        System.out.println(map);
    }
}

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name;
    }
}
