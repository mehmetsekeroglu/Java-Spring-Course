package model;

import java.util.List;

public class Classroom {
    private Teacher teacher;
    private List<Student> students;
    private String location;
    private String name;

    public Classroom (){}

    public Classroom(Teacher teacher, List<Student> students, String location, String name) {
        this.teacher = teacher;
        this.students = students;
        this.location = location;
        this.name = name;
    }
}
