package ch.spring.week01.assignment01;

import model.Classroom;
import model.Speciality;
import model.Student;
import model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegistrationStarter {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        for (int index = 0; index < 10; index++) {
            Student newStudent = new Student("Ogrenci", String.valueOf(index), LocalDate.now());
            studentList.add(newStudent);
        }

        Teacher matTeacher = new Teacher("Mathy", "Teach", LocalDate.now(), Speciality.MATHEMATICS);
        Teacher engTeacher = new Teacher("Engly", "Lehr", LocalDate.now(), Speciality.ENGLISH);

        Classroom classMath = new Classroom(matTeacher, studentList, "Luzern", "H-110");
        Classroom classEng = new Classroom(engTeacher, studentList, "Zurich", "H-112");

    }
}
