package peaksoft;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Ulan","Auditor",
                LocalDate.of(1989,2,20));
        System.out.println(person);
        person.learn();
        person.walk();
        person.eat();

        System.out.println("______________");

        Programmer programmer = new Programmer("Bulan","Programmer",
                LocalDate.of(1997,2,20),"Peaksoft House");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();

        System.out.println("______________");

        Dancer dancer = new Dancer("Indira","Dancer",
                LocalDate.of(1999,3,30),"Modern Dance");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();

        System.out.println("______________");

        Singer singer = new Singer("Shahzoda","Singer",
                LocalDate.of(1985,5,25),"Uzbekistan National Team");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();

        System.out.println("______________");


    }
}
