package peaksoft;

import java.time.LocalDate;
import java.time.Year;

public class Person {
    private String name;
    private String designation;
    private LocalDate dateOfBirth;
    private byte age;


    public Person() {
    }

    public Person(String name, String designation, LocalDate dateOfBirth) {
        this.name = name;
        this.designation = designation;
        this.dateOfBirth = dateOfBirth;
        this.age = (byte) (LocalDate.now().getYear() - dateOfBirth.getYear());
    }
    public void learn() {
        System.out.println(name + " is learning");;
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                '}';
    }
}

