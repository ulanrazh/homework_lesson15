package peaksoft;

import java.time.LocalDate;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, LocalDate dateOfBirth, String groupName) {
        super(name, designation, dateOfBirth);
        this.groupName = groupName;
    }
    public void dancing() {
        System.out.println(getName() + " is dancing");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", dateOfBirth=" + getDateOfBirth()+
                ", age=" + getAge() +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
