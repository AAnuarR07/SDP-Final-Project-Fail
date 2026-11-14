package factory.product;

public interface Device {
    String getName();
    String getType();
    boolean isOn();
    int getLevel();
    void turnOn();
    void turnOff();
    void setLevel(int level);
}