package codingProblems.java8.filter;

import java.util.*;

public class FindEmployeeWithMaxSalary {
    public static void main(String[] args) {
        List<Employe> employees = new ArrayList<>(Arrays.asList(new Employe("Ashish", 10), new Employe("Ashu", 17)));


        Optional<Employe> maxSalaryEmp = Optional.ofNullable(employees.stream().max(Comparator.comparing(Employe::getSalary)).orElse(null));

        System.out.println(maxSalaryEmp);
    }
}

class Employe {
    private String name;
    private int salary;

    public Employe(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Employee{" + this.name + ", " + this.salary + "}";
    }
}
