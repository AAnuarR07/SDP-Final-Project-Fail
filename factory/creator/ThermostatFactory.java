package factory.creator;

import factory.product.Device;
import factory.product.Thermostat;

public class ThermostatFactory extends DeviceFactory {
    @Override
    protected Device createDevice(String name) {
        return new Thermostat(name);
    }
}