package Task1;

import java.time.LocalDate;

public abstract class Fish extends Animal implements Swimable{
    public Fish() {
        super();
    }

    public Fish(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public void toGo(){
        System.out.println("the " + getClass().getSimpleName() + " does not walk");
    }

    @Override
    public void speak() {

    }

    @Override
    public void run() {

    }
    @Override
    public void Swimable(){


}

   }

