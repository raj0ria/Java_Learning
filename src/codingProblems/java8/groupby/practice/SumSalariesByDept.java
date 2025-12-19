package codingProblems.java8.groupby.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumSalariesByDept {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("Alice", "HR", 50000),
                new Employees("Bob", "Engineering", 70000),
                new Employees("Charlie", "HR", 55000),
                new Employees("David", "Engineering", 80000),
                new Employees("Eve", "Marketing", 60000)
        );

        var map = employees.stream().collect(Collectors.groupingBy(e -> e.department, Collectors.summingDouble(e -> e.salary)));
        System.out.println(map);
    }
}

class Employees {
    String name;
    String department;
    double salary;

    Employees(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name;
    }
}