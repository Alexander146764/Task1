package Task1;

import java.time.LocalDate;

public abstract class Dog extends Animal implements Goable, Speakble {
    public Dog() {
        super();
    }
    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void speak() {
    }
    @Override
    public void run() {
        System.out.println("dog run");
    }

    @Override
    public void Goable() {
        System.out.println("dog run ");
    }
}
