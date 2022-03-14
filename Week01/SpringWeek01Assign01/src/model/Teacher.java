package model;

import java.time.LocalDate;

public class Teacher {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private Speciality speciality;

    public Teacher (){

    }

    public Teacher(String firstName, String lastName, LocalDate birthDay, Speciality speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.speciality = speciality;
    }
}
