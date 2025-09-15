package Creational.Builder.Director;

import Creational.Builder.Student;
import Creational.Builder.StudentBuilder.EnginerringStudent;
import Creational.Builder.StudentBuilder.StudentBuilder;

public class Director {
    StudentBuilder studentBuilder;
    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }
    public Student createStudent() {
        if(studentBuilder instanceof EnginerringStudent)
        {
            return  createEngineeringStudent();
        }
        return createMBAstudent();
    }
    private Student createEngineeringStudent() {
        return  studentBuilder.setRoll(12).setName("Tareq").setFatherName("MIzan").setMotherName("JOSNA").setSubjects().build();
    }
    private Student createMBAstudent() {
        return studentBuilder.setRoll(12).setName("Tareq").setSubjects().build();
    }
}
