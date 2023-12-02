package Task1;

import java.time.LocalDate;

public abstract class Turtle extends Animal implements Goable, Swimable {
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

    @Override
    public void Goable() {

    }
    @Override
    public void Swimable() {

    }
}
