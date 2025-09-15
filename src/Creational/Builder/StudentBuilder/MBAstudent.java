package Creational.Builder.StudentBuilder;

import java.util.ArrayList;
import java.util.List;

public class MBAstudent extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> temp = new ArrayList<>();
        temp.add("BUS");
        temp.add("ECO");
        temp.add("FIN");
        this.Subjects = temp;
        return this;
    }
}
