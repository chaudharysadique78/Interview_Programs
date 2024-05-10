package interviews;

import java.util.*;
import java.util.stream.Collectors;

class Student {

    int roll;
    String name;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;

    }

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public Student(int roll, String name, String address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.roll + " " + this.name +" " +this.marks+" "+ this.address;
    }

   /* public String toString() {
        return this.roll + " " + this.name +" " +this.marks+" ";
    }*/


   /* public String toString() {
        return this.roll + " " + this.name +" "+ this.address;
    }*/


}

public class ListMap {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Sadik"));
        studentList.add(new Student(2, "Sadan"));


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Sarfaraz", "Mumbra"));
        students.add(new Student(4, "Ammar", "Andheri"));

        List<Student> collect = students.stream().filter(student -> "andheri".equalsIgnoreCase(student.getAddress())).collect(Collectors.toList());
        System.out.println(collect);

        Map<Integer, Student> collect1 = studentList.stream().collect(Collectors.toMap(Student::getRoll, student -> student));
        System.out.println(collect1);

        System.out.println("++++++++++++++++++++++++++++++++++");

        studentList.stream().forEach(student -> System.out.println(student.roll + " " + student.name));
        studentList.stream().forEach(student -> System.out.println(student));

        System.out.println("++++++++++++++++++++++++++++++++++");
        studentList.stream().forEach(System.out::println);

        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student(11, "Sadik"));
        map.put(2, new Student(21, "Sadan"));

        System.out.println();
        map.forEach((k, v) -> {
            System.out.println(v.roll + " " + v.name);
        });
        System.out.println();
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }


        // higest salary student

        List<Student> list = new ArrayList<>();
        list.add(new Student(10001, "ABC", 100));
        list.add(new Student(10002, "XYZ", 25));
        list.add(new Student(10003, "John", 100));
        list.add(new Student(10004, "Jock", 90));

        List<Student> collect2 = list.stream().max(Comparator.comparingInt(Student::getMarks)).stream().collect(Collectors.toList());
        System.out.println(collect2);
        Student student = list.stream().max(Comparator.comparingInt(Student::getMarks)).get();
        System.out.println("Max-Marks = "+list.stream().max(Comparator.comparingInt(Student::getMarks)).get().getMarks());

       Integer maxSalary = list.stream().map(Student::getMarks).sorted(Comparator.reverseOrder()).findFirst().get();
       System.out.println("MaxMarks : " +maxSalary);

       System.out.println(list.stream().map(e-> e.getMarks()).sorted(Comparator.reverseOrder()).findFirst().get());
    }
}
