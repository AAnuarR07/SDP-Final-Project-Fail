package factory.creator;

import factory.product.Device;
import factory.product.Light;

public class LightFactory extends DeviceFactory {
    @Override
    protected Device createDevice(String name) {
        return new Light(name);
    }
}