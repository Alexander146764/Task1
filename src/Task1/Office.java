package Task1;

public class Office extends Human {

    @Override
    public void сabinetStaff1(){
        System.out.println("the " + getClass().getSimpleName() + " cabinet staff №1.");}
    @Override
    public void callsTheNextPatient(){
        System.out.println("the " + getClass().getSimpleName() + " calls the next patient.");}
    @Override
    public void inspection(){
        System.out.println("the " + getClass().getSimpleName() + " conducts an examination.");}
    @Override
    public void dressing(){
        System.out.println("the " + getClass().getSimpleName() + " performs the dressing of the patient.");}
   @Override
    public void purpose(){
        System.out.println("the " + getClass().getSimpleName() + " prescribes the appointment of treatment.");}
}
