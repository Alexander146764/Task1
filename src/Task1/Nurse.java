package Task1;

import java.time.LocalDate;

public class Nurse extends Human {

    public String setName;

    public Nurse() {
        super();
    }
    public Nurse(String name, LocalDate birthday) {
        super();
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getDate() {return birthDay;}

    @Override
    public void callsTheNextPatient(){
        System.out.println("the " + getClass().getSimpleName() + " calls the next patient.");}
    @Override
     public void сabinetStaff1(){
        System.out.println("the " + getClass().getSimpleName() + " cabinet staff №1.");}
    @Override
    public void сabinetStaff2(){
        System.out.println("the " + getClass().getSimpleName() + " cabinet staff №2.");}
    @Override
    public void purpose(){
        System.out.println("the " + getClass().getSimpleName() + " prescribes the appointment of treatment.");}

}