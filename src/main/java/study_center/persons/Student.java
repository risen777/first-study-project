package study_center.persons;

import study_center.Program;

public class Student extends  Person {

    private Program sudentsProgram;

    public Student(String name, String surName) {


        super(name, surName);

    }

    public Program getSudentsProgram() {
        return sudentsProgram;
    }

    public void setSudentsProgram(Program sudentsProgram) {
        this.sudentsProgram = sudentsProgram;
    }
}
