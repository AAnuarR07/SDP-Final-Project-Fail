package factory.product;

public class Light extends BaseDevice {
    public Light(String name) {
        super(name, 100);
    }

    @Override
    public String getType() {
        return "Light";
    }
}