package interviews;

//find the list of salary from Employee

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class SalaryFromEmployee {

    public static void main(String[] args) {
        Employee e1 = new Employee("Sadik", 1200);
        Employee e2 = new Employee("Sadan", 1000);
        Employee e3 = new Employee("Shahid", 1500);
        Employee e4 = new Employee("Shahid", 1700);

        List<Employee> employeeList = List.of(e1, e2, e3, e4);

        List<Integer> collect = employeeList.stream().map(Employee::getSalary).collect(Collectors.toList());

        List<Integer> collect1 = employeeList.stream().map(e -> e.getSalary()).collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(collect1);

        //Double the salary of each employee in the list using Stream

        List<Integer> doubleSalary = employeeList.stream().map(e -> e.getSalary() * 2).collect(Collectors.toList());
        System.out.println(doubleSalary);
    }


}
