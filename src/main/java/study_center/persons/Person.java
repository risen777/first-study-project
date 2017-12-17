package study_center.persons;

public abstract class Person {
    private  String name;
    private  String surName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
}
