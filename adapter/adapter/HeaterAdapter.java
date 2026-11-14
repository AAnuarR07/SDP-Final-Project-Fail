package adapter.adapter;

import adapter.adaptee.LegacyHeater;
import factory.product.Device;

public class HeaterAdapter implements Device {
    private final LegacyHeater heater;

    public HeaterAdapter(LegacyHeater heater) {
        this.heater = heater;
    }

    @Override
    public String getName() {
        return heater.getId();
    }

    @Override
    public String getType() {
        return "Heater";
    }

    @Override
    public boolean isOn() {
        return heater.isRunning();
    }

    @Override
    public int getLevel() {
        return heater.getHeat();
    }

    @Override
    public void turnOn() {
        heater.powerUp();
    }

    @Override
    public void turnOff() {
        heater.powerDown();
    }

    @Override
    public void setLevel(int level) {
        heater.setHeat(level);
    }

    @Override
    public String toString() {
        return "Heater '" + getName() + "' " + (isOn() ? "ON" : "OFF") + " (level " + getLevel() + ")";
    }
}