package codingProblems.java8.groupby.practice;

import java.util.*;
import java.util.stream.Collectors;

public class GroupEmployeeByAge {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Ashish", "IT", 30),
                new Employee("Adarsh", "IT", 27),
                new Employee("Tanmay", "IT", 30),
                new Employee("Richa", "HR", 29),
                new Employee("Prashansha", "HR", 27),
                new Employee("Shubham", "LIB", 29),
                new Employee("Shubham", "LIB", 29)
        );

        Comparator<String> custom = (s1, s2) -> {
            int lengthComp = Integer.compare(s2.length(), s1.length());
            if (lengthComp!=0) return lengthComp;
            return s2.compareTo(s1);
        };

        TreeMap<String, Set<Employee>> setTreeMap = employeeList.stream().collect(Collectors.groupingBy(e->e.dept, TreeMap::new, Collectors.toSet()));
        System.out.println(setTreeMap);
    }
}

class Employee{
    String name;
    String dept;
    int age;

    public Employee(String name, String dept, int age) {
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass()!=obj.getClass()) return false;

        Employee other = (Employee) obj;

        if (name == null) {
            if (other.name!=null) return false;
        } else if (!name.equals(other.name)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        return name!=null ? name.hashCode() : 0;
    }
}
