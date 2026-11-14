package factory.product;

public class Thermostat extends BaseDevice {
    public Thermostat(String name) {
        super(name, 22);
    }

    @Override
    public String getType() {
        return "Thermostat";
    }
}