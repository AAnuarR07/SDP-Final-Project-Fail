package factory.product;

public class Lock extends BaseDevice {
    public Lock(String name) {
        super(name, 0);
    }

    @Override
    public String getType() {
        return "Lock";
    }
}