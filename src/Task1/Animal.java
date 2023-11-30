package Task1;

import java.time.LocalDate;

public abstract class Animal {//абстракция класса
    protected String name;
    public Illness illness;
    private String ownerName;
    private LocalDate birthday;

    public Animal() {
    }
    public Animal(String name, Illness illness, String ownerName, LocalDate birthday) {//конструктор поведения
        this.name = name;
        this.illness = illness;
        this.ownerName = ownerName;
        this.birthday = birthday;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
//поведение объекта это все публичные методы
    public Illness getIllness() {
        return illness;
    }
    public void toWakeUp(){
        System.out.println("Animal wake up");

    }
    private void toWakeUp(String time){
        System.out.println(getClass().getSimpleName() + " wake up in " + time);}
    private void eat(){
        System.out.println(getClass().getSimpleName() + " go to eat ");}
    private void play(){
        System.out.println(getClass().getSimpleName() + " go to play ");}
    private void sleep(){
        System.out.println(getClass().getSimpleName() + " go to bed");}

    public void liveCycle(){
       toWakeUp("8.10");
       eat();
       play();
       sleep();
    }
    public void breathe(){
        System.out.println(getClass().getSimpleName() + ": breathe");
    }
    public void toGo(){
        System.out.println("the " + getClass().getSimpleName() + " is moving");}
    public void fly(){
        System.out.println("the " + getClass().getSimpleName() + " is flying");}
    public void swim(){
        System.out.println("the " + getClass().getSimpleName() + " swims");}
    public void waterFowl(){
        System.out.println(getClass().getSimpleName() + " can fly, swim and walk");}
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", illness=" + illness +
                ", ownerName='" + ownerName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public abstract void speak();

    public abstract void run();
}


