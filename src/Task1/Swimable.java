package Task1;

public interface Swimable {
    String type = "Swimable";
    void swim();

    default double getSwimSpeed() {return 10.5;}

}
