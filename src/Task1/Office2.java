package Task1;

public class Office2 extends Human {

    @Override
     public void сabinetStaff2(){
        System.out.println("the " + getClass().getSimpleName() + " cabinet staff №2.");}
    @Override
    public void callsTheNextPatient(){
        System.out.println("the " + getClass().getSimpleName() + " calls the next patient.");}
    @Override
    public void purpose(){
        System.out.println("the " + getClass().getSimpleName() + " prescribes the appointment of treatment.");}

    @Override
    public void woundTreatment(){
        System.out.println("the " + getClass().getSimpleName() + "  is treating the wound.");}
    @Override
    public void inspection(){
        System.out.println("the " + getClass().getSimpleName() + " conducts an examination.");}
}
