package interviews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {

    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.roll + " " + this.name;
    }
}

public class ListMap {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Sadik"));
        studentList.add(new Student(2, "Sadan"));

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
    }
}
