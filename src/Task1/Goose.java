package Task1;

import java.time.LocalDate;

public class Goose extends Animal implements Swimable,Flyable,Speakble,Goable{
    public Goose() {
        super();
    }

    public Goose(String name, Illness illness, String ownerName, LocalDate birthday) {
        super();
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
    public void Flyable() {

    }

    @Override
    public void Swimable() {

    }


    @Override
    public double getSwimSpeed() {
        return Swimable.super.getSwimSpeed();
    }

    @Override
    public double getRunSpeed() {
        return Flyable.super.getRunSpeed();
    }
}

