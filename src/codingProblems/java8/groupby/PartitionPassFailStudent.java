package codingProblems.java8.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionPassFailStudent {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 40),
                new Student("Charlie", 90),
                new Student("David", 35),
                new Student("Eve", 75)
        );

        var map = studentList.stream()
                        .collect(Collectors.partitioningBy(e -> e.score>=50));
        var newmap = studentList.stream().collect(Collectors.groupingBy(e -> e.score>=50 ? "Pass" : "Fail"));

        System.out.println(newmap);
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
