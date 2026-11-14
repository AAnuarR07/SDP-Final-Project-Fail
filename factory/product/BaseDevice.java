package factory.product;

public abstract class BaseDevice implements Device {
    protected final String name;
    protected boolean on;
    protected int level;

    protected BaseDevice(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return getType() + " '" + name + "' " + (on ? "ON" : "OFF") + " (level " + level + ")";
    }
}