package peaksoft;

import java.time.LocalDate;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, LocalDate dateOfBirth, String companyName) {
        super(name, designation, dateOfBirth);
        this.companyName = companyName;
    }
    public void coding() {
        System.out.println(getName() + " is coding");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", dateOfBirth=" + getDateOfBirth()+
                ", age=" + getAge() +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
