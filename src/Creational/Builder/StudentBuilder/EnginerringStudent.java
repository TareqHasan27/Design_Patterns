package Creational.Builder.StudentBuilder;

import java.util.ArrayList;
import java.util.List;

public class EnginerringStudent extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> temp = new ArrayList<>();
        temp.add("DSA");
        temp.add("CN");
        temp.add("CA");
        this.Subjects = temp;
        return this;
    }
}
