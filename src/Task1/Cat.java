package Task1;

import java.time.LocalDate;

public abstract class Cat extends Animal implements Speakble, Goable{
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public void fly(){
        System.out.println("the " + getClass().getSimpleName() + " does not fly");
    }

    @Override
    public String getName() {
        return name;
    }



    @Override
    public void speak() {
        System.out.println("meow");
    }

    @Override
    public void run() {
        System.out.println("cat run");
    }

    @Override
    public void Goable() {
        System.out.println();
    }

    @Override
    public double getRunSpeed() {
return 5.5;
    }


}
