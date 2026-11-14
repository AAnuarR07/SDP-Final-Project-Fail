package builder.core;

import builder.model.SmartHome;
import factory.product.Device;
import java.util.ArrayList;
import java.util.List;

public class SmartHomeBuilder {
    private String name = "Unnamed Home";
    private String address = "Unknown";
    private final List<Device> devices = new ArrayList<>();

    public SmartHomeBuilder name(String name) {
        this.name = name;
        return this;
    }

    public SmartHomeBuilder address(String address) {
        this.address = address;
        return this;
    }

    public SmartHomeBuilder addDevice(Device device) {
        devices.add(device);
        return this;
    }

    public SmartHome build() {
        return new SmartHome(name, address, devices);
    }
}