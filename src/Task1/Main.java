package Task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //экземпляр класса
        cat.setName("Barsik");
        System.out.println("Name animal: " + cat.getName() + ".");
        Dog dog = new Dog("Tuzic",new Chumka("Chumka") , "petr",
                LocalDate.of(2022, 03, 25) );// в скобках это состояние
        System.out.println("Name animal: " + dog.getName() + ".");
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        dog.liveCycle();
        Fish fish = new Fish();
        Goose goose = new Goose();
        Turtle turtle = new Turtle();
        cat.fly();
        fish.toGo();
        fish.swim();
        goose.waterFowl();
        turtle.fly();
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatient(cat).addPatient(dog);
        // System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoable());
    }

}
