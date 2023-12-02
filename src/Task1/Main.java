package Task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat() {
            @Override
            public void Flyable() {

            }

            @Override
            public void Swimable() {

            }
        }; //экземпляр класса
        cat.setName("Barsik");
        System.out.println("Name animal: " + cat.getName() + ".");
        Dog dog = new Dog("Tuzic", new Chumka("Chumka"), "petr",
                LocalDate.of(2022, 03, 25)) {
            @Override
            public double getRunSpeed() {
                return super.getRunSpeed();
            }

            @Override
            public void Flyable() {

            }

            @Override
            public void Swimable() {

            }
        };// в скобках это состояние
        Dog dog1 = new Dog("Barbos", new Chumka("Chumka"), "sasha",
                LocalDate.of(2021, 10, 12)) {
            @Override
            public double getRunSpeed() {
                return super.getRunSpeed();
            }

            @Override
            public void Flyable() {

            }

            @Override
            public void Swimable() {

            }
        };
        System.out.println("Name animal: " + dog.getName() + ".");
        System.out.println("Name animal: " + dog1.getName() + ".");
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
//        dog.liveCycle();
     dog1.liveCycle();
        Nurse nurse = new Nurse();
        Nurse nurse1 = new Nurse();
        Doctor doctor = new Doctor("Doctor", LocalDate.of (1965,10,20));
        Doctor doctor1 = new Doctor("Doctor1", LocalDate.of (1985,07,10));
        System.out.println("Name doctor : " + doctor.getName() + ".");
        nurse.setName("Nurse");
        doctor.setName("Doctor");
        nurse1.setName("Nurse1");
        doctor1.setName("Doctor1");
        Fish fish = new Fish() {
            @Override
            public double getSwimSpeed() {
                return super.getSwimSpeed();
            }

            @Override
            public void Goable() {

            }

            @Override
            public void Flyable() {

            }
        };
        Goose goose = new Goose();
        Turtle turtle = new Turtle() {
            @Override
            public double getSwimSpeed() {
                return super.getSwimSpeed();
            }

            @Override
            public double getRunSpeed() {
                return super.getRunSpeed();
            }

            @Override
            public void Flyable() {

            }};
//        cat.fly();
//        fish.toGo();
//        fish.swim();
//        goose.waterFowl();
//        turtle.fly();
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatient(cat).addPatient(dog);
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoable());
      doctor.сabinetStaff1();
      doctor1.inspection();
//        dog.speak();
//        cat.speak();
//        cat.getRunSpeed();


    }


}
