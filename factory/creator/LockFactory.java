package factory.creator;

import factory.product.Device;
import factory.product.Lock;

public class LockFactory extends DeviceFactory {
    @Override
    protected Device createDevice(String name) {
        return new Lock(name);
    }
}