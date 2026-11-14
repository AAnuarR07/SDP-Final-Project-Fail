package factory.creator;

import factory.product.Device;

public abstract class DeviceFactory {
    protected abstract Device createDevice(String name);

    public Device create(String name) {
        Device device = createDevice(name);
        System.out.println("[Factory] Created " + device);
        return device;
    }
}