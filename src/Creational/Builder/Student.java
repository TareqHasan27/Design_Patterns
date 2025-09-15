package Creational.Builder;

import Creational.Builder.StudentBuilder.StudentBuilder;

import java.util.List;

public class Student {
    int roll;
    String name;
    int year;
    String FatherName;
    String MotherName;
    List<String> Subjects;

    public Student(StudentBuilder builder) {
        this.roll = builder.roll;
        this.year = builder.year;
        this.FatherName = builder.FatherName;
        this.MotherName = builder.MotherName;
        this.name = builder.name;
        this.Subjects = builder.Subjects;
    }
    public String toString() {
        return STR."Roll: \{this.roll}, Name: \{this.name}, Year: \{this.year}, FatherName: \{this.FatherName}, MotherName: \{this.MotherName}, Subjects: \{this.Subjects.get(0)}\{this.Subjects.get(1)}\{this.Subjects.get(2)}";
    }
}
