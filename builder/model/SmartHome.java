package builder.model;

import factory.product.Device;
import java.util.List;

public class SmartHome {
    private final String name;
    private final String address;
    private final List<Device> devices;

    public SmartHome(String name, String address, List<Device> devices) {
        this.name = name;
        this.address = address;
        this.devices = devices;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Device> getDevices() {
        return devices;
    }
}