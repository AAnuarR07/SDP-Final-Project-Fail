package adapter.adaptee;

public class LegacyHeater {
    private final String id;
    private boolean running;
    private int heat = 50;

    public LegacyHeater(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void powerUp() {
        running = true;
    }

    public void powerDown() {
        running = false;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public int getHeat() {
        return heat;
    }

    public boolean isRunning() {
        return running;
    }
}