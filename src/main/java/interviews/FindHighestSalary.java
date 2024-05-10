package interviews;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmployeeSalary {
    Integer empId;
    String empName;
    Long salary;
    String email;
    Department department;


    EmployeeSalary(Integer empId,
                   String empName,
                   Long salary,
                   String email,
                   Department department) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.email = email;
        this.department = department;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

class Department {
    Integer deptId;
    String departmentName;

    Department(Integer deptId,
               String departmentName) {
        this.deptId = deptId;
        this.departmentName = departmentName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

public class FindHighestSalary {

    public static void main(String[] args) {

        Department hrDept = new Department(1, "HR");
        Department corpDept = new Department(2, "CORP");
        Department itDept = new Department(3, "IT");
        Department markDept = new Department(3, "MKT");
        Map<Integer, EmployeeSalary> empMap = new HashMap<>();
        empMap.put(1, new EmployeeSalary(1, "Harsh", 1000L, "Harsh@gmail.com", hrDept));
        empMap.put(2, new EmployeeSalary(2, "Harshita", 2000L, "Harshitha@gmail.com", hrDept));
        empMap.put(3, new EmployeeSalary(3, "Harshad", 1000L, "Harshad@gmail.com", hrDept));
        empMap.put(4, new EmployeeSalary(4, "Harshneeta", 4000L, "Harshneeta@gmail.com", hrDept));
        empMap.put(5, new EmployeeSalary(5, "Harshal", 2000L, "Harshal@gmail.com", hrDept));
        empMap.put(6, new EmployeeSalary(6, "Harshali", 3000L, "Harshali@gmail.com", hrDept));
        empMap.put(11, new EmployeeSalary(11, "Harshi", 1000L, "Harsh@gmail.com", corpDept));
        empMap.put(12, new EmployeeSalary(12, "Harshita", 2000L, "Harshitha@gmail.com", corpDept));
        empMap.put(13, new EmployeeSalary(13, "Harshad", 1000L, "Harshad@gmail.com", corpDept));
        empMap.put(14, new EmployeeSalary(14, "Harshneeta", 4000L, "Harshneeta@gmail.com", itDept));
        empMap.put(15, new EmployeeSalary(15, "Harshal", 2000L, "Harshal@gmail.com", itDept));
        empMap.put(16, new EmployeeSalary(16, "Harshali", 3000L, "Harshali@gmail.com", itDept));
        highestSalaryInEachDepartment(empMap);
        salaryListOfHR(empMap);
        salaryListForAllDept(empMap);

    }

    public static void highestSalaryInEachDepartment(Map<Integer, EmployeeSalary> empMap) {

        Map<String, List<EmployeeSalary>> empByDept = empMap.values().stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName()));

        Map<String, Long> maxSalaryByDept = empByDept.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream()
                        .mapToLong(EmployeeSalary::getSalary).max().orElse(0)));

        maxSalaryByDept.forEach((deptId, maxsalary) -> System.out.println("Higest salary in department " + deptId + " is " + maxsalary));

    }

    public static void salaryListOfHR(Map<Integer, EmployeeSalary> empMap){

        Map<String, List<EmployeeSalary>> empByDept = empMap.values().stream().collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName()));

        for (Map.Entry <String,List<EmployeeSalary>> entry :empByDept.entrySet()){
          if(entry.getKey().equalsIgnoreCase("HR")){
              System.out.println("Salary list of HR DEPT");
              System.out.println(entry.getValue().stream().map(e-> e.getSalary()).collect(Collectors.toList()));
          }
        }
    }

    public static  void salaryListForAllDept(Map<Integer, EmployeeSalary> empMap){
        Map<String, List<EmployeeSalary>> empByDept = empMap.values().stream().collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName()));
      /*  for(Map.Entry <String,List<EmployeeSalary>> entry: empByDept.entrySet()){
            System.out.println("Salary list of All DEPT");
            System.out.println(entry.getValue().stream().map(e-> e.getSalary()).collect(Collectors.toList()));
        }*/

    }

}
