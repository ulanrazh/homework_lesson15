package peaksoft;

import java.time.LocalDate;

public class Singer extends Person{
    private String bandName;

    //CONSTRUCTOR WITHOUT ARGUMENTS
    
    public Singer(String name, String designation, LocalDate dateOfBirth, String bandName) {
        super(name, designation, dateOfBirth);
        this.bandName = bandName;
    }
    public void singing() {
        System.out.println(getName() + " is singing");
    }
    public void playGuitar() {
        System.out.println(getName() + " can play on guitar");
    }

    //DEFINE GETTERS & SETTERS
    
    @Override
    public String toString() {
        return "Singer{"+
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", dateOfBirth=" + getDateOfBirth()+
                ", age=" + getAge() +
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
