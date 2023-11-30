package Task1;

import java.time.LocalDate;

public class Turtle extends Animal {
    public Turtle() {
        super();
    }

    public Turtle(String name, Illness illness, String ownerName, LocalDate birthday) {
        super();
    }

    @Override
    public void fly() {
        System.out.println("the " + getClass().getSimpleName() + " does not fly");;
    }

    @Override
    public void speak() {

    }

    @Override
    public void run() {

    }
}
