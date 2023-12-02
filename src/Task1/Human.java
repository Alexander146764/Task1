package Task1;


import java.time.LocalDate;


public abstract class Human {
    protected String name;
    LocalDate birthDay;
    private LocalDate birthday;
    public Human() {
    }

    public void Human(String name, LocalDate birthday) {//конструктор поведения
        this.name = name;
        this.birthday = birthday;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setDate(LocalDate birthDay) {this.birthDay = birthDay;}
    public LocalDate getDate() {return birthDay;}

    public void сabinetStaff1(){
        System.out.println("the " + getClass().getSimpleName() + " cabinet staff №1.");}
    public void сabinetStaff2(){
        System.out.println("the " + getClass().getSimpleName() + " cabinet staff №2.");}
    public void callsTheNextPatient(){
        System.out.println("the " + getClass().getSimpleName() + " calls the next patient.");}
    public void inspection(){
        System.out.println("the " + getClass().getSimpleName() + " conducts an examination.");}
    public void dressing(){
        System.out.println("the " + getClass().getSimpleName() + " performs the dressing of the patient.");}
    public void purpose(){
        System.out.println("the " + getClass().getSimpleName() + " prescribes the appointment of treatment.");}
    public void woundTreatment(){
        System.out.println("the " + getClass().getSimpleName() + "  is treating the wound.");}

}
