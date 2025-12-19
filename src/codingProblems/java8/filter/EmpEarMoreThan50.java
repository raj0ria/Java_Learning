package codingProblems.java8.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpEarMoreThan50 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Aashish", 60000),
                new Employee("John", 45000),
                new Employee("Emily", 80000),
                new Employee("Michael", 30000)
        );

        var list = employees.stream().filter(e -> e.salary>50000).collect(Collectors.toList());

        list.forEach(e -> System.out.println(e.name));
        System.out.println(list);
    }
}

class Employee {
    String name;
    int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name;
    }
}
