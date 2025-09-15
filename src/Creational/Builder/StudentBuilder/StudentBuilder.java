package Creational.Builder.StudentBuilder;

import Creational.Builder.Student;

import java.util.List;

public abstract class StudentBuilder {
    public int roll;
    public String name;
    public int year;
    public String FatherName;
    public String MotherName;
    public List<String> Subjects;

    public StudentBuilder setRoll(int roll) {
        this.roll = roll;
        return this;
    }
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setYear(int year) {
        this.year = year;
        return this;
    }
    public StudentBuilder setFatherName(String FatherName) {
        this.FatherName = FatherName;
        return this;
    }
    public StudentBuilder setMotherName(String MotherName) {
        this.MotherName = MotherName;
        return this;
    }
    public abstract StudentBuilder setSubjects();

    public Student build(){
        return  new Student(this);
    }
}
