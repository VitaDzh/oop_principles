package abstraction.abstract_classes;

public class Samsung extends Phone implements Camera, Bluetooth{

    public Samsung() {
    }

    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    public static final String OS = "android";


    @Override
    public void call() {
        System.out.println("Sumsung calls");
    }

    @Override
    public void ring() {
        System.out.println("Samsung rings");
    }

    @Override
    public void text() {
        System.out.println("Samsung texts");
    }

    @Override
    public boolean isConvertible() {
        return false;
    }

    @Override
    public void takesPhoto() {
        System.out.println("Samsung takes photos");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Samsung connects to Bluetooth");
    }

}
