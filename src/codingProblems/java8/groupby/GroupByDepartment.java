package codingProblems.java8.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "Engineering"),
                new Employee("Charlie", "HR"),
                new Employee("David", "Engineering"),
                new Employee("Eve", "Marketing")
        );

        Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(e -> e.department));

        System.out.println(map);

        map.forEach((dept, emplist) -> {
            System.out.println(dept + " " + emplist.stream().map(e -> e.name).collect(Collectors.toList()));
        });
        //System.out.println(map);
    }
}

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}
