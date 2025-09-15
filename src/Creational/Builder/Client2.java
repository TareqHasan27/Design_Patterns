import Creational.Builder.Director.Director;
import Creational.Builder.Student;
import Creational.Builder.StudentBuilder.EnginerringStudent;
import Creational.Builder.StudentBuilder.MBAstudent;

void main() {
    Director d1 = new Director(new EnginerringStudent());
    Director d2 = new Director(new MBAstudent());

    Student student = d1.createStudent();
    Student student2 = d2.createStudent();

    System.out.println(student.toString());
    System.out.println(student2.toString());

}