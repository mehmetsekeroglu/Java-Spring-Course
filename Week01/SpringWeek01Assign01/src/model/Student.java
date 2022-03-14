package model;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Student(){

    }

    public Student(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}
