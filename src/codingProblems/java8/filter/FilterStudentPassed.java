package codingProblems.java8.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStudentPassed {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Aashish", 85),
                new Student("John", 45),
                new Student("Emily", 78),
                new Student("Michael", 30),
                new Student("Sophia", 92)
        );

        var passList = students.stream().filter(s -> s.marks>40).collect(Collectors.toList());
        System.out.println(passList);
        //passList.forEach(s -> System.out.println(s.name));
    }
}

class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name;
    }
}
