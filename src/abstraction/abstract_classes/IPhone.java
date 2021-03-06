package abstraction.abstract_classes;

public class IPhone extends Phone implements Camera, Bluetooth {

    @Override
    public void takesPhoto() {
        System.out.println("Iphone takes photos");
    }

    public IPhone() {
    }

    public IPhone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    public static final String OS = "iOS";


    @Override
    public void call() {
        System.out.println("Iphone calls");
    }

    @Override
    public void ring() {
        System.out.println("Iphone rings");
    }

    @Override
    public void text() {
        System.out.println("Iphone texts");
    }

    @Override
    public boolean isConvertible() {
        return false;
    }


    @Override
    public void connectBluetooth() {
        System.out.println("IPhone connects to bluetooth");
    }
}
