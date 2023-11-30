package Task1;

public interface Goable {
    public static final String type = "Globale";

    void run();

    default double getRunSpeed() {
        return 5.5;
    }

}