package Task1;

import java.time.LocalDate;

public class Doctor extends Human {

    public String setName;

    public Doctor() {
        super();
    }
    public Doctor(String name, LocalDate birthday) {
        super();
    }
    @Override
    public String getName() {
        return name;
    }

  @Override
    public LocalDate getDate() {return birthDay;}
   @Override
    public void сabinetStaff1(){
        System.out.println("the " + getClass().getSimpleName() + " cabinet staff №1.");}
    @Override
    public void сabinetStaff2(){
        System.out.println("the " + getClass().getSimpleName() + " cabinet staff №2.");}
    @Override
    public void purpose(){
        System.out.println("the " + getClass().getSimpleName() + " prescribes the appointment of treatment.");}
    @Override
    public void inspection(){
        System.out.println("the " + getClass().getSimpleName() + " conducts an examination.");}
    @Override
    public void dressing(){
        System.out.println("the " + getClass().getSimpleName() + " performs the dressing of the patient.");}
    @Override
    public void woundTreatment(){
        System.out.println("the " + getClass().getSimpleName() + "  is treating the wound.");}



}

