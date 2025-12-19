package codingProblems.java8.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumofSalariesbyDepartment {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("Alice", "HR", 50000),
                new Employees("Bob", "Engineering", 70000),
                new Employees("Charlie", "HR", 55000),
                new Employees("David", "Engineering", 80000),
                new Employees("Eve", "Marketing", 60000)
        );

        Map<String, Double> map = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.department, Collectors.summingDouble(e -> e.salary)));

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

