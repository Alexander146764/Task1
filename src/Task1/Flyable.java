package Task1;

public interface Flyable {
    String type = "Flyable";
    void fly();

    default double getRunSpeed() {return 15.0;}
}
